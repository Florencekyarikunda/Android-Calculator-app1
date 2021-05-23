package com.example.calculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvResult=findViewById<TextView>(R.id.tvResult)
        var number1=findViewById<EditText>(R.id.Number1)
        var number2=findViewById<EditText>(R.id.Number2)

        var Add=findViewById<Button>(R.id.Add)
        var Subtract=findViewById<Button>(R.id.Subtract)
        var Multiply=findViewById<Button>(R.id.Multiply)
        var Modulus=findViewById<Button>(R.id.Modulus)


        Add.setOnClickListener {
            var number1 = number1.text.toString().toInt()
            var number2 = number2.text.toString().toInt()
            var result = number1 + number2

            tvResult.text = "Result:$result"


        }
        Subtract.setOnClickListener {
            var number1 = number1.text.toString().toInt()
            var number2 = number2.text.toString().toInt()
            var result = number1 - number2

            tvResult.text = "Result:$result"
        }
        Multiply.setOnClickListener {
            var number1 = number1.text.toString().toInt()
            var number2 = number2.text.toString().toInt()
            var result = number1 * number2

            tvResult.text = "Result:$result"
        }
        Modulus.setOnClickListener {
            var number1 = number1.text.toString().toInt()
            var number2 = number2.text.toString().toInt()
            var result = number1 % number2

            tvResult.text = "Result:$result"
        }
    }

}




