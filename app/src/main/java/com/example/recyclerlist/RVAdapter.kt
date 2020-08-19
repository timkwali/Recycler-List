package com.example.recyclerlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.profile.view.*

class RVAdapter(private val list: List<Data>, var clickListener: OnProfileClickListener):
    RecyclerView.Adapter<RVAdapter.RVHolder>()  {

    //CREATE VIEW-HOLDER
    class RVHolder(item: View): RecyclerView.ViewHolder(item) {
        val image: ImageView = item.ivProfilePic
        val name: TextView = item.tvName
        val stack: TextView = item.tvStack

        //GET PROFILE NAME FOR TOAST
        fun initialize(list: Data, action: OnProfileClickListener) {
            name.text =  list.name

            itemView.setOnClickListener{
                action.onItemClick(list, adapterPosition)
            }
        }
    }

    //CREATE PROFILE
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.profile, parent, false)
        return RVHolder(item)
    }

    //BIND PROFILE TO THE VIEW
    override fun onBindViewHolder(holder: RVHolder, position: Int) {
        val currentProfile = list[position]
        holder.image.setImageResource(currentProfile.ImageResource)
        holder.name.text = currentProfile.name
        holder.stack.text = currentProfile.stack

        holder.initialize(list[position], clickListener)
    }

    //GET ITEM COUNT
    override fun getItemCount() = list.size
}

//SET LISTENER FOR PROFILE CLICK
interface OnProfileClickListener {
    fun onItemClick(list: Data, position: Int) {
    }
}