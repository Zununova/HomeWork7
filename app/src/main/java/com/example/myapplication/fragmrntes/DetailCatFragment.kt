package com.example.myapplication.fragmrntes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentDetailCatBinding

class DetailCatFragment : Fragment() {
    var binding: FragmentDetailCatBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = arguments
        binding?.catTypeOnDetail?.text = bundle?.getString("catName")
        binding?.catDetailText?.text = bundle?.getString("catDetailText")
        val catImage = bundle?.getString("catImage")
        binding?.catDetailText?.let {
            Glide.with(it)
                .load(catImage)
                .into(binding?.catDetailImage!!)
        }
    }


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

        }

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding = FragmentDetailCatBinding.inflate(inflater, container, false)
            return binding?.root
        }


}