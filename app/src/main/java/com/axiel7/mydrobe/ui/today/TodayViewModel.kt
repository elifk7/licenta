package com.axiel7.mydrobe.ui.today

import androidx.lifecycle.*
import com.axiel7.mydrobe.models.Outfit
import com.axiel7.mydrobe.repository.OutfitRepository

class TodayViewModel(private val outfitRepository: OutfitRepository) : ViewModel() {

    private val _order = MutableLiveData("id")
    val outfits: LiveData<List<Outfit>> = Transformations.switchMap(_order) {
        outfitRepository.getOutfits(it).asLiveData()
    }

    fun setOrder(sort: String) {
        _order.postValue(sort)
    }


    companion object {
        fun provideFactory(
            outfitRepository: OutfitRepository
        ) : ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return TodayViewModel(outfitRepository) as T
            }
        }
    }

}