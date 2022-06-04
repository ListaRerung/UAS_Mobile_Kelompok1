package com.kelompok1.uasmobile.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kelompok1.uasmobile.databinding.ListViewItemEyeshadowBinding
import com.kelompok1.uasmobile.network.Eyeshadow

class EyeshadowListAdapter(private val clickListener: EyeshadowListener) :
    ListAdapter<Eyeshadow, EyeshadowListAdapter.EyeshadowViewHolder>(DiffCallback)
{
    class EyeshadowViewHolder(
        var binding: ListViewItemEyeshadowBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun bind(clickListener: EyeshadowListener, eyeshadow: Eyeshadow){
            binding.eyeshadow = eyeshadow
            binding.clicklistener = clickListener
            binding.executePendingBindings()
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Eyeshadow>(){
        override fun areItemsTheSame(oldItem: Eyeshadow, newItem: Eyeshadow): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Eyeshadow, newItem: Eyeshadow): Boolean {
            return oldItem.id == newItem.id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : EyeshadowViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return EyeshadowViewHolder(
            ListViewItemEyeshadowBinding.inflate(layoutInflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: EyeshadowViewHolder, position: Int){
        val provinsi = getItem(position)
        holder.bind(clickListener, provinsi)
    }
}

class EyeshadowListener(val clickListener: (eyeshadow: Eyeshadow) -> Unit){
    fun onClick(eyeshadow: Eyeshadow) = clickListener(eyeshadow)
}