package com.rayyanpersonal.apps.mrpizza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    val username: EditText = findViewById<EditText>(R.id.user)
    val pass: EditText= findViewById<EditText>(R.id.pass)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}