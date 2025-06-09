package edu.unikom.hadayafikrina

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment


class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val btnContact = view.findViewById<Button>(R.id.btnContact)
        val btnFindMe = view.findViewById<Button>(R.id.btnFindMe)
        val btnAbout = view.findViewById<Button>(R.id.btnAbout)

        // Contact button
        btnContact.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("fikrihadaya@gmail.com") // Ganti emailmu
                putExtra(Intent.EXTRA_SUBJECT, "Halo dari Aplikasi Profil")
            }
            startActivity(intent)
        }

        // Find Me (Google Maps)
        btnFindMe.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:-6.8868,107.6131?q=Bandung")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }

        // About
        btnAbout.setOnClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle("Tentang Aplikasi")
                .setMessage("UTS Pemerograman Android 3 - Hadaya Fikri Nur Aqillah (10122432)")
                .setPositiveButton("Tutup", null)
                .show()
        }

        return view
    }
}