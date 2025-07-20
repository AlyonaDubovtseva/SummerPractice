package com.example.homework2.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework2.databinding.ItemLayoutBinding
import com.example.homework2.model.ItemModel
import com.example.homework2.utils.DataGenerator

class ItemsAdapter(
    private val items: List<ItemModel>,
    private val onItemClick: (ItemModel) -> Unit
) : RecyclerView.Adapter<ItemsAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        with(holder.binding) {
            itemImage.setImageResource(item.imageRes)
            itemTitle.text = item.title
            itemDescription.text = item.description

            root.setOnClickListener { onItemClick(item) }

            itemImage.setOnClickListener {
                item.imageRes = DataGenerator.images.random()
                itemImage.setImageResource(item.imageRes)
            }
        }
    }

    override fun getItemCount() = items.size
}