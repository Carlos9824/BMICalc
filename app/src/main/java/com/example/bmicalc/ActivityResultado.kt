package com.example.bmicalc

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*
import java.text.DecimalFormat

class ActivityResultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

       val intention = intent

        val imc = intention.getFloatExtra("bmi",0.0f)
        val sexo = intention.getStringExtra("gender")
        val edad = intention.getIntExtra("age",25)


        txtResultado.text = "$imc"

        interpretaIMC(imc,sexo,edad)

        btnRegresar.setOnClickListener{
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
    }
    fun interpretaIMC(imc:Float,sexo:String,edad:Int){
        var estado:String = ""
        var mensaje:String = ""
        var rango:String = ""

        if (sexo == "f"){
            when(edad){
                in 19 .. 24 ->{
                    when(imc){
                        in 18.9 .. 22.1 ->{
                         estado = "Normal"
                         rango = "18,9 - 22.1kg/m2"
                         mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 22.2 .. 25.0->{
                           estado = "Bueno"
                           rango = "18,9 - 22.1kg/m2"
                           mensaje = "Tienes un indice bueno, pero aun puedes hacerlo"
                       }
                    }
                    when(imc){
                      in 25.1 .. 29.5->{
                          estado = "Regular"
                          rango = "18,9 - 22.1kg/m2"
                          mensaje = "Tienes un indice no muy bueno, tienes que mejorar"
                      }
                    }
                    when{
                        imc >= 29.6->{
                            estado = "Malo"
                            rango = "18,9 - 22.1kg/m2"
                            mensaje = "Estas en peligro de obesidad"
                        }
                    }
                }
            }
            when(edad){
                in 25 .. 29->{
                    when(imc){
                        in 18.9 .. 22.0 ->{
                            estado = "Normal"
                            rango = "18,9 - 22kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 22.1 .. 25.4->{
                            estado = "Bueno"
                            rango = "18,9 - 22kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 25.5 .. 29.7->{
                            estado = "Regular"
                            rango = "18,9 - 22kg/m2"
                            mensaje = "Tienes un indice no muy bueno, tienes que mejorar"
                        }
                    }
                    when{
                        imc >= 29.8->{
                            estado = "Malo"
                            rango = "18,9 - 22kg/m2"
                            mensaje = "Estas en peligro de obesidad"
                        }
                    }
                }
            }
            when(edad){
                in 30 .. 34->{
                    when(imc){
                        in 19.7 .. 22.7 ->{
                            estado = "Normal"
                            rango = "19,7 - 22.7kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 22.8 .. 26.3 ->{
                            estado = "Bueno"
                            rango = "18,9 - 22.7kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 26.4 .. 30.4->{
                            estado = "Regular"
                            rango = "18,9 - 22.7kg/m2"
                            mensaje = "Tienes un indice no muy bueno, tienes que mejorar"
                        }
                    }
                    when{
                        imc >= 30.5-> {
                            estado = "Malo"
                            rango = "18,9 - 22.7kg/m2"
                            mensaje = "Estas en peligro de obesidad"
                        }
                    }
                }
            }
            when(edad){
                in 35 .. 39->{
                    when(imc){
                        in 21.0 .. 24.0 ->{
                            estado = "Normal"
                            rango = "21 - 24kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 24.1 .. 27.6 ->{
                            estado = "Bueno"
                            rango = "21 - 24kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 27.7 .. 31.4->{
                            estado = "Regular"
                            rango = "21 - 24kg/m2"
                            mensaje = "Tienes un indice no muy bueno, tienes que mejorar"
                        }
                    }
                    when{
                        imc >= 31.5-> {
                            estado = "Malo"
                            rango = "21 - 24kg/m2"
                            mensaje = "Estas en peligro de obesidad"
                        }
                    }
                }
            }
            when(edad){
                in 40 .. 44->{
                    when(imc){
                        in 22.6 .. 25.6 ->{
                            estado = "Normal"
                            rango = "22.6 - 25.6kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 25.7 .. 29.2 ->{
                            estado = "Bueno"
                            rango = "22.6 - 25.6kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 29.3 .. 32.7->{
                            estado = "Regular"
                            rango = "22.6 - 25.6kg/m2"
                            mensaje = "Tienes un indice no muy bueno, tienes que mejorar"
                        }
                    }
                    when{
                        imc >= 32.8-> {
                            estado = "Malo"
                            rango = "22.6 - 25.6kg/m2"
                            mensaje = "Estas en peligro de obesidad"
                        }
                    }
                }
            }
            when(edad){
                in 45 .. 49->{
                    when(imc){
                        in 24.3 .. 27.3 ->{
                            estado = "Normal"
                            rango = "24.3 - 27.3kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 27.4 .. 30.8 ->{
                            estado = "Bueno"
                            rango = "24.3 - 27.3kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 30.9 .. 34.0->{
                            estado = "Regular"
                            rango = "24.3 - 27.3kg/m2"
                            mensaje = "Tienes un indice no muy bueno, tienes que mejorar"
                        }
                    }
                    when{
                        imc >= 34.1-> {
                            estado = "Malo"
                            rango = "24.3 - 27.3kg/m2"
                            mensaje = "Estas en peligro de obesidad"
                        }
                    }
                }
            }
            when(edad){
                in 50 .. 54->{
                    when(imc){
                        in 26.6 .. 29.7 ->{
                            estado = "Normal"
                            rango = "26.6 - 29.7kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 29.8 .. 33.0 ->{
                            estado = "Bueno"
                            rango = "26.6 - 29.7kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 33.1 .. 36.1->{
                            estado = "Regular"
                            rango = "26.6 - 29.7kg/m2"
                            mensaje = "Tienes un indice no muy bueno, tienes que mejorar"
                        }
                    }
                    when{
                        imc >= 36.2-> {
                            estado = "Malo"
                            rango = "26.6 - 29.7kg/m2"
                            mensaje = "Estas en peligro de obesidad"
                        }
                    }
                }
            }
            when(edad){
                in 55 .. 59->{
                    when(imc){
                        in 27.4 .. 30.7 ->{
                            estado = "Normal"
                            rango = "27.4 - 30.7kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 30.8 .. 34.0 ->{
                            estado = "Bueno"
                            rango = "27.4 - 30.7kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 34.1 .. 37.2->{
                            estado = "Regular"
                            rango = "27.4 - 30.7kg/m2"
                            mensaje = "Tienes un indice no muy bueno, tienes que mejorar"
                        }
                    }
                    when{
                        imc >= 37.3-> {
                            estado = "Malo"
                            rango = "27.4 - 30.7kg/m2"
                            mensaje = "Estas en peligro de obesidad"
                        }
                    }
                }
            }
            when{
                edad >= 60->{
                    when(imc){
                        in 27.6 .. 31.0 ->{
                            estado = "Normal"
                            rango = "27.6 - 31kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 31.1 .. 34.4 ->{
                            estado = "Bueno"
                            rango = "27.6 - 31kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 34.5 .. 37.9->{
                            estado = "Regular"
                            rango = "27.6 - 31kg/m2"
                            mensaje = "Tienes un indice no muy bueno, tienes que mejorar"
                        }
                    }
                    when{
                        imc >= 38.0-> {
                            estado = "Malo"
                            rango = "27.6 - 31kg/m2"
                            mensaje = "Estas en peligro de obesidad"
                        }
                    }
                }
            }
        }else if(sexo == "m"){
            when(edad){
                in 19 .. 24 ->{
                    when(imc){
                        in 10.8 .. 14.9 ->{
                            estado = "Normal"
                            rango = "10,8 - 14.9kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 15.0 .. 19.0->{
                            estado = "Bueno"
                            rango = "10,8 - 14.9kg/m2"
                            mensaje = "Tienes un indice bueno, pero aun puedes hacerlo"
                        }
                    }
                    when(imc){
                        in 19.1 .. 23.2->{
                            estado = "Regular"
                            rango = "10,8 - 14.9kg/m2"
                            mensaje = "Tienes un indice no muy bueno, tienes que mejorar"
                        }
                    }
                    when{
                        imc >= 23.3->{
                            estado = "Malo"
                            rango = "10,8 - 14.9kg/m2"
                            mensaje = "Estas en peligro de obesidad"
                        }
                    }
                }
            }
            when(edad){
                in 25 .. 29->{
                    when(imc){
                        in 12.8 .. 16.5 ->{
                            estado = "Normal"
                            rango = "12.8 - 16.5kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 16.6 .. 20.3->{
                            estado = "Bueno"
                            rango = "12.8 - 16.5kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 20.4 .. 24.3->{
                            estado = "Regular"
                            rango = "12.8 - 16.5kg/m2"
                            mensaje = "Tienes un indice no muy bueno, tienes que mejorar"
                        }
                    }
                    when{
                        imc >= 24.4->{
                            estado = "Malo"
                            rango = "12.8 - 16.5kg/m2"
                            mensaje = "Estas en peligro de obesidad"
                        }
                    }
                }
            }
            when(edad){
                in 30 .. 34->{
                    when(imc){
                        in 15.5 .. 18.0 ->{
                            estado = "Normal"
                            rango = "15.5 - 18kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 18.1 .. 21.5 ->{
                            estado = "Bueno"
                            rango = "15.5 - 18kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 21.6 .. 25.1->{
                            estado = "Regular"
                            rango = "15.5 - 18kg/m2"
                            mensaje = "Tienes un indice no muy bueno, tienes que mejorar"
                        }
                    }
                    when{
                        imc >= 25.2-> {
                            estado = "Malo"
                            rango = "15.5 - 18kg/m2"
                            mensaje = "Estas en peligro de obesidad"
                        }
                    }
                }
            }
            when(edad){
                in 35 .. 39->{
                    when(imc){
                        in 16.1 .. 19.4 ->{
                            estado = "Normal"
                            rango =  "16.1 - 19.4kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 19.5 .. 22.6 ->{
                            estado = "Bueno"
                            rango = "16.1 - 19.4kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 22.7 .. 26.0->{
                            estado = "Regular"
                            rango =  "16.1 - 19.4kg/m2"
                            mensaje = "Tienes un indice no muy bueno, tienes que mejorar"
                        }
                    }
                    when{
                        imc >= 26.1-> {
                            estado = "Malo"
                            rango =  "16.1 - 19.4kg/m2"
                            mensaje = "Estas en peligro de obesidad"
                        }
                    }
                }
            }
            when(edad){
                in 40 .. 44->{
                    when(imc){
                        in 17.5 .. 20.5 ->{
                            estado = "Normal"
                            rango = "17.5 - 20.5kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 20.6 .. 23.6 ->{
                            estado = "Bueno"
                            rango = "17.5 - 20.5kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 23.7 .. 26.8->{
                            estado = "Regular"
                            rango = "17.5 - 20.5kg/m2"
                            mensaje = "Tienes un indice no muy bueno, tienes que mejorar"
                        }
                    }
                    when{
                        imc >= 26.9-> {
                            estado = "Malo"
                            rango = "17.5 - 20.5kg/m2"
                            mensaje = "Estas en peligro de obesidad"
                        }
                    }
                }
            }
            when(edad){
                in 45 .. 49->{
                    when(imc){
                        in 18.6 .. 21.5 ->{
                            estado = "Normal"
                            rango = "18.6 - 21.5kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 21.6 .. 24.5 ->{
                            estado = "Bueno"
                            rango = "18.6 - 21.5kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 24.6 .. 27.5->{
                            estado = "Regular"
                            rango =  "18.6 - 21.5kg/m2"
                            mensaje = "Tienes un indice no muy bueno, tienes que mejorar"
                        }
                    }
                    when{
                        imc >= 27.6-> {
                            estado = "Malo"
                            rango = "18.6 - 21.5kg/m2"
                            mensaje = "Estas en peligro de obesidad"
                        }
                    }
                }
            }
            when(edad){
                in 50 .. 54->{
                    when(imc){
                        in 19.8 .. 22.7 ->{
                            estado = "Normal"
                            rango = "19.8 - 22.7kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 22.8 .. 25.6 ->{
                            estado = "Bueno"
                            rango = "19.8 - 22.7kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 25.7 .. 28.6->{
                            estado = "Regular"
                            rango = "19.8 - 22.7kg/m2"
                            mensaje = "Tienes un indice no muy bueno, tienes que mejorar"
                        }
                    }
                    when{
                        imc >= 28.7-> {
                            estado = "Malo"
                            rango =  "19.8 - 22.7kg/m2"
                            mensaje = "Estas en peligro de obesidad"
                        }
                    }
                }
            }
            when(edad){
                in 55 .. 59->{
                    when(imc){
                        in 20.2 .. 23.2 ->{
                            estado = "Normal"
                            rango = "20.2 - 23.2kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 23.3.. 26.2 ->{
                            estado = "Bueno"
                            rango = "27.4 - 30.7kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 26.3 .. 29.2->{
                            estado = "Regular"
                            rango = "27.4 - 30.7kg/m2"
                            mensaje = "Tienes un indice no muy bueno, tienes que mejorar"
                        }
                    }
                    when{
                        imc >= 29.3-> {
                            estado = "Malo"
                            rango = "27.4 - 30.7kg/m2"
                            mensaje = "Estas en peligro de obesidad"
                        }
                    }
                }
            }
            when{
                edad >= 60->{
                    when(imc){
                        in 20.3 .. 23.5 ->{
                            estado = "Normal"
                            rango = "20.3 - 23.5kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 23.6 .. 26.7 ->{
                            estado = "Bueno"
                            rango = "20.3 - 23.5kg/m2"
                            mensaje = "Tienes un indice muy bueno, sigue asi"
                        }
                    }
                    when(imc){
                        in 26.8 .. 29.7 ->{
                            estado = "Regular"
                            rango ="20.3 - 23.5kg/m2"
                            mensaje = "Tienes un indice no muy bueno, tienes que mejorar"
                        }
                    }
                    when{
                        imc >= 29.8 -> {
                            estado = "Malo"
                            rango = "20.3 - 23.5kg/m2"
                            mensaje = "Estas en peligro de obesidad"
                        }
                    }
                }
            }
        }
        txtEstado.text = "$estado"
        txtrango.text = "$rango"
        txtMensaje.text = "$mensaje"
    }



}