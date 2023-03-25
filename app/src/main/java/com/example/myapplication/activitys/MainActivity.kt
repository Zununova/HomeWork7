package com.example.myapplication.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.myapplication.R
import com.example.myapplication.fragmrntes.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fragmentManager : FragmentManager = supportFragmentManager

        fragmentManager.beginTransaction()
            .add(R.id.main_fragment, MainFragment())
            .commit()
    }
}