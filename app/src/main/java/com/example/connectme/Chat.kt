package com.example.connectme

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Chat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_chat)

        var call=findViewById<ImageView>(R.id.callButton)
        call.setOnClickListener{
            var intent=Intent(this,Call::class.java)
            startActivity(intent)
        }


       var videoc=findViewById<ImageView>(R.id.videoButton)
        videoc.setOnClickListener{
            var intent=Intent(this,video_call::class.java)
            startActivity(intent)
        }

        var btn=findViewById<ImageView>(R.id.backButton)
        btn.setOnClickListener{
            var intent=Intent(this,Dms::class.java)
            startActivity(intent)
        }

    }
}