package com.example.btnhotelsrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.btnhotelsrecycler.adapters.Egypt_adapter
import kotlinx.android.synthetic.main.activity_egypt.*

class EgyptActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_egypt)

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
        rvEgypt_Hotels.adapter = adapter
        rvEgypt_Hotels.layoutManager = LinearLayoutManager(this)
    }
}