package com.example.tituscommunityproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.RelativeLayout
import android.widget.ScrollView

class AppInformationPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_information_page)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        supportActionBar!!.hide()

        val scrowViewToBeTransparent = findViewById<ScrollView>(R.id.scrowviewtobetransparent)
        scrowViewToBeTransparent.background.alpha = 220

        val relativeViewToBeTransparent = findViewById<RelativeLayout>(R.id.relativeviewtotransparent)
        relativeViewToBeTransparent.background.alpha = 220
    }
}