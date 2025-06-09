package edu.unikom.hadayafikrina

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.unikom.hadayafikrina.adapter.DailyAdapter


class DailyFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_daily, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerDaily)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val dummyData = listOf(
            DailyItem("04:30", "Bangun tidur & sholat Subuh"),
            DailyItem("05:00", "Olahraga Ringan"),
            DailyItem("06:00", "Sarapan"),
            DailyItem("07:00", "Kuliah pagi (Kalo Ada)"),
            DailyItem("11:30", "Sholat Dzuhur & Makan Siang"),
            DailyItem("12:30", "Kuliah siang / Ngerjain Tugas"),
            DailyItem("14:00", "Istirahat atau tidur siang sebentar"),
            DailyItem("15:00", "Sholat Ashar"),
            DailyItem("15:30", "Ngerjain tugas, coding, belajar mandiri"),
            DailyItem("17:00", "Refreshing / main game / scroll medsos"),
            DailyItem("17:30", "Sholat Maghrib"),
            DailyItem("18:00", "Makan malam & Nyantai"),
            DailyItem("19:00", "Sholat Isya & review pelajaran"),
            DailyItem("20:00", "Nugas / kerja proyek / diskusi online"),
            DailyItem("22:00", "Doa malam"),
            DailyItem("22:30", "Tidur")
        )

        recyclerView.adapter = DailyAdapter(dummyData)

        val recyclerFriend = view.findViewById<RecyclerView>(R.id.recyclerFriend)
        recyclerFriend.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        val dummyFriendList = listOf(
            FriendItem(R.drawable.h1, "Hadaya"),
            FriendItem(R.drawable.h3, "Fachri"),
            FriendItem(R.drawable.h5, "Dida"),
            FriendItem(R.drawable.h4, "Varidza"),
            FriendItem(R.drawable.h2, "Faliq"),
            FriendItem(R.drawable.h5, "Cesna"),
            FriendItem(R.drawable.h4, "Aggni")
        )

        recyclerFriend.adapter = FriendAdapter(dummyFriendList)

        return view
    }


}