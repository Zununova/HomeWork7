package com.example.myapplication.adapteres

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.interfaces.OnShortClick
import com.example.myapplication.dataCalases.CatDataClass
import com.example.myapplication.databinding.CatOneItemBinding

class CatAdapter(
    private val catList: MutableList<CatDataClass>,
    private val onShortClick: OnShortClick
) : RecyclerView.Adapter<CatAdapter.CatViewHolder>() {
    var binding: CatOneItemBinding? = null



    inner class CatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(catDataClass: CatDataClass) {
            binding?.catTypeImage?.let {
                Glide.with(it)
                    .load(catDataClass.catTypeImage)
                    .into(binding?.catTypeImage!!)
            }
            binding?.catTypeText?.text = catDataClass.catTypeName

            binding?.root?.setOnClickListener {
                onShortClick.onShortClickListener(catDataClass)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = CatOneItemBinding.inflate(inflater, parent, false)
        return binding?.root?.let { CatViewHolder(it) }!!

    }

    override fun getItemCount(): Int {
        return catList.size-1
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.onBind(catList[position])

    }


}

