package com.example.prueba.questions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.prueba.R
import com.example.prueba.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question9.*

class Question10 : AppCompatActivity() {
    //Contadores para controlar si se selecciona el item mas de una vez
    var touchTextView1: Int = 0
    var touchTextView2: Int = 0
    var touchTextView3: Int = 0
    var touchTextView4: Int = 0
    var touchTextView5: Int = 0
    var touchTextView6: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question10)

        //Variables de id
        val textView1 = findViewById<TextView>(R.id.tv_question10_pra_0_0)
        val textView2 = findViewById<TextView>(R.id.tv_question10_dar_0_1)
        val textView3 = findViewById<TextView>(R.id.tv_question10_tar_1_0)
        val textView4 = findViewById<TextView>(R.id.tv_question10_bra_1_1)
        val textView5 = findViewById<TextView>(R.id.tv_question10_bar_2_0)
        val textView6 = findViewById<TextView>(R.id.tv_question10_tra_2_1)

        //Variable para generar el intent mas adelante
        val intentQuestion11 = Intent(this@Question10, Question11::class.java)

        textView1.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView1 = touchTextView1 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView1 % 2 !=0){
                textView1.setBackgroundColor(resources.getColor(R.color.itemSelect))
            }else {
                //En caso de ser par se coloca el color original
                textView1.setBackgroundColor(resources.getColor(R.color.colorWhite))
            }
        }

        textView2.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView2 = touchTextView2 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView2 % 2 !=0){
                textView2.setBackgroundColor(resources.getColor(R.color.itemSelect))
            }else {
                //En caso de ser par se coloca el color original
                textView2.setBackgroundColor(resources.getColor(R.color.colorWhite))
            }
        }

        textView3.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView3 = touchTextView3 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView3 % 2 !=0){
                textView3.setBackgroundColor(resources.getColor(R.color.itemSelect))
            }else {
                //En caso de ser par se coloca el color original
                textView3.setBackgroundColor(resources.getColor(R.color.colorWhite))
            }
        }

        textView4.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView4 = touchTextView4 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView4 % 2 !=0){
                textView4.setBackgroundColor(resources.getColor(R.color.itemSelect))
            }else {
                //En caso de ser par se coloca el color original
                textView4.setBackgroundColor(resources.getColor(R.color.colorWhite))
            }
        }

        textView5.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView5 = touchTextView5 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView5 % 2 !=0){
                textView5.setBackgroundColor(resources.getColor(R.color.itemSelect))
            }else {
                //En caso de ser par se coloca el color original
                textView5.setBackgroundColor(resources.getColor(R.color.colorWhite))
            }
        }

        textView6.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView6 = touchTextView6 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView6 % 2 !=0){
                textView6.setBackgroundColor(resources.getColor(R.color.itemSelect))
            }else {
                //En caso de ser par se coloca el color original
                textView6.setBackgroundColor(resources.getColor(R.color.colorWhite))
            }
        }

        bt_Question9.setOnClickListener {
            //Verifica que esten seleccionados los items correctos
            if(touchTextView4 % 2 != 0) //Que solo uno de los 3 este seleccionado
            {
                //Aumenta el puntaje del nino
                AppConstants.score = AppConstants.score +1

                //Realiza el intent para ir a la segunda pregunta
                startActivity(intentQuestion11)

            }else {
                startActivity(intentQuestion11)
            }
        }
    }
}
