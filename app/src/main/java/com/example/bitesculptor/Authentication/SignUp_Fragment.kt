package com.example.bitesculptor.Authentication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.example.bitesculptor.R


class SignUp_Fragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
         val name:EditText =view.findViewById(R.id.name)
        val emailtxt:EditText = view.findViewById(R.id.Email)

        val alrdyhanaccount:TextView=view.findViewById(R.id.already_have_account)
        alrdyhanaccount.setOnClickListener {
            fragmentManager?.beginTransaction()
                ?.replace(R.id.Authentication_Activity, Login_Fragment())
                ?.commit()

        }

    }

    }
