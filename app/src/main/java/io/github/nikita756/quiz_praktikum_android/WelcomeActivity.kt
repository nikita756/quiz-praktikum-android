package io.github.nikita756.quiz_praktikum_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {

     private lateinit var btnMulai: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        btnMulai= findViewById(R.id.btn_mulai)

        btnMulai.setOnClickListener {
            var igotoLogin=Intent(this, MainActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            }
            startActivity(igotoLogin)
        }

        }

    }
