package edu.unikom.hadayafikrina

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GalleryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gallery, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerGallery)
        recyclerView.layoutManager = GridLayoutManager(context, 2)

        val dummyData = listOf(
            GalleryItem(R.drawable.d1),
            GalleryItem(R.drawable.g2),
            GalleryItem(R.drawable.d3),
            GalleryItem(R.drawable.d4),
            GalleryItem(R.drawable.i1),
            GalleryItem(R.drawable.i2),
            GalleryItem(R.drawable.i3),
            GalleryItem(R.drawable.i4),
            GalleryItem(R.drawable.i5),
            GalleryItem(R.drawable.i6),
            GalleryItem(R.drawable.i7),
            GalleryItem(R.drawable.i8),
            GalleryItem(R.drawable.i9),
            GalleryItem(R.drawable.d5)
        )

        recyclerView.adapter = GalleryAdapter(dummyData)

        return view
    }
}