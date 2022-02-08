package com.example.Contacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codinginflow.recyclerviewexample.ExampleItem
import com.example.contacts.R
import com.google.android.material.textview.MaterialTextView

class userAdapter(val userList: List<ExampleItem>) : RecyclerView.Adapter<userAdapter.viewHolder>() {

    class viewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val text1: MaterialTextView = view.findViewById(R.id.text_view_1)
        val text2: MaterialTextView = view.findViewById(R.id.text_view_2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.example_item, parent, false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val currentData = userList[position]
        holder.text1.text = currentData.text1
        holder.text2.text = currentData.text2
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}