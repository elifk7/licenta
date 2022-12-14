package com.axiel7.mydrobe.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.app.ShareCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.axiel7.mydrobe.MainActivity
import com.axiel7.mydrobe.MyApplication
import com.axiel7.mydrobe.R
import com.axiel7.mydrobe.databinding.FragmentHomeBinding
import com.axiel7.mydrobe.models.ClothingViewModel
import com.axiel7.mydrobe.models.Season
import com.axiel7.mydrobe.ui.collection.CollectionFragment
import com.axiel7.mydrobe.ui.outfit.OutfitFragment
import com.axiel7.mydrobe.ui.today.TodayFragment
import com.axiel7.mydrobe.utils.CalendarHelper
import com.github.dhaval2404.colorpicker.util.setVisibility
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.tabs.TabLayoutMediator
import com.google.android.material.transition.MaterialFadeThrough

class HomeFragment : Fragment() {

    private lateinit var safeContext: Context
    private val season = CalendarHelper.getSeason()
    private val clothingViewModel: ClothingViewModel by activityViewModels {
        ClothingViewModel.provideFactory(MyApplication.clothesRepository)
    }
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        exitTransition = MaterialFadeThrough()
        //reenterTransition = MaterialSharedAxis(MaterialSharedAxis.Z, false)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.homeViewPager.adapter = TabViewPagerAdapter(childFragmentManager, lifecycle)

        TabLayoutMediator(binding.homeTabLayout, binding.homeViewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = getString(CalendarHelper.getSeasonName(season))
                    tab.icon = ContextCompat.getDrawable(safeContext, getSeasonIcon(season))
                }
                1 -> {
                    tab.text = getString(R.string.title_collection)
                    tab.icon = ContextCompat.getDrawable(safeContext, R.drawable.ic_hanger_alt_24)
                }
                2 -> {
                    tab.text = getString(R.string.title_outfits)
                    tab.icon = ContextCompat.getDrawable(safeContext, R.drawable.ic_hanger_alt_24)
                }
            }
        }.attach()

        binding.homeBottomAppbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.search -> {
                    findNavController().navigate(R.id.action_homeFragment_to_searchFragment)
                    true
                }
                R.id.sort -> {
                    openSortOptions()
                    true
                }
                else -> false
            }
        }

        setupBottomSheet()


    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        safeContext = context
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun openSortOptions() {
        when (binding.homeViewPager.currentItem) {
            0 -> (childFragmentManager.findFragmentByTag("f0") as TodayFragment).sortItems()
            1 -> (childFragmentManager.findFragmentByTag("f1") as CollectionFragment).sortItems()
            2 -> (childFragmentManager.findFragmentByTag("f2") as OutfitFragment).sortItems()
        }
    }

    private fun setupBottomSheet() {
        val bottomSheet = BottomSheetDialog(safeContext).apply {
            setContentView(R.layout.bottom_sheet_main)
        }
        val share = bottomSheet.findViewById<TextView>(R.id.action_share)
        share?.setOnClickListener {
            ShareCompat.IntentBuilder(safeContext)
                    .setType("text/plain")
                    .setChooserTitle("")
                    .setText("Outfit Planner is a great app!")
                    .startChooser()
            bottomSheet.dismiss()
        }
        val settings = bottomSheet.findViewById<TextView>(R.id.action_settings)
        settings?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_settingsFragment)
            bottomSheet.dismiss()
        }
        binding.homeBottomAppbar.setNavigationOnClickListener { bottomSheet.show() }
    }

    private fun getSeasonIcon(season: Season): Int {
        return when (season) {
            Season.SUMMER -> R.drawable.ic_summer_24
            Season.SPRING -> R.drawable.ic_spring_24
            Season.FALL -> R.drawable.ic_fall_24
            Season.WINTER -> R.drawable.ic_winter_24
            else -> R.drawable.ic_spring_24
        }
    }

    class TabViewPagerAdapter(fm: FragmentManager, lf: Lifecycle) : FragmentStateAdapter(fm, lf) {
        override fun getItemCount(): Int = PAGE_COUNT

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> TodayFragment()
                1 -> CollectionFragment()
                2 -> OutfitFragment()
                else -> TodayFragment()
            }
        }
    }

    companion object {
        const val PAGE_COUNT = 3
    }
}