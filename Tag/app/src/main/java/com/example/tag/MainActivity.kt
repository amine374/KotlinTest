package com.example.tag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    val manager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("tag", "onCreate")
    }

    fun ajouterA(view: View)
    {
        val trans = manager.beginTransaction()
        val fragA = Fragment_A()
        if(!fragA.isAdded)
        {
            trans.add(R.id.frame, fragA)
        }
    }

    fun ajouterB(view:View)
    {
        val trans = manager.beginTransaction()
        val fragB = Fragment_B()
        if(!fragB.isAdded)
        {
            trans.add(R.id.frame, fragB)
        }
    }

    fun supprimerA(view:View)
    {
        val trans = manager.beginTransaction()
        val fragA = Fragment_B()
        if(!fragA.isAdded)
        {
            trans.remove(fragA)
        }
    }

    fun supprimerB(view: View)
    {
        val trans = manager.beginTransaction()
        val fragB = Fragment_B()
        if(fragB.isAdded)
        {
            trans.remove(fragB)
        }
    }

    fun remplacerA(view: View)
    {

    }

    fun remplacerB(view: View)
    {

    }



    override fun onResume() {
        super.onResume()
        Log.i("tag", "onResume")
    }

    

    override fun onStart() {
        super.onStart()
        Log.i("tag", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("tag", "onPause")
    }
}