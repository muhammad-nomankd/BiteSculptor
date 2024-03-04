package com.example.bitesculptor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Authentication_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_authentication)
        supportFragmentManager.beginTransaction()
            .replace(R.id.Authentication_Activity,Login_Fragment())
            .commit()
    }
}