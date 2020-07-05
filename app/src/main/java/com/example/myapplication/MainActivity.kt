package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






        val Btnregistr = findViewById<Button>(R.id.Btnregistr)
        val Btnlog= findViewById<Button>(R.id.Btnlog)
        val EdtName = findViewById<EditText>(R.id.EdtName)
        val EDpas = findViewById<EditText>(R.id.EDpass)

        val preference = getSharedPreferences("Preference", Context.MODE_PRIVATE)


        Btnregistr.setOnClickListener {

            val text = EdtName.text.toString()

            preference.edit().putString("text",text).apply()

            val text1 = EDpas.text.toString()

            preference.edit().putString("text1",text1).apply()

            Toast.makeText(applicationContext, "data is saved", Toast.LENGTH_LONG ).show()



        }


        Btnlog.setOnClickListener {


            val textFromPref =  preference.getString("text","not saved")

            EdtName.setText(textFromPref)

            val textFromProf =  preference.getString("text1","not saved")
            EDpas.setText(textFromProf )



            val intent = Intent(this, Profile::class.java )




            startActivity(intent)


        }




    }


}