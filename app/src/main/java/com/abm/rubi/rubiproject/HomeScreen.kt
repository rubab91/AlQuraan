package com.abm.rubi.rubiproject

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.View
import android.widget.FrameLayout
import android.widget.Toast

class HomeScreen : AppCompatActivity() {
    var mainContainer: ConstraintLayout? = null
    var surrahButton: FrameLayout? = null

    var alphabitLayout: FrameLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        surrahButton = findViewById(R.id.surahs_container)
        surrahButton?.setOnClickListener(View.OnClickListener {
            val mIntent = Intent(this, AlfatehActivity::class.java)
            startActivity(mIntent)
        })
        mainContainer = findViewById(R.id.mainContainer)
        mainContainer?.setOnClickListener(View.OnClickListener {
           // val mIntent = Intent(this,AlfatehActivity::class.java)

        })

        alphabitLayout = findViewById(R.id.alphabit_container)
        alphabitLayout?.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Tab on Alphabet to pronounce", Toast.LENGTH_LONG).show()
//            val ring = MediaPlayer.create(this, R.raw.img_alif)
//            ring.start()
            val mIntent = Intent(this, InstructionActivity::class.java)
            startActivity(mIntent)
        })
    }
}
