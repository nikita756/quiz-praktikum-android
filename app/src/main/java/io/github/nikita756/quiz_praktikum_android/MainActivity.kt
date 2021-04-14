package io.github.nikita756.quiz_praktikum_android

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.cardview.widget.CardView
import io.github.nikita756.quiz_praktikum_android.util.PreferenceUtil

class MainActivity : AppCompatActivity() {
    private lateinit var etUsername:EditText
    private lateinit var etPassword:EditText
    private lateinit var cvMasuk:CardView

    lateinit var PrefUtil: PreferenceUtil



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PrefUtil= PreferenceUtil.newInstance(this)

        etUsername= findViewById(R.id.et_username)
        etPassword= findViewById(R.id.et_password)
        cvMasuk= findViewById(R.id.cv_masuk)


        etUsername.setText(PrefUtil.getString("user"))
        cvMasuk.setOnClickListener {
            saveData()
            var igotodashboard= Intent(this, dashboardLogin::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            }
            startActivity(igotodashboard)
        }

    }
    private fun saveData(){
        val user=etUsername.text.toString().trim()
        PrefUtil.setString("user",user)
    }
}