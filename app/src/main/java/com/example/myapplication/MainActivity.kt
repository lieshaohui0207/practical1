package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // result_text.text = "Dice Rolled!!"

        roll_button.setOnClickListener {
            rollDice()
        }
    }
    private fun rollDice(){
       //Toast.makeText(this,"button clicked", Toast.LENGTH_SHORT).show()

       // val x:Int = 10///int x =10
        //var y:Int = 10/// int y = 10


        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        dice_image.setImageResource(drawableResource)
        //val resultText: TextView = findViewById(R.id.result_text)
       // result_text.text = randomInt.toString()
    }
}
