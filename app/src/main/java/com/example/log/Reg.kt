package com.example.log

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class Reg : AppCompatActivity() {
    lateinit var btn:AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)

        btn=findViewById(R.id.btnreg)
    }

    override fun onStart() {
        super.onStart()

        btn.setOnClickListener {

            Toast.makeText(this,"Done",Toast.LENGTH_LONG)
                .show()


        }
    }
}