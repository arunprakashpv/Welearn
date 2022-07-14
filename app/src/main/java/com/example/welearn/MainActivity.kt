package com.example.welearn


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val courselist = arrayListOf<Course>()

        courselist.add(Course(R.drawable.cprog,"C Programming"))
        courselist.add(Course(R.drawable.css3, "CSS"))
        courselist.add(Course(R.drawable.html, "Html"))
        courselist.add(Course(R.drawable.java, "java"))
        courselist.add(Course(R.drawable.javascript, "javascript"))
        courselist.add(Course(R.drawable.kotlin, "kotlin"))
        courselist.add(Course(R.drawable.matlab, "matlab"))
        courselist.add(Course(R.drawable.python, "python"))
        courselist.add(Course(R.drawable.sql, "sql"))


        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val CourseAdapter = CourseAdapter(courselist)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CourseAdapter


    }
}