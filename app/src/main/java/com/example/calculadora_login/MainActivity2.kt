package com.example.calculadora_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

import java.lang.Exception
import javax.xml.xpath.XPathExpression

class MainActivity2 : AppCompatActivity() {
    lateinit var textView: TextView
    var isNewOp = true
    var oldNumber = ""
    var op = "+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        textView = findViewById(R.id.textView)
        val nombre:String? = intent.getStringExtra("nombre")
        val apellidos:String? = intent.getStringExtra("apellido")
        textView.text = getString(R.string.bienvenida, nombre +" "+ apellidos)



    }
    fun numberEvent (view: View){
        if (isNewOp)
            textViewResul.setText("")
        isNewOp = false

        val buSelect = view as Button
        var buClickValue:String = textViewResul.text.toString()

        when(buSelect.id){
            button16.id->{
                buClickValue+="0"

            }
            button5.id->{
                buClickValue+="1"
            }
            dos.id->{
                buClickValue+="2"
            }
            button11.id->{
                buClickValue+="3"
            }
            button4.id->{
                buClickValue+="4"
            }
            button7.id->{
                buClickValue+="5"
            }
            button10.id->{
                buClickValue+="6"
            }
            button3.id->{
                buClickValue+="7"
            }
            button6.id->{
                buClickValue+="8"
            }
            button9.id->{
                buClickValue+="9"
            }
            button17.id->{
                buClickValue+="."
            }
            button12.id ->{
                buClickValue = "+$buClickValue"
            }
            button13.id ->{
                buClickValue = "-$buClickValue"
            }
            button14.id ->{
                buClickValue = "/$buClickValue"
            }
            button15.id ->{
                buClickValue = "*$buClickValue"
            }
        }
        textViewResul.setText(buClickValue)


    }
    fun operatorEvent (view: View){
        isNewOp = true
        oldNumber = textViewResul.text.toString()
        var buSelect = view as Button
        when(buSelect.id) {
            button12.id -> {op = "+"}
            button13.id -> {op = "-"}
            button14.id -> {op = "/"}
            button15.id -> {op = "*"}
        }
    }

    fun equalEvent(view: View) {
        var newNumber = textViewResul.text.toString()
        var result = 0.0
        when(op) {
            "-" -> {result = oldNumber.toDouble() - newNumber.toDouble()}
            "+" -> {result = oldNumber.toDouble() + newNumber.toDouble()}
            "/" -> {result = oldNumber.toDouble() / newNumber.toDouble()}
            "*" -> {result = oldNumber.toDouble() * newNumber.toDouble()}
        }
        textViewResul.setText(result.toString())


    }

    fun Limpiar_num(view: View) {
        textViewResul.setText("0")
        isNewOp = true
    }
}