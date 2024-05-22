package com.mvvmmovies.kidslearningabcd.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.mvvmmovies.kidslearningabcd.R
import com.mvvmmovies.kidslearningabcd.adapters.AddAlphabetsAdapter
import com.mvvmmovies.kidslearningabcd.databinding.FragmentAlphabetsBinding
import com.mvvmmovies.kidslearningabcd.instance.Data
import com.mvvmmovies.kidslearningabcd.models.AlphabetsModel

class AlphabetsFragment : Fragment() {
    lateinit var binding: FragmentAlphabetsBinding
    lateinit var adapter: AddAlphabetsAdapter
    lateinit var list: List<AlphabetsModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_alphabets, container, false)
        addData()
        return binding.root
    }

    private fun addData() {
        val recyclerView = binding.rvAlphabets
        val alphabetsData = Data.getData(requireContext())
        adapter = AddAlphabetsAdapter(requireContext(), alphabetsData)
        val gridlayoutManager =
            GridLayoutManager(requireContext(), 4, LinearLayoutManager.VERTICAL, false)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = gridlayoutManager
        recyclerView.setHasFixedSize(true)
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                gridlayoutManager.orientation
            )
        )
    }

}