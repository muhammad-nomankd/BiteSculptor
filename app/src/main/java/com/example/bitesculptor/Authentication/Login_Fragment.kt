package com.example.bitesculptor

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class Login_Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_login_, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val gotosignup:TextView=view.findViewById(R.id.dhaccount)
        gotosignup.setOnClickListener {
      fragmentManager?.beginTransaction()
          ?.replace(R.id.Authentication_Activity,SignUp_Fragment())
          ?.commit() }
    }


}