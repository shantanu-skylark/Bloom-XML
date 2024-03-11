package com.example.bloomxml.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bloomxml.data.ListCardItem
import com.example.bloomxml.R
import com.example.bloomxml.databinding.ItemHorizontalCardBinding

class HorizontalListAdapter(
    private val data: List<ListCardItem>
): RecyclerView.Adapter<HorizontalListAdapter.HorizontalListViewHolder>() {

    class HorizontalListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val plantImage = itemView.findViewById<ImageView>(R.id.cardViewImage)
        val plantName = itemView.findViewById<TextView>(R.id.cardViewText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemHorizontalCardBinding.inflate(inflater, parent, false)
        return HorizontalListViewHolder(binding.root)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: HorizontalListViewHolder, position: Int) {
        holder.plantName.text = data[position].caption
        holder.plantImage.setImageResource(data[position].resId)
    }
}