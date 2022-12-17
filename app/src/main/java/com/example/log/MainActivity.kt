package com.example.log

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    lateinit var btnLogin:AppCompatButton
    lateinit var edtName:EditText
    lateinit var edtPassword:EditText
    lateinit var btn2:AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin=findViewById(R.id.btn1)
        edtName=findViewById(R.id.txt1)
        edtPassword=findViewById(R.id.text2)
        btn2=findViewById(R.id.btn2)

        if (this::edtName.isInitialized) {
            Log.d("MainActivity","editName has been Initialized...")
        }
    }

    override fun onStart() {
        super.onStart()
        btnLogin.setOnClickListener {
            var username:String = edtName.text.toString()
            var password:String = edtPassword.text.toString()

            var intent = Intent(this,Welcome::class.java)

            intent.putExtra("username",username)
            intent.putExtra("password",password)

            startActivity(intent)
        }

        btn2.setOnClickListener {


            var intent = Intent(this,Reg::class.java)
            startActivity(intent)
        }
    }


}