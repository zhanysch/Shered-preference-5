package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_profile.*

class MainActivity : AppCompatActivity() {
     val trueLogin = "maks"
         val truepassword = "Vasya"
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






        val Btnregistr = findViewById<Button>(R.id.Btnregistr)
        val Btnlog= findViewById<Button>(R.id.Btnlog)
        val EdtName = findViewById<EditText>(R.id.EdtName)
        val EDpas = findViewById<EditText>(R.id.EDpass)

        val preference = getSharedPreferences("Preference", Context.MODE_PRIVATE)

        val textFromPref =  preference.getString("text","not saved")
        EdtName.setText(textFromPref)

        val textFromProf =  preference.getString("text1","not saved")
        EDpas.setText(textFromProf )



        Btnregistr.setOnClickListener {

            val text = EdtName.text.toString()

            preference.edit().putString("text",text).apply()

            val text1 = EDpas.text.toString()

            preference.edit().putString("text1",text1).apply()





        }


        Btnlog.setOnClickListener {


            val textFromPref =  preference.getString("text","not saved")

            EdtName?.setText(textFromPref)

            val textFromProf =  preference.getString("text1","not saved")
            EDpas?.setText(textFromProf )

             val login = EdtName.text.toString()
            val passw= EDpas.text.toString()
            if (login == trueLogin && passw == truepassword) {
                Toast.makeText(applicationContext, "data is correct", Toast.LENGTH_LONG).show()
                val intent = Intent(this, Profile::class.java)
                startActivity(intent)

            }

                else {
                Toast.makeText(applicationContext, "data is not correct", Toast.LENGTH_LONG).show()
            }
            }


















           








        }








    }


