package com.example.prueba.questions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.prueba.R
import com.example.prueba.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question39.*

class Question39 : AppCompatActivity() {
    //Contadores para controlar si se selecciona el item mas de una vez
    var touchTextView1: Int = 0
    var touchTextView2: Int = 0
    var touchTextView3: Int = 0
    var touchTextView4: Int = 0
    var touchTextView5: Int = 0
    var touchTextView6: Int = 0
    var touchTextView7: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question39)

        //Variables de id
        val textView1 = findViewById<TextView>(R.id.tv_question39_tapon)
        val textView2 = findViewById<TextView>(R.id.tv_question39_jabon)
        val textView3 = findViewById<TextView>(R.id.tv_question39_jadon)
        val textView4 = findViewById<TextView>(R.id.tv_question39_bastion)
        val textView5 = findViewById<TextView>(R.id.tv_question39_dastion)
        val textView6 = findViewById<TextView>(R.id.tv_question39_patron)
        val textView7 = findViewById<TextView>(R.id.tv_question39_patorn)

        //Variable para generar el intent mas adelante
        val intentQuestion40 = Intent(this@Question39, Question40::class.java)

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

        textView7.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView7 = touchTextView7 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView7 % 2 !=0){
                textView7.setBackgroundColor(resources.getColor(R.color.itemSelect))
            }else {
                //En caso de ser par se coloca el color original
                textView7.setBackgroundColor(resources.getColor(R.color.colorWhite))
            }
        }

        bt_Question39.setOnClickListener {
            //Verifica que esten seleccionados los items correctos
            if((touchTextView1 % 2 != 0 || touchTextView2 % 2 != 0 || touchTextView4 % 2 != 0 || touchTextView6 % 2 != 0) //Que solo uno de los 3 este seleccionado
                    ||
                    (touchTextView1 % 2 != 0 && touchTextView2 % 2 != 0 && touchTextView4 % 2 != 0 && touchTextView6 % 2 != 0) //Que todos los items correctos esten seleccionados
            ){
                //Aumenta el puntaje del nino
                AppConstants.score = AppConstants.score +1

                //Realiza el intent para ir a la segunda pregunta
                startActivity(intentQuestion40)

            }else {
                startActivity(intentQuestion40)
            }
        }
    }
}
