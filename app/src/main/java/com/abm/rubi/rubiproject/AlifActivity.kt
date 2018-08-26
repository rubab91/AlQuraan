package com.abm.rubi.rubiproject

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class AlifActivity : AppCompatActivity() {
    var alif: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alif)

        alif = findViewById(R.id.alif)
        alif?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this, R.raw.alif)
            ring.start()
        })

    }
}
