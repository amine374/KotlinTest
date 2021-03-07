package com.example.tortue_ninja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click_btn(view:View)
    {
        var img : ImageView = findViewById<ImageView>(R.id.imageView)
        if(view.id == R.id.radioButton)
            img.setImageResource(R.drawable.tmntleo)
        else if (view.id == R.id.radioButton2)
            img.setImageResource(R.drawable.tmntmike)
        else if (view.id == R.id.radioButton3)
            img.setImageResource(R.drawable.tmntdon)
        else
            img.setImageResource(R.drawable.tmntraph)
    }
}