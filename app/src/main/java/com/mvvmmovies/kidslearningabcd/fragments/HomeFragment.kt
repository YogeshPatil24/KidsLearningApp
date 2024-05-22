package com.mvvmmovies.kidslearningabcd.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mvvmmovies.kidslearningabcd.R
import com.mvvmmovies.kidslearningabcd.databinding.FragmentHomeBinding

class HomeFragment : Fragment(), View.OnClickListener {
    lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment,
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        onclick()
        return binding.root
    }

    private fun onclick() {
        binding.llAlphabets.setOnClickListener(this@HomeFragment)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.llAlphabets -> {
                findNavController().navigate(R.id.action_homeFragment_to_alphabetsFragment)
            }
        }
    }


}