package com.kelompok1.uasmobile

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kelompok1.uasmobile.network.Eyebrow
import com.kelompok1.uasmobile.network.Eyeliner
import com.kelompok1.uasmobile.network.Eyeshadow
import com.kelompok1.uasmobile.ui.EyebrowListAdapter
import com.kelompok1.uasmobile.ui.EyelinerListAdapter
import com.kelompok1.uasmobile.ui.EyeshadowListAdapter

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<Eyebrow>?) {
    val adapter = recyclerView.adapter as EyebrowListAdapter
    adapter.submitList(data)
}
@BindingAdapter("listDataEyeliner")
fun bindRecyclerViewEyeliner(recyclerView: RecyclerView, data: List<Eyeliner>?) {
    val adapterEyeliner = recyclerView.adapter as EyelinerListAdapter
    adapterEyeliner.submitList(data)
}

@BindingAdapter("listDataEyeshadow")
fun bindRecyclerViewEyeshadow(recyclerView: RecyclerView, data: List<Eyeshadow>?) {
    val adapter = recyclerView.adapter as EyeshadowListAdapter
    adapter.submitList(data)
}