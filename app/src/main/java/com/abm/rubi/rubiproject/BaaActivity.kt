package com.abm.rubi.rubiproject

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class BaaActivity : AppCompatActivity() {

    var baaImage: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baa)

        baaImage = findViewById(R.id.tv_baa)
        baaImage?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this, R.raw.baa)
            ring.start()
        })
    }
}
