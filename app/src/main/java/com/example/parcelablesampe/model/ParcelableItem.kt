package com.example.parcelablesampe.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ParcelableItem(var sample: String) : Parcelable
