package com.example.toas_nabila

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Aplikasi Berjalan", Toast.LENGTH_SHORT).show()

        val nama = findViewById<Button>(R.id.nama)
        val nis = findViewById<Button>(R.id.nis)
        val kelas = findViewById<Button>(R.id.kelas)

        nama.setOnClickListener {
            Toast.makeText(this, "Nabila Azzahra", Toast.LENGTH_SHORT).show()
        }
        nis.setOnClickListener {
        Toast.makeText(this, "2233300", Toast.LENGTH_SHORT).show()
        }
        kelas.setOnClickListener {
            Toast.makeText(this, "XI PPLG 2", Toast.LENGTH_SHORT).show()
        }

        }
    }