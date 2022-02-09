package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codinginflow.recyclerviewexample.ExampleItem
//import com.example.Contacts.userAdapter
import model.Post
import model.postAdapter
import network.NetworkCallback
import network.NetworkClient

class MainActivity : AppCompatActivity(), NetworkCallback {

    private lateinit var rcView: RecyclerView
    private val networkClient = NetworkClient(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.recyclerview)
        recyclerView = findViewById(R.id.recycler_view)
        val dataList = getUserList()
        showData(dataList)*/
        setContentView(R.layout.post_recyclerview)
        rcView = findViewById(R.id.rv)
        networkClient.getPost()
    }

    fun showData(postList: List<Post>) {
        rcView.layoutManager = LinearLayoutManager(this)
        val adapter = postAdapter(postList)
        rcView.adapter = adapter
        /*recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = userAdapter(dataList)
        recyclerView.adapter = adapter*/
    }

    override fun getList(postList: List<Post>) {
        showData(postList)
    }

}