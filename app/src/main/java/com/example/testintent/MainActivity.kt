package com.example.testintent

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{

        fun newIntent(context: Context, email : String) : Intent
        {
            val intent  = Intent(context,MainActivity::class.java)
            intent.putExtra(Login.EMAIL,email)
            return  intent
        }
    }
    lateinit var Email: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = intent
        Email = intent.getStringExtra(Login.EMAIL)
        tvEmail.text = Email
    }


}
