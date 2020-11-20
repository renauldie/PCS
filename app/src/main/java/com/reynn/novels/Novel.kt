package com.reynn.novels

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity
data class Novel(
        @PrimaryKey(autoGenerate = true)
        var id: Int = 0,
        var nama: String = "",
        var penulis:String = "",
        var keterangan:String = "",
        var gambar: String = "",
        var rating: Double = 0.0
) : Parcelable