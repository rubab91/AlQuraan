package com.abm.rubi.rubiproject

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.View

class AlfatehActivity : AppCompatActivity() {

    var surahFatehaContainer: ConstraintLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alfateh)

        val ring = MediaPlayer.create(this, R.raw.surah_fatiha)
        ring.start()

        surahFatehaContainer = findViewById(R.id.surahFatiha_container)
        surahFatehaContainer?.setOnClickListener(View.OnClickListener {
            val mIntent = Intent(this, SurahIkhlas::class.java)
            startActivity(mIntent)
            ring.stop()
        })

    }
}
