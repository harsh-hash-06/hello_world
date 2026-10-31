package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private lateinit var MainTextView: TextView
    private lateinit var ChangeTextButton: Button
    private lateinit var ChangeColorButton: Button
    private lateinit var ChangeBackgroundButton: Button
    private lateinit var MainLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainTextView = findViewById(R.id.main_text_view)
        ChangeTextButton = findViewById(R.id.change_text_button)
        ChangeColorButton = findViewById(R.id.change_color_button)
        ChangeBackgroundButton = findViewById(R.id.change_background_button)
        MainLayout = findViewById(R.id.main_layout)

        ChangeTextButton.setOnClickListener {
            MainTextView.text = "Welcome to MADT Lab #1!"
        }

        ChangeColorButton.setOnClickListener {
            ChangeColorClick()
        }

        ChangeBackgroundButton.setOnClickListener {
            ChangeBackgroundClick()
        }
    }

    fun ChangeColorClick() {
        MainTextView.setTextColor(ContextCompat.getColor(this, R.color.red))
    }

    fun ChangeBackgroundClick() {
        MainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.light_grey))
    }
}
