package org.abubaker.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // onCreate - LifeTime
        super.onCreate(savedInstanceState)

        // Inflate Selected View and Draw it to the screen:
        setContentView(R.layout.activity_main)

        // Select the Button from the activity_main.xml
        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener {
            // Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val randInt = Random().nextInt(6) + 1
        // val resultText: TextView = findViewById(R.id.result_text)
        // resultText.text = randInt.toString()
        val diceImage: ImageView = findViewById(R.id.dice_image)

        // When = Switch Case
        val drawableResource = when (randInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Assign
        diceImage.setImageResource(drawableResource)
    }

}