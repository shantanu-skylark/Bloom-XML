package com.example.bloomxml.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bloomxml.R
import com.example.bloomxml.data.ListCardItem
import com.example.bloomxml.databinding.FragmentHomeBinding
import com.example.bloomxml.ui.adapters.HorizontalListAdapter
import com.example.bloomxml.ui.adapters.VerticalListAdapter

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var horizontalRecyclerView: RecyclerView
    private lateinit var verticalRecyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupAdapters()
    }

    private fun setupAdapters() {
        horizontalRecyclerView = binding.recyclerViewHorizontal
        horizontalRecyclerView.apply {
            adapter = HorizontalListAdapter(getDataForHorizontalList())
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }

        verticalRecyclerView = binding.recyclerViewVertical
        verticalRecyclerView.apply {
            adapter = VerticalListAdapter(getDataForVerticalList())
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        }
    }

    private fun getDataForHorizontalList(): List<ListCardItem> = listOf(
        ListCardItem(
            resId = R.drawable.pexels_quang_nguyen_vinh_2132227,
            caption = getString(R.string.label_desert_chic)
        ),
        ListCardItem(
            resId = R.drawable.pexels_katarzyna_modrzejewska_1400375,
            caption = getString(R.string.label_tiny_terrariums)
        ),
        ListCardItem(
            resId = R.drawable.pexels_volkan_vardar_5699665,
            caption = getString(R.string.label_jungle_vibes)
        ),
        ListCardItem(
            resId = R.drawable.pexels_vladimir_gladkov_6208086,
            caption = getString(R.string.label_easy_care)
        ),
        ListCardItem(
            resId = R.drawable.pexels_sid_maia_3511755,
            caption = getString(R.string.label_statements)
        ),
    )

    private fun getDataForVerticalList(): List<ListCardItem> = listOf(
        ListCardItem(
            resId = R.drawable.pexels_huy_phan_3097770,
            caption = getString(R.string.label_monstera)
        ),
        ListCardItem(
            resId = R.drawable.pexels_karolina_grabowska_4751978,
            caption = getString(R.string.label_aglaonema)
        ),
        ListCardItem(
            resId = R.drawable.pexels_melvin_vito_4425201,
            caption = getString(R.string.label_peace_lily)
        ),
        ListCardItem(
            resId = R.drawable.pexels_vladimir_gladkov_6208087,
            caption = getString(R.string.label_fiddle_leaf_tree)
        ),
        ListCardItem(
            resId = R.drawable.pexels_fabian_stroobants_2123482,
            caption = getString(R.string.label_snake_plant)
        ),
        ListCardItem(
            resId = R.drawable.pexels_faraz_ahmad_1084199,
            caption = getString(R.string.label_pothos)
        ),
    )
}