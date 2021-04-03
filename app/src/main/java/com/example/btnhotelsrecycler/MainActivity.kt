package com.example.btnhotelsrecycler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEgypt.setOnClickListener{
            val startNewActivity = Intent(this, EgyptActivity::class.java)
            startActivity(startNewActivity)
        }
        btnTurkish.setOnClickListener {
            val startNewActivity = Intent(this, TurkishActivity::class.java)
            startActivity(startNewActivity)
        }
        btnThailand.setOnClickListener {
            val startNewActivity = Intent(this, ThailandActivity::class.java)
            startActivity(startNewActivity)
        }


    }
}