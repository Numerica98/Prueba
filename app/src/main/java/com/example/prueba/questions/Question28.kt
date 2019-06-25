package com.example.prueba.questions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.example.prueba.R
import com.example.prueba.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question28.*

class Question28 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question28)

        bt_Question28.setOnClickListener {
            var valor = rg_question28.checkedRadioButtonId

            var radioButton = findViewById<RadioButton>(valor)

            val intentQuestion30 = Intent(this@Question28, Question30::class.java)

            if(radioButton == rb_question28_opc1){
                AppConstants.score = AppConstants.score +1
                startActivity(intentQuestion30)
            }else{
                startActivity(intentQuestion30)
            }

        }
    }
}
