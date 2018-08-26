package com.abm.rubi.rubiproject

import android.content.Intent
import android.media.MediaPlayer
import android.os.Build.VERSION_CODES.M
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class AlphabitScreen : AppCompatActivity() {

    var buttonPlayAlif: Button? = null
    var alif: View? = null
    var bay: View? = null
    var thaa: View? = null
    var taa: View? = null
    var saa: View? = null
    var jeem: View? = null
    var haa: View? = null
    var khaa: View? = null
    var dall: View? = null
    var zaal: View? = null
    var raa: View? = null
    var zaa: View? = null
    var seen: View? = null
    var sheen: View? = null
    var swaat: View? = null
    var zay: View? = null
    var zwaat: View? = null
    var ain: View? = null
    var ghyn: View? = null
    var thuwaa: View? = null
    var zuwa: View? = null
    var faa: View? = null
    var qaaf: View? = null
    var kaaf: View? = null
    var laam: View? = null
    var meem: View? = null
    var noon: View? = null
    var wow: View? = null
    var smallhay: View? = null
    var amzaa: View? = null
    var yeey: View? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabit_screen)

//        buttonPlayAlif = findViewById(R.id.btn_alif_play)
//        buttonPlayAlif?.setOnClickListener(View.OnClickListener {
//            val ring = MediaPlayer.create(this, R.raw.img_alif)
//            ring.start()
//        })

        alif = findViewById(R.id.alif)
        alif?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this, R.raw.alif)
            ring.start()
            val mIntent = Intent(this, AlifActivity::class.java)
            startActivity(mIntent)
        })



        bay = findViewById(R.id.bay)
        bay?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this, R.raw.baa)
            ring.start()
            val mIntent = Intent(this, BaaActivity::class.java)
            startActivity(mIntent)
        })

        taa = findViewById(R.id.thay)
        taa?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this, R.raw.thaa)
            ring.start()
            val mIntent = Intent(this, TaaActivity::class.java)
            startActivity(mIntent)
        })

//        thaa = findViewById(R.id.thay)
//        thaa?.setOnClickListener(View.OnClickListener {
//            val ring = MediaPlayer.create(this, R.raw.thaa)
//            ring.start()
//            val mIntent = Intent(this, ThaaActivity::class.java)
//            startActivity(mIntent)
//        })

        thaa = findViewById(R.id.saa)
        thaa?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this, R.raw.thaa)
            ring.start()
            val mIntent = Intent(this, ThaaActivity::class.java)
            startActivity(mIntent)
        })

        jeem = findViewById(R.id.jeem)
        jeem?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this, R.raw.jiim)
            ring.start()
            val mIntent = Intent(this, JiimActivity::class.java)
            startActivity(mIntent)
        })

        haa = findViewById(R.id.hay)
        haa?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this, R.raw.jiim)
            ring.start()
            val mIntent = Intent(this, HaaActivity::class.java)
            startActivity(mIntent)
        })

        khaa = findViewById(R.id.kha)
        khaa?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this, R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, KhaaActivity::class.java)
            startActivity(mIntent)
        })

        dall = findViewById(R.id.daal)
        dall?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this, R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, DaalActivity::class.java)
            startActivity(mIntent)
        })

        zaal = findViewById(R.id.zaal)
        zaal?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, ZaalActivity::class.java)
            startActivity(mIntent)
        })

        raa = findViewById(R.id.ray)
        raa?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, RaaActivity::class.java)
            startActivity(mIntent)
        })

         zay = findViewById(R.id.zay)
        zay?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, ZaaActivity::class.java)
            startActivity(mIntent)
        })

        zaa = findViewById(R.id.zaa)
        zaa?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, ZuwaActivity::class.java)
            startActivity(mIntent)
        })

        zwaat = findViewById(R.id.tv_zwaat)
        zwaat?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, ZwaatActivity::class.java)
            startActivity(mIntent)
        })

        zaal = findViewById(R.id.zaal)
        zaal?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, ZaalActivity::class.java)
            startActivity(mIntent)
        })

        seen = findViewById(R.id.seen)
        seen?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, SeenActivity::class.java)
            startActivity(mIntent)
        })

        sheen = findViewById(R.id.sheen)
        sheen?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, SheenActivity::class.java)
            startActivity(mIntent)
        })

        swaat = findViewById(R.id.saat)
        swaat?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, SaatActivity::class.java)
            startActivity(mIntent)
        })


        ain = findViewById(R.id.aen)
        ain?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, AinActivity::class.java)
            startActivity(mIntent)
        })

        ghyn = findViewById(R.id.ghayn)
        ghyn?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, GhynActivity::class.java)
            startActivity(mIntent)
        })

        faa = findViewById(R.id.fay)
        faa?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, FaaActivity::class.java)
            startActivity(mIntent)
        })

        qaaf = findViewById(R.id.qaaf)
        qaaf?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, QaafActivity::class.java)
            startActivity(mIntent)
        })

        kaaf = findViewById(R.id.kaaf)
        kaaf?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, KaafActivity::class.java)
            startActivity(mIntent)
        })

        laam = findViewById(R.id.laam)
        laam?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, LaamActivity::class.java)
            startActivity(mIntent)
        })

        meem = findViewById(R.id.meem)
        meem?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, MeemActivity::class.java)
            startActivity(mIntent)
        })

        noon = findViewById(R.id.noon)
        noon?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, NoonActivty::class.java)
            startActivity(mIntent)
        })

        wow = findViewById(R.id.woow)
        wow?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, WowActivity::class.java)
            startActivity(mIntent)
        })

        smallhay = findViewById(R.id.haa)
        smallhay?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, SmallHaaActivity::class.java)
            startActivity(mIntent)
        })

        amzaa = findViewById(R.id.amzaa)
        amzaa?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, AmzaActivity::class.java)
            startActivity(mIntent)
        })

        yeey = findViewById(R.id.yee)
        yeey?.setOnClickListener(View.OnClickListener {
            val ring = MediaPlayer.create(this,R.raw.khaa)
            ring.start()
            val mIntent = Intent(this, YeeActivity::class.java)
            startActivity(mIntent)
        })



    }
}
