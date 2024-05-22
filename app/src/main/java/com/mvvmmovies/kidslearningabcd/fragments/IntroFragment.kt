package com.mvvmmovies.kidslearningabcd.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mvvmmovies.kidslearningabcd.R
import com.mvvmmovies.kidslearningabcd.databinding.FragmentIntroBinding

class IntroFragment : Fragment(), View.OnClickListener {
    lateinit var binding: FragmentIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_intro, container, false)
        // Inflate the layout for this fragment
        binding.btnStart.setOnClickListener(this@IntroFragment)
        return binding.root
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btnStart -> {
                findNavController().navigate(R.id.action_introFragment_to_homeFragment)
            }
        }
    }

}