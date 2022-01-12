package com.example.a_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            val a=C3.text.toString().toInt()
            val b=D3.text.toString().toInt()
            val c=E3.text.toString().toInt()
            val e=F3.text.toString().toInt()
            val g=G3.text.toString().toInt()
            val SumC = a+b+c+e+g
            H2.setText("$SumC")

            val f=C4.text.toString().toInt()
            val h=D4.text.toString().toInt()
            val i=E4.text.toString().toInt()
            val j=F4.text.toString().toInt()
            val k=G4.text.toString().toInt()
            val SumP  = (a*f) + (b*h) + (c*i) + (e*j) + (e*k)
            val GPA = SumP / SumC
            I2.setText("$GPA")

        }
        button2.setOnClickListener{
            C3.setText("")
            D3.setText("")
            E3.setText("")
            F3.setText("")
            G3.setText("")

            C4.setText("")
            D4.setText("")
            E4.setText("")
            F4.setText("")
            G4.setText("")

        }

    }
}