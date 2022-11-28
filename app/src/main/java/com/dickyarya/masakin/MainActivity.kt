package com.dickyarya.masakin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.dickyarya.masakin.constant.homeText
import com.dickyarya.masakin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var mToolbar: Toolbar
    private lateinit var tvToolbarTitle: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        setuptoolbar(homeText)

    }

    private fun setuptoolbar(title: String){
        mToolbar = findViewById(R.id.home_toolbar)
        tvToolbarTitle = findViewById(R.id.toolbar_title)

        setSupportActionBar(mToolbar)

        tvToolbarTitle.text = title

    }


}