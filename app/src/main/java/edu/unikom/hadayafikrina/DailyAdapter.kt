package edu.unikom.hadayafikrina.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.unikom.hadayafikrina.R
import edu.unikom.hadayafikrina.DailyItem

class DailyAdapter(private val dailyList: List<DailyItem>) :
    RecyclerView.Adapter<DailyAdapter.DailyViewHolder>() {

    class DailyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtTime: TextView = itemView.findViewById(R.id.txtTime)
        val txtActivity: TextView = itemView.findViewById(R.id.txtActivity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_daily, parent, false)
        return DailyViewHolder(view)
    }

    override fun onBindViewHolder(holder: DailyViewHolder, position: Int) {
        val item = dailyList[position]
        holder.txtTime.text = item.time
        holder.txtActivity.text = item.activity
    }

    override fun getItemCount(): Int = dailyList.size
}