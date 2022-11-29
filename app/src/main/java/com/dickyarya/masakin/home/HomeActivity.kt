package com.dickyarya.masakin.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.dickyarya.masakin.R
import com.dickyarya.masakin.constant.homeText
import com.dickyarya.masakin.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    private lateinit var mToolbar: Toolbar
    private lateinit var tvToolbarTitle: TextView

    private lateinit var homeFragment: HomeFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        setupToolbar(homeText)

        homeFragment = HomeFragment()

        addFragment(homeFragment)


    }

    private fun addFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }

    private fun setupToolbar(title: String){
        mToolbar = findViewById(R.id.home_toolbar)
        tvToolbarTitle = findViewById(R.id.toolbar_title)

        setSupportActionBar(mToolbar)

        tvToolbarTitle.text = title

    }


}