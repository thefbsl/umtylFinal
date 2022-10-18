package com.example.umtylproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_home.*

class Lessons : AppCompatActivity() {
    private var myUserName: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessons)
        bottom_navigation.setSelectedItemId(R.id.ic_chat)
        bottom_navigation.setSelectedItemId(R.id.ic_home)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.ic_home -> startActivity(Intent(this, Home::class.java))
                R.id.ic_chat -> startActivity(Intent(this, MainUserListActivity::class.java))
            }
            true
        }

        val lesson1: ImageView = findViewById(R.id.lesson1)
        lesson1.setOnClickListener{
            val intent = Intent(this, Lesson1::class.java)
            intent.putExtra(Constants.USER_NAME, myUserName)
            startActivity(intent)
            finish()
        }

    }
}