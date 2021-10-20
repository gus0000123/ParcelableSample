package com.example.parcelablesampe

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.parcelablesampe.model.ParcelableItem
import com.example.parcelablesampe.model.SerializableItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Intent(this, RcvActivity::class.java).apply {
            putExtra(RcvActivity.EXTRA_PARCELABLE, ParcelableItem("this is ParcelableItem"))
            putExtra(RcvActivity.EXTRA_SERIALIZABLE, SerializableItem("this is SerializableItem"))
        }.let {
            startActivity(it)
        }
    }
}