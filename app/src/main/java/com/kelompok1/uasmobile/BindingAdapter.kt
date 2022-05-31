package com.kelompok1.uasmobile

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kelompok1.uasmobile.network.Eyebrow
import com.kelompok1.uasmobile.ui.EyebrowListAdapter

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<Eyebrow>?) {
    val adapter = recyclerView.adapter as EyebrowListAdapter
    adapter.submitList(data)
}