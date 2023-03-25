package com.example.myapplication.fragmrntes

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var binding: FragmentMainBinding? = null


    @SuppressLint("CommitTransaction")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnCats?.setOnClickListener {

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment , CatFragment())
                .commit()
        }
        binding?.btnDogs?.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment , DogFragment())
                .commit()
        }
        binding?.btnMovies?.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment , MovieFragment())
                .commit()
        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding?.root

    }
}