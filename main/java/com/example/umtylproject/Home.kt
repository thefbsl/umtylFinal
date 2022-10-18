package com.example.umtylproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_home.*
import androidx.fragment.app.Fragment


class Home : AppCompatActivity() {


    private var myUserName: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        movies.setOnClickListener {
            val intent = Intent(this, Videos::class.java)
            startActivity(intent)
            finish()
        }


        lessons.setOnClickListener {
            val intent = Intent(this, Lessons::class.java)
            startActivity(intent)
            finish()
        }


        bottom_navigation.setSelectedItemId(R.id.ic_chat)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.ic_chat -> startActivity(Intent(this, MainUserListActivity::class.java))
                R.id.ic_lessons -> startActivity(Intent(this, Lessons::class.java))

            }
            true
        }
    }


    private fun replaceFragment(fragment: Fragment) {
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }

    }


    }
