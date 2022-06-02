package com.kelompok1.uasmobile.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.ListAdapter
import com.kelompok1.uasmobile.databinding.ListViewItemEyebrowBinding
import com.kelompok1.uasmobile.network.Eyebrow


class EyebrowListAdapter(private val clickListener: EyebrowListener) :
    ListAdapter<Eyebrow, EyebrowListAdapter.EyebrowViewHolder>(DiffCallback)
{
    class EyebrowViewHolder(
        var binding: ListViewItemEyebrowBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun bind(clickListener: EyebrowListener, eyebrow: Eyebrow){
            binding.eyebrow = eyebrow
            binding.clicklistener = clickListener
            binding.executePendingBindings()
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Eyebrow>(){
        override fun areItemsTheSame(oldItem: Eyebrow, newItem: Eyebrow): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Eyebrow, newItem: Eyebrow): Boolean {
            return oldItem.id == newItem.id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : EyebrowViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return EyebrowViewHolder(
            ListViewItemEyebrowBinding.inflate(layoutInflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: EyebrowViewHolder, position: Int){
        val provinsi = getItem(position)
        holder.bind(clickListener, provinsi)
    }
}

class EyebrowListener(val clickListener: (eyebrow: Eyebrow) -> Unit){
    fun onClick(eyebrow: Eyebrow) = clickListener(eyebrow)
}