package com.mvvmmovies.kidslearningabcd.adapters

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.mvvmmovies.kidslearningabcd.R
import com.mvvmmovies.kidslearningabcd.databinding.AlphabetsItemListBinding
import com.mvvmmovies.kidslearningabcd.models.AlphabetsModel

class AddAlphabetsAdapter(val context: Context, var alphabetslist: List<AlphabetsModel>) :
    RecyclerView.Adapter<AddAlphabetsAdapter.mViewHolder>() {
    lateinit var bindig: AlphabetsItemListBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mViewHolder {
        bindig = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.alphabets_item_list,
            parent,
            false
        )
        return mViewHolder(bindig)
    }

    override fun getItemCount(): Int = alphabetslist.size

    override fun onBindViewHolder(holder: mViewHolder, position: Int) {
        val model = alphabetslist[position]
        holder.bind(model)
        Glide
            .with(context)
            .load(model.image)
            .centerCrop()
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(bindig.image)
        holder.itemView.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("alphabet", model.alphabet)
            bundle.putInt("image", model.image!!)
            bundle.putString("fullname", model.fullname)
            Log.d("ALPHABETSSSS", "onBindViewHolder:${model.alphabet} ")
            Log.d("IMAGEEE", "onBindViewHolder:${model.image} ")
            Navigation.findNavController(holder.itemView)
                .navigate(R.id.action_alphabetsFragment_to_alphabetsDetailsFragment, bundle)
        }
    }

    inner class mViewHolder(private val binding: AlphabetsItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(model: AlphabetsModel) {
            binding.model = model
        }
    }
}