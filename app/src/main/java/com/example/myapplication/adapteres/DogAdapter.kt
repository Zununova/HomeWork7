package com.example.myapplication.adapteres

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.dataCalases.CatDataClass
import com.example.myapplication.databinding.CatOneItemBinding
import com.example.myapplication.interfaces.OnShortClick

class DogAdapter(
    private val dogList : MutableList<CatDataClass>,
    private val onShortClick: OnShortClick

): RecyclerView.Adapter<DogAdapter.DogViewHolder>() {
    var binding : CatOneItemBinding? = null


    inner class DogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = CatOneItemBinding.inflate(inflater, parent, false)
        return binding?.root?.let { DogViewHolder(it) }!!
    }

    override fun getItemCount(): Int {
       return dogList.size-1
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        holder.onBind(dogList[position])
    }
}