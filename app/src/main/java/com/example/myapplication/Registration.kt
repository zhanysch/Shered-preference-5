package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)


        setContentView(R.layout.activity_registration)



        val five = findViewById<Button>(R.id.five)

        val three = findViewById<EditText>(R.id.three)
        val  four = findViewById<EditText>(R.id.four)
        five.setOnClickListener {

            val text = three.text.toString()


            Toast.makeText(applicationContext, data, Toast.LENGTH_LONG).show()



        }



}