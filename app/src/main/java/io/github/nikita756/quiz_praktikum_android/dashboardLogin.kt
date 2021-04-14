package io.github.nikita756.quiz_praktikum_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import io.github.nikita756.quiz_praktikum_android.util.PreferenceUtil

class dashboardLogin : AppCompatActivity() {
    lateinit var etUser: TextView
    lateinit var prefUtil: PreferenceUtil


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_login)

        prefUtil = PreferenceUtil.newInstance(this)

    }
    private fun update(){
        val user=prefUtil.getString("user")
        if (user.isNullOrEmpty()){
            etUser.visibility=View.GONE
        }
        else{
            etUser.visibility=View.VISIBLE
        }
    }
}