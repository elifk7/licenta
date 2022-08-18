package com.axiel7.mydrobe.ui.outfit

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.axiel7.mydrobe.MainActivity
import com.axiel7.mydrobe.MyApplication
import com.axiel7.mydrobe.R
import com.axiel7.mydrobe.databinding.FragmentOutfitBinding
import com.axiel7.mydrobe.models.OutfitViewModel
import com.axiel7.mydrobe.ui.home.HomeFragment
import com.axiel7.mydrobe.utils.SharedPrefsHelpers
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.axiel7.mydrobe.adapters.OutfitAdapter
class OutfitFragment: Fragment() {

    private lateinit var adapter: OutfitAdapter
    private lateinit var outfitViewModel: OutfitViewModel
    private lateinit var safeContext: Context
    private val sharedPrefs = SharedPrefsHelpers.instance!!
    private var _binding: FragmentOutfitBinding? = null
    private val binding get() = _binding!!
    private var sort: String = "id"
    private var sortId: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sortId = sharedPrefs.getInt("collectionSort", 0)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        outfitViewModel = ViewModelProvider(this,
            OutfitViewModel.provideFactory(MyApplication.outfitRepository))
            .get(OutfitViewModel::class.java)
        _binding = FragmentOutfitBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = OutfitAdapter(safeContext,
            onClickListener = { _, item -> (activity as MainActivity).openDetails(item) }
        )

        binding.outfitList.adapter = adapter
        binding.outfitList.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                if (dy > 0) {
                    //scroll down
                    (parentFragment as HomeFragment).hideFab()
                } else if (dy < 0) {
                    //scroll up
                    (parentFragment as HomeFragment).showFab()
                }
            }
        })

        updateSort(sortId)
        outfitViewModel.setOrder(sort)

        outfitViewModel.outfits.observe(viewLifecycleOwner, {
            adapter.setData(it)
        })

    }

    fun sortItems() {
        val items = arrayOf(getString(R.string.recently_added), getString(R.string.name))
        MaterialAlertDialogBuilder(safeContext)
            .setTitle(getString(R.string.sort_by))
            .setNeutralButton(getString(R.string.cancel)) { _, _ -> }
            .setPositiveButton(getString(R.string.ok)) { _, _ ->
                outfitViewModel.setOrder(sort)
            }
            .setSingleChoiceItems(items, sortId) { _, which ->
                updateSort(which)
            }
            .show()
    }

    private fun updateSort(id: Int) {
        when (id) {
            0 -> {
                sort = "id"
                sortId = 0
                sharedPrefs.saveInt("collectionSort", 0)
            }
            1 -> {
                sort = "name"
                sortId = 1
                sharedPrefs.saveInt("collectionSort", 1)
            }
            else -> {
                sort = "id"
                sortId = 0
                sharedPrefs.saveInt("collectionSort", 0)
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        safeContext = context
    }
}