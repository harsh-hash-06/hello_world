package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var MainTextView: TextView
    private lateinit var ChangeTextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainTextView = findViewById(R.id.main_text_view)
        ChangeTextButton = findViewById(R.id.change_text_button)

        ChangeTextButton.setOnClickListener {
            MainTextView.text = "Welcome to MADT Lab #1!"
        }
    }
}
