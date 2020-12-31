package org.abubaker.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
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
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randInt.toString()
    }

}