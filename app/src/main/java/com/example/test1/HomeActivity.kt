package com.example.test1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {

    private var isCartImageOn = false
    private var isHeartImageOn = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)


        val all_button1 = findViewById<ImageButton>(R.id.all_button1)
        all_button1.setOnClickListener({
            val intent = Intent(this, PopularActivity::class.java)
            startActivity(intent)
        })


        val myCartImageButton: ImageButton = findViewById(R.id.basket_button)
        myCartImageButton.setOnClickListener {
            // Меняем состояние
            isCartImageOn = !isCartImageOn

            // Устанавливаем соответствующее изображение
            if (isCartImageOn) {
                myCartImageButton.setImageResource(R.drawable.sc5_shop_cart)
            } else {
                myCartImageButton.setImageResource(R.drawable.sc5_plus)
            }
        }


        val myHeartImageButton: ImageButton = findViewById(R.id.heart_button)

        myHeartImageButton.setOnClickListener {
            // Меняем состояние
            isHeartImageOn = !isHeartImageOn

            // Устанавливаем соответствующее изображение
            if (isHeartImageOn) {
                myHeartImageButton.setImageResource(R.drawable.sc5_white_heart)
            } else {
                myHeartImageButton.setImageResource(R.drawable.sc5_red_heart)
            }
        }
    }
}