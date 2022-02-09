package model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts.R
import com.google.android.material.textview.MaterialTextView

class postAdapter(val postList: List<Post>) : RecyclerView.Adapter<postAdapter.viewHolder>() {

    class viewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val userId: MaterialTextView = view.findViewById(R.id.userid)
        val id: MaterialTextView = view.findViewById(R.id.id)
        val title: MaterialTextView = view.findViewById(R.id.title)
        val body: MaterialTextView = view.findViewById(R.id.body)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.posts, parent, false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val currentData = postList[position]
        holder.userId.text = currentData.userId.toString()
        holder.id.text = currentData.id.toString()
        holder.title.text = currentData.title
        holder.body.text = currentData.body
    }

    override fun getItemCount(): Int {
        return postList.size
    }
}