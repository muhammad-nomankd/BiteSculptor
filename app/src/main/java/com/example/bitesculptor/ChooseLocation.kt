package com.example.bitesculptor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class ChooseLocation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_location)
        val chooselocation:AutoCompleteTextView=findViewById(R.id.location_list)
        val location = arrayOf("Nowshera","Peshawar","Kohat","Mardan","Charsadda",)
        val adapter=ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,location)
        chooselocation.setAdapter(adapter)
    }
}