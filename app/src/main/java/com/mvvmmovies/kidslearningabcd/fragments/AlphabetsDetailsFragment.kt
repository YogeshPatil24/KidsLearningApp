package com.mvvmmovies.kidslearningabcd.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.mvvmmovies.kidslearningabcd.R
import com.mvvmmovies.kidslearningabcd.databinding.FragmentAlphabetsDetailsBinding

class AlphabetsDetailsFragment : Fragment() {
    lateinit var binding: FragmentAlphabetsDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_alphabets_details, container, false)
        getData()
        return binding.root
    }

    private fun getData() {
        val title = arguments?.getString("alphabet")
        val image = arguments?.getInt("image")
        val fullname = arguments?.getString("fullname")
        binding.image.setImageResource(image!!)
        binding.title.text = title
        binding.titleDesc.text = fullname

    }
}