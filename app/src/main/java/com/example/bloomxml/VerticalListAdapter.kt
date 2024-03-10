package com.example.bloomxml

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bloomxml.databinding.ItemVerticalCardBinding

class VerticalListAdapter: RecyclerView.Adapter<VerticalListAdapter.VerticalListViewHolder>() {

    val data: List<ListCardItem> = listOf(
        ListCardItem(
            resId = R.drawable.pexels_huy_phan_3097770,
            caption = "Monstera"
        ),
        ListCardItem(
            resId = R.drawable.pexels_karolina_grabowska_4751978,
            caption = "Aglaonema"
        ),
        ListCardItem(
            resId = R.drawable.pexels_melvin_vito_4425201,
            caption = "Peace lily"
        ),
        ListCardItem(
            resId = R.drawable.pexels_vladimir_gladkov_6208087,
            caption = "Fiddle leaf tree"
        ),
        ListCardItem(
            resId = R.drawable.pexels_fabian_stroobants_2123482,
            caption = "Snake plant"
        ),
        ListCardItem(
            resId = R.drawable.pexels_faraz_ahmad_1084199,
            caption = "Pothos"
        ),
    )
    class VerticalListViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
        val plantImage = itemView.findViewById<ImageView>(R.id.imageView)
        val plantName = itemView.findViewById<TextView>(R.id.textViewPlantName)
        val checkbox = itemView.findViewById<CheckBox>(R.id.checkbox)
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