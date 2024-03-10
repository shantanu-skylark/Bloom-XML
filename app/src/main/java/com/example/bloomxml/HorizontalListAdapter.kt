package com.example.bloomxml

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bloomxml.databinding.ItemHorizontalCardBinding

class HorizontalListAdapter: RecyclerView.Adapter<HorizontalListAdapter.HorizontalListViewHolder>() {

    val data: List<ListCardItem> = listOf(
        ListCardItem(
            resId = R.drawable.pexels_quang_nguyen_vinh_2132227,
            caption = "Desert chic"
        ),
        ListCardItem(
            resId = R.drawable.pexels_katarzyna_modrzejewska_1400375,
            caption = "Tiny terrariums"
        ),
        ListCardItem(
            resId = R.drawable.pexels_volkan_vardar_5699665,
            caption = "Jungle vibes"
        ),
        ListCardItem(
            resId = R.drawable.pexels_vladimir_gladkov_6208086,
            caption = "Easy care"
        ),
        ListCardItem(
            resId = R.drawable.pexels_sid_maia_3511755,
            caption = "Statements"
        ),
    )


    class HorizontalListViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
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