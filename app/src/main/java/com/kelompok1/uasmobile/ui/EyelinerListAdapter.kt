package com.kelompok1.uasmobile.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.ListAdapter
import com.kelompok1.uasmobile.databinding.ListViewItemEyelinerBinding
import com.kelompok1.uasmobile.network.Eyeliner


class EyelinerListAdapter(private val clickListener: EyelinerListener) :
    ListAdapter<Eyeliner, EyelinerListAdapter.EyelinerViewHolder>(DiffCallback)
{
    class EyelinerViewHolder(
        var binding: ListViewItemEyelinerBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun bind(clickListener: EyelinerListener, eyeliner: Eyeliner){
            binding.eyeliner = eyeliner
            binding.clicklistener = clickListener
            binding.executePendingBindings()
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Eyeliner>(){
        override fun areItemsTheSame(oldItem: Eyeliner, newItem: Eyeliner): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Eyeliner, newItem: Eyeliner): Boolean {
            return oldItem.id == newItem.id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : EyelinerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return EyelinerViewHolder(
            ListViewItemEyelinerBinding.inflate(layoutInflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: EyelinerViewHolder, position: Int){
        val eyeliner = getItem(position)
        holder.bind(clickListener, eyeliner)
    }
}

class EyelinerListener(val clickListenerEyeliner: (eyeliner: Eyeliner) -> Unit){
    fun onClick(eyeliner: Eyeliner) = clickListenerEyeliner(eyeliner)
}
