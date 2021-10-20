package com.example.parcelablesample

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.parcelablesample.model.ParcelableItem
import com.example.parcelablesample.model.SerializableItem

class RcvActivity : AppCompatActivity() {
    var TAG = javaClass.simpleName

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rcv)

        val parcelableSample = intent.getParcelableExtra<ParcelableItem>(EXTRA_PARCELABLE)
        val serializableSample = intent.getSerializableExtra(EXTRA_SERIALIZABLE) as SerializableItem

        findViewById<TextView>(R.id.tvP).text = "${parcelableSample}"
        findViewById<TextView>(R.id.tvS).text = "${serializableSample}"
    }

    companion object {
        const val EXTRA_PARCELABLE = "Parcelable"
        const val EXTRA_SERIALIZABLE = "Serializable"
    }
}