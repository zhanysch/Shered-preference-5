package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)



        val textview= findViewById<EditText>(R.id.textView)
        val kurs = findViewById<EditText>(R.id.kurs)


        val data = intent.getStringExtra("fromlogin")

        val data2 = intent.getBooleanExtra("ettext",false)

        textView.text=data

        if (data2) { kurs.text = "from Login"

        } else {kurs.text= "from Registration"

        }




        Toast.makeText(applicationContext, data, Toast.LENGTH_LONG).show()

    }
}