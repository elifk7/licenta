package com.axiel7.mydrobe.ui.outfit

import android.app.Activity.RESULT_OK
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.viewpager2.widget.ViewPager2
import com.axiel7.mydrobe.MyApplication
import com.axiel7.mydrobe.R
import com.axiel7.mydrobe.adapters.ViewPagerAdapter
import com.axiel7.mydrobe.databinding.OutfitItemAddBinding
import com.axiel7.mydrobe.models.*
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.transition.MaterialSharedAxis
import java.io.File
import java.net.URI


class OutfitAddFragment : BottomSheetDialogFragment() {
    private val outfitViewModel: OutfitViewModel by activityViewModels {
        OutfitViewModel.provideFactory(MyApplication.outfitRepository)
    }
    private val clothingViewModel: ClothingViewModel by activityViewModels {
        ClothingViewModel.provideFactory(MyApplication.clothesRepository)
    }
    private var _binding: OutfitItemAddBinding? = null
    private val binding get() = _binding!!
    private var isNewItem = false
    private lateinit var newItem: Outfit
    private lateinit var safeContext: Context
    private var currentPhotoPath: String = ""
    private lateinit var topViewPagerAdapter: ViewPagerAdapter
    private lateinit var bottomViewPagerAdapter: ViewPagerAdapter
    private lateinit var shoesViewPagerAdapter: ViewPagerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enterTransition = MaterialSharedAxis(MaterialSharedAxis.Z, true)
        returnTransition = MaterialSharedAxis(MaterialSharedAxis.Z, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        safeContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = OutfitItemAddBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        isNewItem = outfitViewModel.selectedItem.value == null
        if (isNewItem) {
            newItem = Outfit(name = "", top = "", bottom = "", shoes = "", data = "")
            outfitViewModel.selectItem(newItem)
        }


        val topUris = clothingViewModel.topPhotoUris
        val bottomUris = clothingViewModel.bottomPhotoUris
        val shoesUris = clothingViewModel.shoesPhotoUris

        binding.outfitApplyButton.setOnClickListener { saveItem() }
        binding.outfitCancelButton.setOnClickListener { dismiss() }
        if (!isNewItem) {
            binding.outfitDeleteButton.isEnabled = true
            binding.outfitDeleteButton.setOnClickListener {
                outfitViewModel.deleteOutfit(outfitViewModel.selectedItem.value!!)
                dismiss()
            }
        }


        outfitViewModel.selectedItem.observe(viewLifecycleOwner) {
            binding.nameOutfitTextEdit.setText(it?.name)
            if (it != null) {
                topViewPagerAdapter = ViewPagerAdapter(topUris)
                bottomViewPagerAdapter = ViewPagerAdapter(bottomUris)
                shoesViewPagerAdapter = ViewPagerAdapter(shoesUris)

                setUpViewPager()

                if(it.topPhotoUri != null){
                    binding.topViewPager.setCurrentItem(topUris.indexOf(it.topPhotoUri))
                }else{
                    binding.topViewPager.setCurrentItem(R.drawable.ic_hanger_24)
                }

                if(it.bottomPhotoUri != null){
                    binding.bottomViewPager.setCurrentItem(bottomUris.indexOf(it.bottomPhotoUri))
                }else{
                    binding.bottomViewPager.setCurrentItem(R.drawable.ic_hanger_24)
                }

                if(it.shoesPhotoUri != null){
                    binding.shoesViewPager.setCurrentItem(shoesUris.indexOf(it.shoesPhotoUri))
                }else{
                    binding.shoesViewPager.setCurrentItem(R.drawable.ic_hanger_24)
                }

                for (season in it.season) {
                    when (season) {
                        Season.WINTER -> binding.seasonChipGroup.check(R.id.outfit_winter_chip)
                        Season.SPRING -> binding.seasonChipGroup.check(R.id.outfit_spring_chip)
                        Season.SUMMER -> binding.seasonChipGroup.check(R.id.outfit_summer_chip)
                        Season.FALL -> binding.seasonChipGroup.check(R.id.outfit_fall_chip)
                        Season.NONE -> binding.seasonChipGroup.clearCheck()
                    }
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 1 && resultCode == RESULT_OK) {
            if (outfitViewModel.selectedItem.value?.topPhotoUri != null) {
                File(URI.create(outfitViewModel.selectedItem.value?.topPhotoUri!!))
            }
            if (outfitViewModel.selectedItem.value?.bottomPhotoUri != null) {
                File(URI.create(outfitViewModel.selectedItem.value?.bottomPhotoUri!!))
            }
            if (outfitViewModel.selectedItem.value?.shoesPhotoUri != null) {
                File(URI.create(outfitViewModel.selectedItem.value?.shoesPhotoUri!!))
            }
            outfitViewModel.selectedItem.value?.topPhotoUri = currentPhotoPath
            outfitViewModel.selectedItem.value?.bottomPhotoUri = currentPhotoPath
            outfitViewModel.selectedItem.value?.shoesPhotoUri = currentPhotoPath
            outfitViewModel.selectItem(outfitViewModel.selectedItem.value)
        }
    }

    private fun saveItem() {
        val name = binding.nameOutfitTextEdit.text.toString()
        val season = mutableListOf<Season>()
        val checkedSeasons = binding.seasonChipGroup.checkedChipIds
        val topUris = clothingViewModel.topPhotoUris
        val bottomUris = clothingViewModel.bottomPhotoUris
        val shoesUris = clothingViewModel.shoesPhotoUris
        val date = binding.simpleDatePicker.dayOfMonth.toString() + "." + (binding.simpleDatePicker.month + 1).toString() + "." + binding.simpleDatePicker.year
        if (checkedSeasons.isEmpty()) {
            season.add(Season.NONE)
        } else {
            for (id in checkedSeasons) {
                when (id) {
                    R.id.outfit_winter_chip -> season.add(Season.WINTER)
                    R.id.outfit_spring_chip -> season.add(Season.SPRING)
                    R.id.outfit_summer_chip -> season.add(Season.SUMMER)
                    R.id.outfit_fall_chip -> season.add(Season.FALL)
                }
            }
        }
        outfitViewModel.selectedItem.value?.name = name
        outfitViewModel.selectedItem.value?.season = season
        outfitViewModel.selectedItem.value?.topPhotoUri = topUris.get(binding.topViewPager.currentItem)
        outfitViewModel.selectedItem.value?.bottomPhotoUri = bottomUris.get(binding.bottomViewPager.currentItem)
        outfitViewModel.selectedItem.value?.shoesPhotoUri = shoesUris.get(binding.shoesViewPager.currentItem)
        outfitViewModel.selectedItem.value?.data = date
        outfitViewModel.selectItem(outfitViewModel.selectedItem.value)
        if (isNewItem) {
            outfitViewModel.addOutfit(outfitViewModel.selectedItem.value!!)
        } else {
            outfitViewModel.updateOutfit(outfitViewModel.selectedItem.value!!)
        }
        dismiss()
    }

    override fun onDestroy() {
        super.onDestroy()
        outfitViewModel.selectItem(null)
    }

    private fun setUpViewPager() {

        binding.topViewPager.adapter = topViewPagerAdapter
        binding.bottomViewPager.adapter = bottomViewPagerAdapter
        binding.shoesViewPager.adapter = shoesViewPagerAdapter

        //set the orientation of the viewpager using ViewPager2.orientation
        binding.topViewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.bottomViewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.shoesViewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
    }
}
