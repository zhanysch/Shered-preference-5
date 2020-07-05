package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        val EdtLogin = findViewById<EditText>(R.id.EdtLogin)
        val  EDpass = findViewById<EditText>(R.id.EDpass)
        val Update = findViewById<Button>(R.id.Update)
        val Out = findViewById<Button>(R.id.Out)






        







        Out.setOnClickListener {


            val intent = Intent(this,MainActivity::class.java)

            startActivity(intent)


        }













    }
}


