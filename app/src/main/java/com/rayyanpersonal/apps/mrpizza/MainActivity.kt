package com.rayyanpersonal.apps.mrpizza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var username: EditText
    private lateinit var pass:EditText
    private lateinit var login:Button

    private lateinit var signup: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SetViews()
        val toast = Toast.makeText(applicationContext, "Hello Javatpoint", Toast.LENGTH_LONG)
        toast.show()

    }

    private fun SetViews() {
        username = findViewById<EditText>(R.id.user)
        pass= findViewById<EditText>(R.id.pass)
        login= findViewById<Button>(R.id.login)
        signup= findViewById<Button>(R.id.signup)
    }
}