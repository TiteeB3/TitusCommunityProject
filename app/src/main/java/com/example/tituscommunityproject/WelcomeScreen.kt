package com.example.tituscommunityproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.ProgressBar
import android.widget.RelativeLayout
import com.google.android.material.navigation.NavigationView
import kotlin.reflect.KClass

class WelcomeScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_welcome_screen)
        supportActionBar!!.hide()

        val handler = Handler()
        handler.postDelayed({
            startActivity(Intent(this@WelcomeScreen, CategoryPage::class.java))
            finish()
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_right)
        }, 5000)

        val secondrelativeLayout = findViewById<RelativeLayout>(R.id.secondlayertobetransparent)
        secondrelativeLayout.background.alpha = 240


    }
}