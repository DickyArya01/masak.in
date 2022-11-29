package com.dickyarya.masakin.home

import android.os.Build
import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.dickyarya.masakin.R
import com.dickyarya.masakin.databinding.FragmentHomeBinding
import com.dickyarya.masakin.model.adapter.ImageSliderAdapter
import com.dickyarya.masakin.model.data.ImageData
import com.dickyarya.masakin.model.data.listImageData

class HomeFragment : Fragment() {

    private lateinit var _binding: FragmentHomeBinding
    private val binding get() = _binding

    private lateinit var adapter: ImageSliderAdapter
    private var list = ArrayList<ImageData>()
    private lateinit var dots: ArrayList<TextView>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root


        
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        list.addAll(listImageData)
        adapter = ImageSliderAdapter(list)
        binding.sliderBanner.vpSliderHome.adapter = adapter

        dots = ArrayList()

        setIndicator()

        binding.sliderBanner.vpSliderHome.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {

                selectedDot(position)

                super.onPageSelected(position)
            }
        })

    }

    private fun selectedDot(position: Int) {
        for (i in 0 until list.size){
            if (i == position) {
                dots[i].setTextColor(ContextCompat.getColor(this.requireContext(), R.color.orange))
            } else {
                dots[i].setTextColor(ContextCompat.getColor(this.requireContext(), R.color.white_off_dark))
            }
        }
    }

    private fun setIndicator() {
        for (i in 0 until list.size){
            dots.add(TextView(this.context))
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                dots[i].text = Html.fromHtml("&#9679", Html.FROM_HTML_MODE_LEGACY).toString()
            } else {
                dots[i].text = Html.fromHtml("&#p679")
            }

            dots[i].textSize = 18f

            binding.sliderBanner.llSliderIndicator.addView(dots[i])
        }
    }

}