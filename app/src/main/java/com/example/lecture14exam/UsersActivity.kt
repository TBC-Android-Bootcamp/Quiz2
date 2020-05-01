package com.example.lecture14exam

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_recyclerview_layout.*

class UsersActivity : AppCompatActivity() {

    private val items = mutableListOf<UserModel>()
    private lateinit var adapter: RecyclerViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

        btnAddUser.setOnClickListener{
            adapter.addItem(UserModel("Bacho", "Gvelesiani", "bgvelesiani2@gmail.com"))
        }

    }
    private fun init(){
        adapter = RecyclerViewAdapter(items)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}
