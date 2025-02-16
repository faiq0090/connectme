package com.example.connectme

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class followers : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_followers)
        var backbtn=findViewById<ImageView>(R.id.backarrow)
        backbtn.setOnClickListener{
            var intent=Intent(this,ProfileFragment::class.java)
            startActivity(intent)
        }
    }
}