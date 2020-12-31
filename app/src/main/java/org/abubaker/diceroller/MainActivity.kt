package org.abubaker.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // onCreate - LifeTime
        super.onCreate(savedInstanceState)

        // Inflate Selected View and Draw it to the screen:
        setContentView(R.layout.activity_main)
    }

}