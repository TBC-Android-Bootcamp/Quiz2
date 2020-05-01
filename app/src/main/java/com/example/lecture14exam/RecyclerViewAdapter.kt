package com.example.lecture14exam

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_recyclerview_layout.view.*

class RecyclerViewAdapter (private val items: MutableList<UserModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun getItemCount() = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return object:RecyclerView.ViewHolder(
            LayoutInflater.from(parent.context).inflate( //
                R.layout.item_recyclerview_layout,
                parent,
                false
            )
        ){}
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val model = items[position]
        holder.itemView.tvFirstName.text = model.firstName
        holder.itemView.tvLastName.text = model.lastName
        holder.itemView.tvEmail.text = model.email
        holder.itemView.btnEditInfo.setOnClickListener{

        }

        holder.itemView.btnDeleteUser.setOnClickListener{
            removeItemAt(position)
        }
    }

    fun addItem(item: UserModel){
        items.add(item)
        notifyItemInserted(items.size - 1)
    }

    fun removeItemAt(position: Int){
        items.removeAt(position)
        notifyDataSetChanged()
    }

}