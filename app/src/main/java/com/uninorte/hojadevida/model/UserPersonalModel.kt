package com.uninorte.hojadevida.model

import android.net.Uri
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class UserPersonalModel (val name: String ,
                         val age : Int,
                         val state : String,
                         val img: Int) : Parcelable {
}