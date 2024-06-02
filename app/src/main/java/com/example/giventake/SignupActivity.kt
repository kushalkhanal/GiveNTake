package com.example.giventake

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.giventake.databinding.ActivityLoginBinding
import com.example.giventake.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    private lateinit var signupBinding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        signupBinding = ActivitySignupBinding.inflate (layoutInflater)
        setContentView(signupBinding.root)


        signupBinding.signupButton.setOnClickListener{
            intent= Intent(this@SignupActivity,LoginActivity::class.java)
            startActivity(intent)

        }

    }
}