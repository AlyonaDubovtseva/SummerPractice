package com.example.homework1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val email = intent.getStringExtra("email")
        val password = intent.getStringExtra("password")

        val emailTextView = findViewById<TextView>(R.id.textViewEmail)
        val passwordTextView = findViewById<TextView>(R.id.textViewPassword)

        emailTextView.text = "Email: $email"
        passwordTextView.text = "Пароль: $password"
    }
}