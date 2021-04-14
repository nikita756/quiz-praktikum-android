package io.github.nikita756.quiz_praktikum_android.util

import android.content.Context
import android.os.strictmode.InstanceCountViolation
import androidx.preference.PreferenceManager

class PreferenceUtil private constructor(context: Context) {
    companion object{
        private var instance:PreferenceUtil?=null
        fun newInstance(context: Context)= instance ?: PreferenceUtil(context).also {
            instance=it
        }
    }

    private val prefs = PreferenceManager.getDefaultSharedPreferences(context)

    fun setString(key: String,value:String)=prefs.edit().putString(key, value).apply()

    fun getString(key: String)=prefs.getString(key,null)

}