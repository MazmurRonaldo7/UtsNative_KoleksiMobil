package com.example.utsnative

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MobilAdapter (private val context: Context, private val mobil: List<mobil>, val listener: (mobil) ->Unit)
    : RecyclerView.Adapter<MobilAdapter.MobilViewHolder>(){

    class MobilViewHolder (view: View): RecyclerView.ViewHolder(view) {

        val imgMobil = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameMobil = view.findViewById<TextView>(R.id.tv_item_name)
        val descMobil = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(mobil: mobil, listener: (mobil) -> Unit) {
            imgMobil.setImageResource(mobil.imgMobil)
            nameMobil.text = mobil.nameMobil
            descMobil.text = mobil.descMobil
            itemView.setOnClickListener{listener(mobil)}

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MobilViewHolder {
        return MobilViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_mobil,parent, false)
        )
    }

    override fun onBindViewHolder(holder: MobilViewHolder, position: Int) {
        holder.bindView(mobil[position], listener)
    }

    override fun getItemCount(): Int = mobil.size
}