package com.example.test1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ScornfulActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_scornful2)

        val Button1 = findViewById<ImageButton>(R.id.imageButton)

        Button1.setOnClickListener({
            val intent = Intent(this, ScornfulActivity3::class.java);
            startActivity(intent);
        })
    }
}