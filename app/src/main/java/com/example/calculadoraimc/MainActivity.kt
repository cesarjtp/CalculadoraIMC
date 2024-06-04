package com.example.calculadoraimc

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var welcomeTextView : TextView
    lateinit var inicioButton : Button
    lateinit var regresoButton : Button
    lateinit var primerButton : Button
    lateinit var imageButton : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcomeTextView = findViewById(R.id.welcomeTextView)
        inicioButton = findViewById(R.id.inicioButton)
        regresoButton = findViewById(R.id.regresoButton)
        primerButton = findViewById(R.id.primerButton)
        imageButton = findViewById(R.id.imageButton)

        welcomeTextView.text = "BIENVENIDOS A MI APP"

        inicioButton.setOnClickListener{
            welcomeTextView.text = "HE HECHO CLIP EN EL BOTON DE AVANZAR"
        }

        regresoButton.setOnClickListener{
            welcomeTextView.text = "HE HECHO CLIP EN EL BOTON DE REGRESO"
        }
        primerButton.setOnClickListener{
            welcomeTextView.text = "BIENVENIDO A MI APP"
        }
        imageButton.setOnClickListener{
            welcomeTextView.text = ""
        }

    }
}