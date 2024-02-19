package com.rey.room_liabrary

import android.animation.ValueAnimator.AnimatorUpdateListener
import android.media.RouteListingPreference.Item
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rey.room_liabrary.databinding.ItemsRowBinding

class ItemAdapter(private val items: ArrayList<EmployeeEntity>,
                  private val updateListener: (id: Int) -> Unit,
                    private val deleteListener: (id: Int) -> Unit

): RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    class ViewHolder(binding: ItemsRowBinding): RecyclerView.ViewHolder(binding.root){
        val llmain = binding.llMain
        val tvName = binding.tvName
        val tvEmail = binding.tvEmail
        val ivEdit = binding.ivEdit
        val ivDelete = binding.ivDelete
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}