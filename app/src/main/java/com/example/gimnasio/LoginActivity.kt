package com.example.gimnasio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Handle the login button click
        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (isCredentialsValid(username, password)) {
                // Successful login
                // You can start a new activity or perform other actions here
            } else {
                // Invalid credentials, show an error message
                // You can use a Toast or TextView to display an error message
            }
        }
    }


    private fun isCredentialsValid(username: String, password: String): Boolean {
        // You should implement your authentication logic here
        // For simplicity, we'll consider it valid if both fields are non-empty
        return username.isNotEmpty() && password.isNotEmpty()
    }
}
