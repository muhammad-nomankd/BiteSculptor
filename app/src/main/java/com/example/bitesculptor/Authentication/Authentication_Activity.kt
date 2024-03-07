package com.example.bitesculptor.Authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bitesculptor.R

class Authentication_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_authentication)
        supportFragmentManager.beginTransaction()
            .replace(R.id.Authentication_Activity, Login_Fragment())
            .commit()
    }
}