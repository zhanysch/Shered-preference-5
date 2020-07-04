package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        var EdtLogin = findViewById<EditText>(R.id.EdtLogin)
        var  EDpass = findViewById<EditText>(R.id.EDpass)
        val Update = findViewById<Button>(R.id.Update)
        val Out = findViewById<Button>(R.id.Out)

        val data = intent.getStringExtra("fromlogin")
        val data2 = intent.getStringExtra("from password")

        EdtLogin.text=data
        EDpass.text=data2











    }
}


