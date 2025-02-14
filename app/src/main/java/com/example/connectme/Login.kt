package com.example.connectme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //on click listener for login button
        var loginbtn = findViewById<Button>(R.id.loginButton)
        loginbtn.setOnClickListener{
            val intent = Intent(this, bottom_navigation::class.java)
            startActivity(intent)
        }
        //on click listener for register link
        val clickMe = findViewById<TextView>(R.id.registerLink)
        clickMe.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

    }
}