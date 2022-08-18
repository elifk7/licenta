package com.axiel7.mydrobe.adapters

import android.content.Context
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.updateMargins
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.size.Scale
import com.axiel7.mydrobe.R
import com.axiel7.mydrobe.databinding.ItemClothingBinding
import com.axiel7.mydrobe.models.Outfit
import com.axiel7.mydrobe.models.Season

class OutfitAdapter (private val context: Context,
                     private val onClickListener: (View, Outfit) -> Unit) :
    RecyclerView.Adapter<OutfitAdapter.ViewHolder>(){

    private var outfitList: List<Outfit>? = listOf()

    fun setData(list: List<Outfit>) {
        outfitList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OutfitAdapter.ViewHolder {
        val binding = ItemClothingBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return OutfitAdapter.ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OutfitAdapter.ViewHolder, position: Int) {
        val item = outfitList?.get(position)!!
        holder.itemBinding.name.text = item.name


        val params = holder.itemView.layoutParams as ViewGroup.MarginLayoutParams
        when (position) {
            itemCount, (itemCount - 1) -> { //last items
                val bottomDp = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 64F, context.resources.displayMetrics).toInt()
                params.updateMargins(bottom = bottomDp)
            }
            else -> {
                val eightDp = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 8F, context.resources.displayMetrics).toInt()
                params.setMargins(eightDp, eightDp, eightDp, eightDp)
            }
        }
        holder.itemView.layoutParams = params

        if (item.topPhotoUri != null) {
            holder.itemBinding.image.load(item.topPhotoUri) {
                placeholder(R.drawable.ic_hanger_24)
                error(R.drawable.ic_hanger_24)
                scale(Scale.FILL)
            }
        } else {
            holder.itemBinding.image.load(R.drawable.ic_hanger_24) {
                placeholder(R.drawable.ic_hanger_24)
                error(R.drawable.ic_hanger_24)
            }
        }

        if (item.bottomPhotoUri != null) {
            holder.itemBinding.image.load(item.bottomPhotoUri) {
                placeholder(R.drawable.ic_hanger_24)
                error(R.drawable.ic_hanger_24)
                scale(Scale.FILL)
            }
        } else {
            holder.itemBinding.image.load(R.drawable.ic_hanger_24) {
                placeholder(R.drawable.ic_hanger_24)
                error(R.drawable.ic_hanger_24)
            }
        }

        if (item.shoesPhotoUri != null) {
            holder.itemBinding.image.load(item.shoesPhotoUri) {
                placeholder(R.drawable.ic_hanger_24)
                error(R.drawable.ic_hanger_24)
                scale(Scale.FILL)
            }
        } else {
            holder.itemBinding.image.load(R.drawable.ic_hanger_24) {
                placeholder(R.drawable.ic_hanger_24)
                error(R.drawable.ic_hanger_24)
            }
        }

        holder.itemBinding.winterIcon.visibility = View.GONE
        holder.itemBinding.springIcon.visibility = View.GONE
        holder.itemBinding.summerIcon.visibility = View.GONE
        holder.itemBinding.fallIcon.visibility = View.GONE
        for (season in item.season) {
            when (season) {
                Season.WINTER -> holder.itemBinding.winterIcon.visibility = View.VISIBLE
                Season.SPRING -> holder.itemBinding.springIcon.visibility = View.VISIBLE
                Season.SUMMER -> holder.itemBinding.summerIcon.visibility = View.VISIBLE
                Season.FALL -> holder.itemBinding.fallIcon.visibility = View.VISIBLE
                Season.NONE -> {
                    holder.itemBinding.winterIcon.visibility = View.GONE
                    holder.itemBinding.springIcon.visibility = View.GONE
                    holder.itemBinding.summerIcon.visibility = View.GONE
                    holder.itemBinding.fallIcon.visibility = View.GONE
                }
            }
        }

        holder.itemView.setOnClickListener { view ->
            onClickListener(view, item)
        }
    }

    override fun getItemCount(): Int {
        return outfitList?.size ?: 0
    }

class ViewHolder(var itemBinding: ItemClothingBinding) :
    RecyclerView.ViewHolder(itemBinding.root)


}