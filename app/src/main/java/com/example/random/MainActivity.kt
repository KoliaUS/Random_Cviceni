package com.example.random

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var button : Button
    lateinit var textView: TextView
    lateinit var editTextNumber: EditText

    var cislo =0
    var rand = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        editTextNumber = findViewById(R.id.editTextNumber)


        button.setOnClickListener() {
        cislo = editTextNumber.text.toString().toInt()
            if(cislo>1) {
                rand = (1..cislo).random()
                textView.text =(""+rand)
            }
            else{
                textView.text="Zadali jste spatny cislo"
            }
        }

    }
}