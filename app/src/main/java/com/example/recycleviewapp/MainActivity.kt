package com.example.recycleviewapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var add : Button
    lateinit var txt : EditText
    lateinit var lbl : TextView
    var students = mutableListOf<String>()
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt = findViewById(R.id.editTextTextPersonName3)
        add = findViewById(R.id.button2)
      //  lbl = findViewById(R.id.textView6)

        val myRV = findViewById<RecyclerView>(R.id.rvMain)
        myRV.adapter = RecycleViewAddapter(students)
        myRV.layoutManager = LinearLayoutManager(this)

        add.setOnClickListener {
            students.add(txt.text.toString())
          //  lbl.text = students.toString()
        }
        println(students)
    }
}