package com.abm.rubi.rubiproject

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SurahFalaq : AppCompatActivity() {

    var buttonDone: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_surah_falaq)
        val ring = MediaPlayer.create(this, R.raw.surah_falaq)
        ring.start()



        buttonDone = findViewById(R.id.btn_done)
        buttonDone?.setOnClickListener(View.OnClickListener {
            val mIntent = Intent(this, HomeScreen::class.java)
            startActivity(mIntent)
            ring.stop()
        })
    }
}
