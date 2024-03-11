package com.example.bloomxml.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bloomxml.data.ListCardItem
import com.example.bloomxml.R
import com.example.bloomxml.databinding.ItemVerticalCardBinding

class VerticalListAdapter(
    private val data: List<ListCardItem>
): RecyclerView.Adapter<VerticalListAdapter.VerticalListViewHolder>() {

    class VerticalListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val plantImage = itemView.findViewById<ImageView>(R.id.imageView)
        val plantName = itemView.findViewById<TextView>(R.id.textViewPlantName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemVerticalCardBinding.inflate(inflater, parent, false)
        return VerticalListViewHolder(binding.root)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: VerticalListViewHolder, position: Int) {
        holder.plantImage.setImageResource(data[position].resId)
        holder.plantName.text = data[position].caption
    }
}