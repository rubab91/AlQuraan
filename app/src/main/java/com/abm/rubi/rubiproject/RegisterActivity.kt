package com.abm.rubi.rubiproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.R.attr.start
import android.R.raw
import android.media.MediaPlayer



class RegisterActivity : AppCompatActivity() {

    lateinit var buttonSubmit: Button

    // This is call to button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        buttonSubmit = findViewById(R.id.btn_submit)
        buttonSubmit.setOnClickListener(View.OnClickListener {


            var mIntent = Intent(this, MainActivity::class.java)
            startActivity(mIntent)
            Toast.makeText(this,"Information Submitted", Toast.LENGTH_LONG).show()
        })
    }
}
