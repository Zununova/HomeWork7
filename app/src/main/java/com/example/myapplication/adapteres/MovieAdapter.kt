package com.example.myapplication.adapteres

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.dataCalases.CatDataClass
import com.example.myapplication.databinding.CatOneItemBinding
import com.example.myapplication.interfaces.OnShortClick

class MovieAdapter(
    private val movieList: MutableList<CatDataClass>,
    private val onShortClick: OnShortClick
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    var binding : CatOneItemBinding? = null
    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = CatOneItemBinding.inflate(inflater, parent, false)
        return binding?.root?.let { MovieViewHolder(it) }!!    }

    override fun getItemCount(): Int {
        return movieList.size -1
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.onBind(movieList[position])
    }
}