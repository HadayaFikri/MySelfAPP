package edu.unikom.hadayafikrina

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.unikom.hadayafikrina.R
import edu.unikom.hadayafikrina.FriendItem

class FriendAdapter(private val items: List<FriendItem>) :
    RecyclerView.Adapter<FriendAdapter.FriendViewHolder>() {

    class FriendViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgFriend: ImageView = view.findViewById(R.id.imgFriend)
        val txtName: TextView = view.findViewById(R.id.txtName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_friend, parent, false)
        return FriendViewHolder(view)
    }

    override fun onBindViewHolder(holder: FriendViewHolder, position: Int) {
        val item = items[position]
        holder.imgFriend.setImageResource(item.imageResId)
        holder.txtName.text = item.name
    }

    override fun getItemCount(): Int = items.size
}