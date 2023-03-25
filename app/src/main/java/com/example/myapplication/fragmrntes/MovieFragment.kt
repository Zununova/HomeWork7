package com.example.myapplication.fragmrntes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapteres.MovieAdapter
import com.example.myapplication.dataCalases.CatDataClass
import com.example.myapplication.databinding.FragmentMovieBinding
import com.example.myapplication.interfaces.OnShortClick
import com.example.myapplication.repositoryes.MovieRepository


class MovieFragment : Fragment(), OnShortClick {
    private var binding : FragmentMovieBinding? = null
    private var movieRepository = MovieRepository()
    private var movieAdapter = MovieAdapter(movieRepository.getMovieList(), this)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.movieRecyclerView?.layoutManager = LinearLayoutManager(requireContext())
        binding?.movieRecyclerView?.adapter = movieAdapter
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMovieBinding.inflate(inflater, container, false)
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