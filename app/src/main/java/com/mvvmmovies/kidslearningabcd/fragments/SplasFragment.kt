package com.mvvmmovies.kidslearningabcd.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mvvmmovies.kidslearningabcd.R
import com.mvvmmovies.kidslearningabcd.databinding.FragmentSplasBinding

class SplasFragment : Fragment() {
    lateinit var binding: FragmentSplasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_splas, container, false)
        initUI()
        return binding.root
    }

    private fun initUI() {
        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(R.id.action_splasFragment_to_introFragment)
        }, 3000)
    }
}