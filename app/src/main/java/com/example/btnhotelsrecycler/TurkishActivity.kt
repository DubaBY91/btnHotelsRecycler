package com.example.btnhotelsrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.btnhotelsrecycler.adapters.Egypt_adapter
import kotlinx.android.synthetic.main.activity_turkish.*

class TurkishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_turkish)

        var hotelList = mutableListOf(
                Hotel("First", "1000"),
                Hotel("Second", "1000"),
                Hotel("Another", "1000"),
                Hotel("Another", "1000"),
                Hotel("Another", "1000"),
                Hotel("Another", "1000"),
                Hotel("Another", "1000"),
                Hotel("Another", "1000"),
                Hotel("Another", "1000"),
                Hotel("Another", "1000"),
                Hotel("Another", "1000"),
                Hotel("Another", "1000"),
                Hotel("Another", "1000"),


                )
        val adapter = Egypt_adapter(hotelList)
        rvTurkish_Hotels.adapter = adapter
        rvTurkish_Hotels.layoutManager = LinearLayoutManager(this)
    }
}

