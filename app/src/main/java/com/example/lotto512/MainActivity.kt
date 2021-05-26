package com.example.lotto512

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val constellationcardview = findViewById<CardView>(R.id.constellation_card)
        val namecardview = findViewById<CardView>(R.id.name_card)
        val randomcardview = findViewById<CardView>(R.id.random_card)

        constellationcardview.setOnClickListener {
            startActivity(Intent(this@MainActivity,ConstellationActivity::class.java))
        }
        namecardview.setOnClickListener {
            startActivity(Intent(this@MainActivity,NameActivity::class.java))
        }
        randomcardview.setOnClickListener {
            startActivity(Intent(this@MainActivity,ResultActivity::class.java))
        }
    }
}