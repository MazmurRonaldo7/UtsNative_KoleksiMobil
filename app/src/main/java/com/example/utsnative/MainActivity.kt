package com.example.utsnative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val MobilList = listOf<mobil>(
            mobil(
                R.drawable.apollo,
                "Apollo",
                " sebuah film superhero Amerika Serikat yang dirilis pada 17 Juli 2015. Film ini merupakan film kedua belas di Marvel Cinematic Universe. Film ini dibintangi oleh Paul Rudd, Evangeline Lilly, Corey Stoll, Bobby Cannavale, Michael Peña, Judy Greer, Tip \"T.I\" Harris, David Dastmalchian, Wood Harris, Jordi Mollà, dan Michael Douglas."
            ),
            mobil(
                R.drawable.ferrari,
                "Ferrari",
                " sebuah film superhero Amerika Serikat yang dirilis pada 17 Juli 2015. Film ini merupakan film kedua belas di Marvel Cinematic Universe. Film ini dibintangi oleh Paul Rudd, Evangeline Lilly, Corey Stoll, Bobby Cannavale, Michael Peña, Judy Greer, Tip \"T.I\" Harris, David Dastmalchian, Wood Harris, Jordi Mollà, dan Michael Douglas."
            ),
            mobil(
                R.drawable.lamborgini,
                "Lamborgini",
                " sebuah film superhero Amerika Serikat yang dirilis pada 17 Juli 2015. Film ini merupakan film kedua belas di Marvel Cinematic Universe. Film ini dibintangi oleh Paul Rudd, Evangeline Lilly, Corey Stoll, Bobby Cannavale, Michael Peña, Judy Greer, Tip \"T.I\" Harris, David Dastmalchian, Wood Harris, Jordi Mollà, dan Michael Douglas."
            ),
            mobil(
                R.drawable.buggati,
                "Buggati",
                " sebuah film superhero Amerika Serikat yang dirilis pada 17 Juli 2015. Film ini merupakan film kedua belas di Marvel Cinematic Universe. Film ini dibintangi oleh Paul Rudd, Evangeline Lilly, Corey Stoll, Bobby Cannavale, Michael Peña, Judy Greer, Tip \"T.I\" Harris, David Dastmalchian, Wood Harris, Jordi Mollà, dan Michael Douglas."
            ),
            mobil(
                R.drawable.pagani,
                "Pagani",
                " sebuah film superhero Amerika Serikat yang dirilis pada 17 Juli 2015. Film ini merupakan film kedua belas di Marvel Cinematic Universe. Film ini dibintangi oleh Paul Rudd, Evangeline Lilly, Corey Stoll, Bobby Cannavale, Michael Peña, Judy Greer, Tip \"T.I\" Harris, David Dastmalchian, Wood Harris, Jordi Mollà, dan Michael Douglas."
            ),
            mobil(
                R.drawable.panoz,
                "Panoz",
                " sebuah film superhero Amerika Serikat yang dirilis pada 17 Juli 2015. Film ini merupakan film kedua belas di Marvel Cinematic Universe. Film ini dibintangi oleh Paul Rudd, Evangeline Lilly, Corey Stoll, Bobby Cannavale, Michael Peña, Judy Greer, Tip \"T.I\" Harris, David Dastmalchian, Wood Harris, Jordi Mollà, dan Michael Douglas."
            ),

            )

        val recyclerView= findViewById<RecyclerView>(R.id.rv_mobil)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MobilAdapter(this, MobilList){
            val intent = Intent(this,DetailMobilActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}