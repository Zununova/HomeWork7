package com.example.myapplication.fragmrntes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapteres.CatAdapter
import com.example.myapplication.adapteres.DogAdapter
import com.example.myapplication.dataCalases.CatDataClass
import com.example.myapplication.databinding.FragmentDogBinding
import com.example.myapplication.interfaces.OnShortClick
import com.example.myapplication.repositoryes.CatRepository
import com.example.myapplication.repositoryes.DogRepository


class DogFragment : Fragment(), OnShortClick {
    var binding : FragmentDogBinding? = null
    private var dogRepository = DogRepository()
    private var dogAdapter = DogAdapter(dogRepository.getDogList(), this)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.dogRecyclerView?.layoutManager = LinearLayoutManager(requireContext())
        binding?.dogRecyclerView?.adapter = dogAdapter
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDogBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onShortClickListener(catDataClass: CatDataClass) {
        val bundle = Bundle()
        bundle.putString("catName", catDataClass.catTypeName)
        bundle.putString("catImage", catDataClass.catTypeImage)
        bundle.putString("catDetailText", catDataClass.catDetailText)
        val detailCatFragment = DetailCatFragment()
        detailCatFragment.arguments = bundle
        parentFragmentManager.beginTransaction()
            .replace(this.id, detailCatFragment)
            .addToBackStack("CatFragment")
            .commit()
    }


}