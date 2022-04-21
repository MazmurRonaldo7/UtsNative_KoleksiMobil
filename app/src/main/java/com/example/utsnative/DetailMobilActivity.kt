package com.example.utsnative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailMobilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_mobil)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val mobil = intent.getParcelableExtra<mobil>(MainActivity.INTENT_PARCELABLE)

        val imgMobil = findViewById<ImageView>(R.id.img_item_photo)
        val nameMobil = findViewById<TextView>(R.id.tv_item_name)
        val descMobil = findViewById<TextView>(R.id.tv_item_description)

        imgMobil.setImageResource(mobil?.imgMobil!!)
        nameMobil.text = mobil.nameMobil
        descMobil.text = mobil.descMobil
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}