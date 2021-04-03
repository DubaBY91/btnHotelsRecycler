package com.example.btnhotelsrecycler.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.btnhotelsrecycler.Hotel
import com.example.btnhotelsrecycler.R
import kotlinx.android.synthetic.main.recycler_egypt.view.*

class Thailand_adapter (

    var hotels : List<Hotel>
) : RecyclerView.Adapter<Thailand_adapter.HotelViewHolder>() {

    inner class HotelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_egypt, parent, false)
        return HotelViewHolder(view)
    }

    override fun onBindViewHolder(holder: HotelViewHolder, position: Int) {
        holder.itemView.apply {
            tvHotels_name.text = hotels[position].nameHotel
            tvHotels_cost.text = hotels[position].costHotel

        }
    }

    override fun getItemCount(): Int {
        return hotels.size
    }
}
