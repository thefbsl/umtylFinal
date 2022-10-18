package com.example.umtylproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_home.*

class Videos : AppCompatActivity() {
    private var myUserName: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videos)
        bottom_navigation.setSelectedItemId(R.id.ic_chat)
        bottom_navigation.setSelectedItemId(R.id.ic_home)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.ic_home -> startActivity(Intent(this, Home::class.java))
                R.id.ic_chat -> startActivity(Intent(this, MainUserListActivity::class.java))
            }
            true
        }

        val video1: ImageView = findViewById(R.id.lesson1)
        video1.setOnClickListener{
            val intent = Intent(this, Zatesim::class.java)
            intent.putExtra(Constants.USER_NAME, myUserName)
            startActivity(intent)
            finish()
        }
        val video2: ImageView = findViewById(R.id.lesson2)
        video2.setOnClickListener{
            val intent = Intent(this, Etistik::class.java)
            intent.putExtra(Constants.USER_NAME, myUserName)
            startActivity(intent)
            finish()
        }
        val video3: ImageView = findViewById(R.id.lesson3)
        video3.setOnClickListener{
            val intent = Intent(this, Synesim::class.java)
            intent.putExtra(Constants.USER_NAME, myUserName)
            startActivity(intent)
            finish()
        }
        val video4: ImageView = findViewById(R.id.lesson4)
        video4.setOnClickListener{
            val intent = Intent(this, Sanesim::class.java)
            intent.putExtra(Constants.USER_NAME, myUserName)
            startActivity(intent)
            finish()
        }
    }
}