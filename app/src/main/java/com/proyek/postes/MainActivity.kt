package com.AGUNG.pertemuan1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.AGUNG.pertemuan1.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            val fullName = binding.etFullName.text.toString()
            val username = binding.etUsername.text.toString()
            val email = binding.etEmail.text.toString()
            val umur = binding.etUmur.text.toString()
            val password = binding.etPassword.text.toString()
            val confirmPassword = binding.etConfirmPassword.text.toString()
            val gender = if (binding.rbLaki.isChecked) "Laki-laki" else "Perempuan"


            if (fullName.isEmpty() || username.isEmpty() || email.isEmpty() ||
                umur.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()
            ) {
                Toast.makeText(this, "Harap isi semua kolom terlebih dahulu!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }


            if (password != confirmPassword) {
                Toast.makeText(this, "Password dan konfirmasi tidak sama!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }


            val intent = Intent(this, ResultActivity::class.java).apply {
                putExtra("FULL_NAME", fullName)
                putExtra("USERNAME", username)
                putExtra("EMAIL", email)
                putExtra("UMUR", umur)
                putExtra("GENDER", gender)
                putExtra("PASSWORD", password)
            }
            startActivity(intent)
        }
    }
}