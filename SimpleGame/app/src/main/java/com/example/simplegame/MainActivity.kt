package com.example.simplegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var points : Int  = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialization_fun()

    }

    fun initialization_fun()
    {
        var leftButton : Button = findViewById<Button>(R.id.left_button)
        var rightButton : Button = findViewById<Button>(R.id.right_button)
        val num1 = Random.nextInt(10)
        var num2 = Random.nextInt(10)
        while (num1 == num2)
        {
            num2 = Random.nextInt(10)
        }

        leftButton.text = num1.toString()
        rightButton.text = num2.toString()


    }

    fun left_fun(view: View)
    {
        val leftButton : Button = findViewById<Button>(R.id.left_button)
        val rightButton : Button = findViewById<Button>(R.id.right_button)
        val point : TextView = findViewById<TextView>(R.id.ptTV)
        var maximum : TextView = findViewById<TextView>(R.id.maximum)
        val num1 = leftButton.text.toString().toInt()
        val num2 = rightButton.text.toString().toInt()

        if(num1>num2)
        {
            points++
            Toast.makeText(this, "Vous avez gagné", Toast.LENGTH_SHORT).show()
        }

        else
        {
            points--
            Toast.makeText(this, "Vous avez perdu", Toast.LENGTH_SHORT).show()
        }
        point.text = "Points : $points"
        maximum.text = "Your Answer is : $num1"
        initialization_fun()
    }

    fun right_fun(view:View)
    {
        val leftButton : Button = findViewById<Button>(R.id.left_button)
        val rightButton : Button = findViewById<Button>(R.id.right_button)
        val point : TextView = findViewById<TextView>(R.id.ptTV)
        var maximum : TextView = findViewById<TextView>(R.id.maximum)
        val num1 = leftButton.text.toString().toInt()
        val num2 = rightButton.text.toString().toInt()

        if(num1<num2)
        {
            points++
            Toast.makeText(this, "Vous avez gagné", Toast.LENGTH_SHORT).show()
        }
        else
        {
            points--
            Toast.makeText(this, "Vous avez perdu", Toast.LENGTH_SHORT).show()
        }
        point.text = "Points : $points"
        maximum.text = "Your Answer is : $num2"
        initialization_fun()
    }




    /*fun BiggerCatch()
    {
        var title : TextView = findViewById<TextView>(R.id.titleTV)
        var description : TextView = findViewById<TextView>(R.id.prossTV)
        var maximum : TextView = findViewById<TextView>(R.id.maximum)
        var point : TextView = findViewById<TextView>(R.id.ptTV)

        var leftButton : Button = findViewById<Button>(R.id.left_button)
        var rightButton : Button = findViewById<Button>(R.id.right_button)
        var leftNum = leftButton.text.toString().toInt()
        var rightNum = rightButton.text.toString().toInt()

        var result = if(leftNum > rightNum)
                        leftNum
                     else
                         rightNum
        maximum.text = result.toString()
    }*/
}