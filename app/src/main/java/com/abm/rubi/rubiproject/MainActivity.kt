package com.abm.rubi.rubiproject

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import butterknife.OnClick

class MainActivity : AppCompatActivity() {

     var Buttonloging: Button? = null
     var buttonRegister: Button? = null

    lateinit var homeScreen: HomeScreen
    var editViewusername: EditText? = null
    var editViewPassword: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Buttonloging = findViewById(R.id.btn_login)
        Buttonloging?.setOnClickListener(View.OnClickListener {
          //  val intent = Intent(this, HomeScreen::class.java)
            val mintent = Intent(this, HomeScreen::class.java)
            startActivity(mintent)
            Toast.makeText(this,"Successfully logged In.", Toast.LENGTH_SHORT).show()
        })

        buttonRegister = findViewById(R.id.btn_register)
        buttonRegister?.setOnClickListener(View.OnClickListener {
            val mIntent = Intent(this, RegisterActivity::class.java)
            startActivity(mIntent)
            Toast.makeText(this, "Register Page Launch", Toast.LENGTH_SHORT).show()
        })



    }

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent) }

    }
}
