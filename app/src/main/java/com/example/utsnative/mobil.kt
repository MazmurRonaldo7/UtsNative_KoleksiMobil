package com.example.utsnative

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class mobil(
    val imgMobil: Int,
    val nameMobil: String,
    val descMobil: String
) : Parcelable