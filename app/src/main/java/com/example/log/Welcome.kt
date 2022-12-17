package com.example.log

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class Welcome : AppCompatActivity() {
    lateinit var displayInfo:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        displayInfo = findViewById(R.id.displayInfo)



        var username: String = getIntent().getStringExtra("username").toString()
        var password: String = getIntent().getStringExtra("password").toString()
        Log.d("MainActivity","This is username : $username and password $password")

        displayInfo.setText("Hello $username !!! This Is Your Password : $password")
    }


}