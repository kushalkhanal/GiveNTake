package com.example.giventake

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.giventake.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var loginBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)

        loginBinding.loginBtn.setOnClickListener {
            var intent = Intent(this@LoginActivity,DashboardActivity::class.java)
            startActivity(intent)

            loginBinding.signupBtn.setOnClickListener {
                var intent = Intent(this@LoginActivity, SignupActivity::class.java)
                startActivity(intent)
            }

        }
    }
}