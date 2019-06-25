package com.example.testintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    lateinit var email : String
    companion object {
        val EMAIL = "EMAIL"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin.setOnClickListener {
            email = edEmail.text.toString()
            if (email.equals("cmk@gmail.com"))
            {
                startActivity(MainActivity.newIntent(applicationContext,email))
                finish()
            }
            else
                Toast.makeText(applicationContext, "Login Fail",Toast.LENGTH_LONG).show()
        }
    }
}
