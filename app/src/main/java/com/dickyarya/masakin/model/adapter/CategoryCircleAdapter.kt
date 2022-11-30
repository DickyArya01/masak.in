package com.dickyarya.masakin.model.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dickyarya.masakin.databinding.ComponentCircleCategoryBinding
import com.dickyarya.masakin.model.data.CategoryData

class CategoryCircleAdapter(private val listData: List<CategoryData>): RecyclerView.Adapter<CategoryCircleAdapter.ViewHolder>() {
    class ViewHolder(itemView: ComponentCircleCategoryBinding): RecyclerView.ViewHolder(itemView.root) {
        private val binding = itemView

        fun bind(data: CategoryData){
            with(binding){
                tvCategory.text = data.categoryName
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = ComponentCircleCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listData[position])
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}