package com.example.capturarelclickdeunbotn

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var resultTextView: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        resultTextView = findViewById(R.id.resultTextView)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            val number1String = editText1.text.toString()
            val number2String = editText2.text.toString()

            if (number1String.isEmpty() || number2String.isEmpty()) {
                resultTextView.setText(R.string.please_enter_both_numbers)
                return@setOnClickListener
            }

            val number1 = number1String.toInt()
            val number2 = number2String.toInt()

            val sum = number1 + number2

            resultTextView.text = getString(R.string.result, sum)
        }
    }
}
