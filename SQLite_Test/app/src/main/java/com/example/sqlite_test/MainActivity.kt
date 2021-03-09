package com.example.sqlite_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.BaseColumns
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var createButton : Button = findViewById<Button>(R.id.create)
        var updateButton : Button = findViewById<Button>(R.id.update)
    }
}