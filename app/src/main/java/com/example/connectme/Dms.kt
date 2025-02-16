package com.example.connectme

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Dms : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dms)

      val dm= findViewById<ImageView>(R.id.backButton)
        dm.setOnClickListener(){
            val intent = Intent(this, bottom_navigation::class.java)
            startActivity(intent)
        }

        val edits= findViewById<ImageView>(R.id.edit)
        edits.setOnClickListener(){
            val intent = Intent(this, edit_profile::class.java)
            startActivity(intent)
        }

        var cm1=findViewById<RelativeLayout>(R.id.chatmove)
        cm1.setOnClickListener{
            val intent=Intent(this,Chat::class.java)
            startActivity(intent)

        }

        var cm2=findViewById<RelativeLayout>(R.id.chatmove2)
        cm2.setOnClickListener{
            val intent=Intent(this,Chat::class.java)
            startActivity(intent)

        }






    }
}