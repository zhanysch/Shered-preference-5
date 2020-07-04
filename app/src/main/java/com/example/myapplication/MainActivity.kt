package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val trueinputname ="maks"
    val truepass= "12345"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Btnregistr=findViewById<Button>(R.id.Btnregistr)




        Btnregistr.setOnClickListener {

            val intent = Intent(applicationContext,Registration::class.java)

            startActivity(intent)



        }




        val login = findViewById<Button>(R.id.log)
        val EDtName = findViewById<EditText>(R.id.EDtName)
        val EDpass = findViewById<EditText>(R.id.EDpass)

        login.setOnClickListener {
            val text = EDtName.text.toString()
            val passText = EDpass.text.toString()


            if (text== trueinputname && passText == truepass  ) {

                Toast.makeText(applicationContext, "data is correct", Toast.LENGTH_LONG ).show()
            }

            else {
                Toast.makeText(applicationContext, "data is not correct", Toast.LENGTH_LONG ).show()

            }




            val intent = Intent(applicationContext,Profile::class.java)

            intent.putExtra("fromlogin",text)
            intent.putExtra("ettext", true)




            startActivity(intent)

        }


}