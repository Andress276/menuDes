package com.example.menudes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    private val splashTimeOut: Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java) // Reemplaza 'MainActivity' con el nombre de tu actividad principal
            startActivity(intent)
            finish() // Cierra la actividad actual para que no puedas volver atrás
        }, splashTimeOut)
    }
}