package com.example.lecture14exam

import android.os.Parcelable
import android.widget.ImageView
import kotlinx.android.parcel.Parcelize

@Parcelize
class UserModel(val firstName: String, val lastName: String, val email: String) : Parcelable