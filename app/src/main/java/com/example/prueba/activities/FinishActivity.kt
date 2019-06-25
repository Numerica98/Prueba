package com.example.prueba.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.example.prueba.constants.AppConstants
import com.example.prueba.R
import kotlinx.android.synthetic.main.activity_character.*
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        //Setea la imagen con el personaje escogido al inicio
        if(AppConstants.characterKid == AppConstants.cat){
            iv_characterSelected.setImageResource(R.drawable.neko)
        } else if(AppConstants.characterKid == AppConstants.dog){
            iv_characterSelected.setImageResource(R.drawable.dogui)
        } else if(AppConstants.characterKid == AppConstants.dinosaur){
            iv_characterSelected.setImageResource(R.drawable.rex)
        } else if(AppConstants.characterKid == AppConstants.chiken){
            iv_characterSelected.setImageResource(R.drawable.pio)
        } else if(AppConstants.characterKid == AppConstants.shark){
            iv_characterSelected.setImageResource(R.drawable.sharky)
        } else if(AppConstants.characterKid == AppConstants.penguin){
            iv_characterSelected.setImageResource(R.drawable.pingui)
        }

        //Accion del boton
        bt_NextResult.setOnClickListener {
            //Confirma que el editText no venga vacio
            if(TextUtils.isEmpty(ed_PaswwordUserConfirm.text)){
                Toast.makeText(this,"Ingrese el password para saber el resultado", Toast.LENGTH_LONG).show()
            }else{
                //Verifica que sea el passwod correcto
                if(ed_PaswwordUserConfirm.text.toString() != AppConstants.passwordUser){
                    Toast.makeText(this,"Ingrese el password correcto", Toast.LENGTH_LONG).show()
                }else{
                    //Pasa a la siguiente actividad
                    val intentResult = Intent(this@FinishActivity, ResultActivity::class.java)
                    startActivity(intentResult)
                }
            }
        }
    }
}
