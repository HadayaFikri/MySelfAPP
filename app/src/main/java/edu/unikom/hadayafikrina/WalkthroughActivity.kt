package edu.unikom.hadayafikrina

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import android.widget.Button
import  android.content.Intent
import  android.widget.Toast


class WalkthroughActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var btnNext: Button

    private val layouts = listOf(
        R.layout.activity_walkthrough2,
        R.layout.activity_walkthrough4,
        R.layout.activity_walkthrough3,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walkthrough)

        viewPager = findViewById(R.id.viewPager)
        btnNext = findViewById(R.id.btnNext)

        val adapter = object : RecyclerView.Adapter<PagerViewHolder>() {
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
                val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
                return PagerViewHolder(view)
            }

            override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
                if (position == 2) { // halaman terakhir
                    val btnGetStarted = holder.itemView.findViewById<Button>(R.id.btnGetStarted)
                    btnGetStarted?.setOnClickListener {
                        val intent = Intent(this@WalkthroughActivity, MainActivity::class.java)
                        startActivity(intent)
                        finish()
                    }
                }
            }

            override fun getItemCount(): Int = layouts.size
            override fun getItemViewType(position: Int): Int = layouts[position]
        }

        viewPager.adapter = adapter

        btnNext.setOnClickListener {
            val nextItem = viewPager.currentItem + 1
            if (nextItem < layouts.size) {
                viewPager.currentItem = nextItem
            }
        }


        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                btnNext.visibility = if (position == layouts.lastIndex) View.GONE else View.VISIBLE
            }
        })
    }

    class PagerViewHolder(view: View) : RecyclerView.ViewHolder(view)
}
