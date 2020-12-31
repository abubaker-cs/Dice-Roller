package org.abubaker.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // onCreate - LifeTime
        super.onCreate(savedInstanceState)

        // Inflate Selected View and Draw it to the screen:
        setContentView(R.layout.activity_main)

        // Select the Button from the activity_main.xml
        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener{
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
        }
    }

}