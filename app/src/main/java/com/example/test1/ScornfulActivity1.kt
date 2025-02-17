package com.example.test1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class ScornfulActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scornful1)

        val Button1 = findViewById<ImageButton>(R.id.imageButton)

        Button1.setOnClickListener({
            val intent = Intent(this, ScornfulActivity2::class.java);
            startActivity(intent);
        })
    }


}