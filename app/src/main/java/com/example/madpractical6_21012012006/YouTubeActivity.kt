package com.example.madpractical6_21012012006

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YouTubeActivity : AppCompatActivity() {
    private val youtubeId="enWy-sSrPKM"
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_you_tube)

        val mywebview=findViewById<WebView>(R.id.webview)
        val myplaybutton=findViewById<FloatingActionButton>(R.id.playbtn)
        myplaybutton.setOnClickListener {
            Intent(this,MainActivity::class.java).apply{
                startActivity(this)
            }
        }

        val webSettings:WebSettings=mywebview.settings
        webSettings.javaScriptEnabled=true
        webSettings.loadWithOverviewMode=true
        webSettings.useWideViewPort=true
        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeId")
        }

    }
