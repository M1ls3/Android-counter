package com.example.myapplication3

import MyViewModel
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val myViewModel: MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        myViewModel.text.observe(this) { newValue ->
            textView.text = newValue // тут я не поняв шо воно робить, але це щось типу
        // стежить за змінами у значенні text з ViewModel, кожного разу, коли
        // значення text змінюється ця зміна автоматично відображається в TextView на екрані.
        }

        button1.setOnClickListener {
            myViewModel.onButton1Click()
        }

        button2.setOnClickListener {
            myViewModel.onButton2Click()
        }
    }
}
