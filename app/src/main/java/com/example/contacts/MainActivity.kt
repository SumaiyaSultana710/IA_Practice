package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codinginflow.recyclerviewexample.ExampleItem
import com.example.Contacts.userAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerview)
        recyclerView = findViewById(R.id.recycler_view)
        val dataList = getUserList()
        showData(dataList)
    }

    fun showData(dataList: List<ExampleItem>) {
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = userAdapter(dataList)
        recyclerView.adapter = adapter
    }

    fun getUserList(): List<ExampleItem> {
        val userList = mutableListOf<ExampleItem>()
        userList.add(ExampleItem("Product- 1", "Price= 3000"))
        userList.add(ExampleItem("Product- 2", "Price= 700"))
        userList.add(ExampleItem("Product- 3", "Price= 1000"))
        userList.add(ExampleItem("Product- 4", "Price= 3000"))
        userList.add(ExampleItem("Product- 5", "Price= 700"))
        userList.add(ExampleItem("Product- 6", "Price= 1000"))
        userList.add(ExampleItem("Product- 7", "Price= 3000"))
        userList.add(ExampleItem("Product- 8", "Price= 700"))
        userList.add(ExampleItem("Product- 9", "Price= 1000"))
        userList.add(ExampleItem("Product- 10", "Price= 3000"))
        userList.add(ExampleItem("Product- 11", "Price= 700"))
        userList.add(ExampleItem("Product- 12", "Price= 1000"))

        return userList
    }
}