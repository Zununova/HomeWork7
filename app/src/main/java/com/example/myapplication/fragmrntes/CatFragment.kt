package com.example.myapplication.fragmrntes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.interfaces.OnShortClick
import com.example.myapplication.adapteres.CatAdapter
import com.example.myapplication.dataCalases.CatDataClass
import com.example.myapplication.databinding.FragmentCatBinding
import com.example.myapplication.repositoryes.CatRepository


class CatFragment : Fragment(), OnShortClick {
    private var binding: FragmentCatBinding? = null
    private var catRepository = CatRepository()
    private var catAdapter = CatAdapter(catRepository.getCatList(), this)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.catRecyclerView?.layoutManager = LinearLayoutManager(requireContext())
        binding?.catRecyclerView?.adapter = catAdapter
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCatBinding.inflate(inflater, container, false)
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