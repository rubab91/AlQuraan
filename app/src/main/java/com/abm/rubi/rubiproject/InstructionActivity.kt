package com.abm.rubi.rubiproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class InstructionActivity : AppCompatActivity() {
    var doneButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instruction)

        doneButton = findViewById(R.id.btn_done)
        doneButton?.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Tab on Alphabet to pronounce", Toast.LENGTH_LONG).show()
//            val ring = MediaPlayer.create(this, R.raw.img_alif)
//            ring.start()
            val mIntent = Intent(this, AlphabitScreen::class.java)
            startActivity(mIntent)
        })

    }
}
