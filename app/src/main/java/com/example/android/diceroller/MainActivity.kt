package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val countUpButton: Button = findViewById(R.id.count_up_button)
        countUpButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        //resultText.text = "Dice Rolled!"
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        try {
            var textValue = resultText.text.toString().toInt()
            if (textValue != 6) {
                textValue += 1
                resultText.text = textValue.toString()
            }
        } catch (nfe: NumberFormatException) {
            resultText.text = "1"
        }
    }
}