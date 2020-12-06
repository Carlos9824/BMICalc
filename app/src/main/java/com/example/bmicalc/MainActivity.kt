package com.example.bmicalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var edad:Int = 25
    var peso:Int = 75
    var altura:Int = 180
    var sexo:String = "hola"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekAltura.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

                if (progress <= 100){
                    seekAltura.setProgress(100)
                    txtAltura.text = "100"
                    altura = 100
                }else{
                    txtAltura.text = "$progress"
                    altura = progress
                }

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        pesoMasbtn.setOnClickListener(this)
        pesoMenosbtn.setOnClickListener(this)
        edadMasbtn.setOnClickListener (this)
        edadMenosbtn.setOnClickListener(this)
        calcbtn.setOnClickListener(this)
        menbtn.setOnClickListener(this)
        womanbtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
         when(v!!.id){
             R.id.edadMasbtn->{
                 edad++
                 txtedad.text = "$edad"
             }
             R.id.edadMenosbtn->{
                 edad--
                 txtedad.text = "$edad"
             }
             R.id.pesoMasbtn->{
                 peso++
                 txtPeso.text = "$peso"
             }
             R.id.pesoMenosbtn->{
                 peso--
                 txtPeso.text = "$peso"
             }
             R.id.menbtn->sexo = "m"
             R.id.womanbtn->sexo= "f"
             R.id.calcbtn->{
                 val imc = CalculaIMC(peso,altura)
                 val intention = Intent(this, ActivityResultado::class.java)
                 intention.putExtra("bmi",imc)
                 intention.putExtra("gender",sexo)
                 intention.putExtra("age",edad)
                 startActivity(intention)
             }
         }
    }
    fun CalculaIMC(peso:Int, altura:Int):Float{
        val pesoF = peso.toFloat()
        val alturaF = altura.toFloat()/100
        var imc = pesoF/(alturaF*alturaF)
        return imc.toFloat()

    }

}