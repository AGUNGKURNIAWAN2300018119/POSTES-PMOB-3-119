package com.AGUNG.pertemuan1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.AGUNG.pertemuan1.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fullName = intent.getStringExtra("FULL_NAME")
        val username = intent.getStringExtra("USERNAME")
        val email = intent.getStringExtra("EMAIL")
        val umur = intent.getStringExtra("UMUR")
        val gender = intent.getStringExtra("GENDER")
        val password = intent.getStringExtra("PASSWORD")

        binding.tvFullName.text = "Full Name: $fullName"
        binding.tvUsername.text = "Username: $username"
        binding.tvEmail.text = "Email: $email"
        binding.tvUmur.text = "Age: $umur"
        binding.tvGender.text = "Gender: $gender"
        binding.tvPassword.text = "Password: $password"
    }
}
