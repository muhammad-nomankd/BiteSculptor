package com.example.bitesculptor

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.os.Looper
import com.example.bitesculptor.Authentication.Authentication_Activity

class SplashScreen : AppCompatActivity() {
    private val DELAY_IN_MILLIS: Long = 2000
    @Suppress("DEPRECATION")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Authentication_Activity::class.java)
            startActivity(intent)
            finish()
        }, DELAY_IN_MILLIS)
    }
}
