package edu.unikom.hadayafikrina

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MusicFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_music, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerMusic)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val dummyData = listOf(
            MusicItem("Lathi - Weird Genius", "Music"),
            MusicItem("Melukis Senja - Budi Doremi", "Music"),
            MusicItem("Believer - Imagine Dragons", "Music"),
            MusicItem("Motivasi Pagi - YouTube", "Video"),
            MusicItem("Hindia - Satu Hari Lagi", "Music"),
            MusicItem("My Way of Life - Frank Sinatra", "Music"),
            MusicItem("My Way - Frank Sinatra", "Music"),
            MusicItem("Hindia - Everythink U Are", "Music"),
            MusicItem("Lomba Sihir - Ribuan Memori", "Music"),
            MusicItem("Lomba Sihir - Mungkin Takut Perubahan", "Music"),
            MusicItem("Tutorial UI Android", "Video"),
            MusicItem(".Feast - Tarot", "Music"),
            MusicItem("Multo - Cup of Joe", "Music")

        )

        recyclerView.adapter = MusicAdapter(dummyData)

        return view
    }
}