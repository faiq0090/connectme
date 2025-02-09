package com.example.connectme

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class bottom_navigation : AppCompatActivity() {


    private lateinit var bottomNavigationView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bottom_navigation)


        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.bottom_home -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.bottom_search -> {
                    replaceFragment(SearchFragment())
                    true
                }
                R.id.bottom_add -> {
                    replaceFragment(PostFragment())
                    true
                }
                R.id.bottom_profile -> {
                    replaceFragment(ProfileFragment())
                    true
                }
                R.id.bottom_contact -> {
                    replaceFragment(ContactFragment())
                    true
                }
                else -> false
            }

        }
        replaceFragment(HomeFragment())
    }
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

}