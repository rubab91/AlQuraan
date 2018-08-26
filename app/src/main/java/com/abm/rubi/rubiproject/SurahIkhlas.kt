package com.abm.rubi.rubiproject

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.View

class SurahIkhlas : AppCompatActivity() {

    var surrahIkhlasContainer: ConstraintLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_surah_ikhlas)

        val ring = MediaPlayer.create(this, R.raw.sura_ekhlas)
        ring.start()



        surrahIkhlasContainer = findViewById(R.id.surahIkhlasContainer)
        surrahIkhlasContainer?.setOnClickListener(View.OnClickListener {
            val mIntent = Intent(this,SurahFalaq::class.java)
            startActivity(mIntent)
            ring.stop()
        })
    }
}
