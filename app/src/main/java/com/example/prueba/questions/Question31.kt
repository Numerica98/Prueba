package com.example.prueba.questions

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.example.prueba.R
import com.example.prueba.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question26.*
import kotlinx.android.synthetic.main.activity_question31.*

class Question31 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question31)

        bt_Question31.setOnClickListener {
            var valor = rg_question31.checkedRadioButtonId

            var radioButton = findViewById<RadioButton>(valor)

            val intentQuestion32 = Intent(this@Question31, Question32::class.java)

            if(radioButton == rb_question31_opc1){
                AppConstants.score = AppConstants.score +1
                startActivity(intentQuestion32)
            }else{
                startActivity(intentQuestion32)
            }

        }
    }
}