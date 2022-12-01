package com.dickyarya.masakin.model.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dickyarya.masakin.databinding.ComponentItemSliderBinding
import com.dickyarya.masakin.model.data.ImageData

class ImageSliderAdapter(private var listData: List<ImageData>): RecyclerView.Adapter<ImageSliderAdapter.ViewHolder>() {
    class ViewHolder (itemView: ComponentItemSliderBinding): RecyclerView.ViewHolder(itemView.root){
        private val binding = itemView

        fun bind(data: ImageData){
            with(binding){
                Glide.with(itemView)
                    .load(data.imageUrl)
                    .into(ivSlider)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = ComponentItemSliderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listData[position])
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}