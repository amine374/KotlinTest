package com.example.file_reading

import android.icu.util.Output
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import java.io.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mySdPath = getExternalFilesDir(null).toString();
        val filename = "myFile.txt"

        var txtData : EditText = findViewById<EditText>(R.id.myText);
        var ecrireButton : Button = findViewById<Button>(R.id.ecrire);
        var effacerButton : Button = findViewById<Button>(R.id.effacer);
        var lireButton : Button = findViewById<Button>(R.id.lire);
        var sortirButton : Button = findViewById<Button>(R.id.sortir);



        ecrireButton.setOnClickListener{
            OutputStreamWriter(FileOutputStream(File(mySdPath, filename))).use {
                Log.i("amine", "le chemin est ${mySdPath + filename}")
                it.write( txtData?.text.toString())
            }
        }

        effacerButton.setOnClickListener{
            txtData.text = null
        }

        lireButton.setOnClickListener{
            InputStreamReader(FileInputStream(File(mySdPath, filename))).use {
                txtData!!.setText(it.readText())
            }
        }

        sortirButton.setOnClickListener{
            finish()
        }
    }
}