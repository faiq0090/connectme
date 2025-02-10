package com.example.connectme

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Dms : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dms)


        val sendbtn:ImageView=findViewById(R.id.backButton)
        sendbtn.setOnClickListener {
            val intent= Intent(this,HomeFragment::class.java)
            startActivity(intent)
        }
    }
}