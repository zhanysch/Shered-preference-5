package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        val EdtLogin = findViewById<EditText>(R.id.EdtLogin)
        val  Edpass = findViewById<EditText>(R.id.Edpass)
        val Update = findViewById<Button>(R.id.Update)
        val Out = findViewById<Button>(R.id.Out)




        val text = getSharedPreferences("Preference", Context.MODE_PRIVATE).getString("text","")
        EdtLogin.setText(text)
        val text1 = getSharedPreferences("Preference", Context.MODE_PRIVATE).getString("text1","")
        Edpass.setText(text1)
        val preference = getSharedPreferences("Preference", Context.MODE_PRIVATE)


        Update.setOnClickListener {
            val text = EdtLogin.text.toString()
            val text1 = Edpass.text.toString()

            preference.edit().putString("text",text).apply()
            preference.edit().putString("text1",text).apply()
        }
















        Out.setOnClickListener {

            val login =  preference.getString("text","not saved")

            EdtLogin.setText(login)

            val password =  preference.getString("text1","not saved")
            Edpass.setText(password )

            val intent = Intent(this,MainActivity::class.java)

            intent.putExtra("Login", login )
            intent.putExtra("Password",password)

            startActivity(intent)
            finish()


        }













    }
}


