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
import com.axiel7.mydrobe.models.*


class ClothingAdapter(private val context: Context,
                      private val onClickListener: (View, Clothing) -> Unit) :
    RecyclerView.Adapter<ClothingAdapter.ViewHolder>() {

    private var mList: List<Clothing>? = listOf()

    fun setData(list: List<Clothing>) {
        mList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemClothingBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mList?.get(position)!!
        holder.itemBinding.name.text = item.name
        holder.itemBinding.price.text = item.price.toString()

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

        if (item.photoUri != null) {
            holder.itemBinding.image.load(item.photoUri) {
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

        holder.itemBinding.topDrawingIcon.visibility = View.GONE
        holder.itemBinding.bottomDrawingIcon.visibility = View.GONE
        holder.itemBinding.shoesDrawingIcon.visibility = View.GONE

        for (type in item.type){
            when(type){
                Category.TOP -> holder.itemBinding.topDrawingIcon.visibility = View.VISIBLE
                Category.BOTTOM -> holder.itemBinding.bottomDrawingIcon.visibility = View.VISIBLE
                Category.SHOES -> holder.itemBinding.shoesDrawingIcon.visibility = View.VISIBLE
                Category.NONE -> {
                    holder.itemBinding.topDrawingIcon.visibility = View.GONE
                    holder.itemBinding.bottomDrawingIcon.visibility = View.GONE
                    holder.itemBinding.bottomDrawingIcon.visibility = View.GONE
                }
            }
        }

        holder.itemBinding.cottonIcon.visibility = View.GONE
        holder.itemBinding.woolIcon.visibility = View.GONE
        holder.itemBinding.denimIcon.visibility = View.GONE
        holder.itemBinding.leatherIcon.visibility = View.GONE
        for (material in item.material){
            when(material){
                Materials.COTTON -> holder.itemBinding.cottonIcon.visibility = View.VISIBLE
                Materials.DENIM -> holder.itemBinding.denimIcon.visibility = View.VISIBLE
                Materials.LEATHER -> holder.itemBinding.leatherIcon.visibility = View.VISIBLE
                Materials.WOOL -> holder.itemBinding.woolIcon.visibility = View.VISIBLE
                Materials.NONE -> {
                    holder.itemBinding.cottonIcon.visibility = View.GONE
                    holder.itemBinding.woolIcon.visibility = View.GONE
                    holder.itemBinding.denimIcon.visibility = View.GONE
                    holder.itemBinding.leatherIcon.visibility = View.GONE
                }
            }
        }

        holder.itemBinding.winterIcon.visibility = View.GONE
        holder.itemBinding.springIcon.visibility = View.GONE
        holder.itemBinding.summerIcon.visibility = View.GONE
        holder.itemBinding.fallIcon.visibility = View.GONE
        for (season in item.seasons) {
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

        holder.itemBinding.favoriteIcon.visibility = View.GONE
        holder.itemBinding.removeFavoriteIcon.visibility = View.GONE

        if (item.isFavorite){
            holder.itemBinding.favoriteIcon.visibility = View.VISIBLE
            holder.itemBinding.removeFavoriteIcon.visibility = View.GONE
        }else{
            holder.itemBinding.favoriteIcon.visibility = View.GONE
            holder.itemBinding.removeFavoriteIcon.visibility = View.VISIBLE
        }


        holder.itemView.setOnClickListener { view ->
            onClickListener(view, item)
        }
    }

    override fun getItemCount(): Int {
        return mList?.size ?: 0
    }

    class ViewHolder(var itemBinding: ItemClothingBinding) :
        RecyclerView.ViewHolder(itemBinding.root)

}