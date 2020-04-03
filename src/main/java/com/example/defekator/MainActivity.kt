package com.example.defekator

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tmp = applicationContext.getSharedPreferences("prefs", Context.MODE_PRIVATE)
        if(tmp.contains("name") && tmp.contains("password")) {
            startActivity(Intent(this, Main2Activity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        var tmp = applicationContext.getSharedPreferences("prefs", Context.MODE_PRIVATE)
        if(tmp.contains("name") && tmp.contains("password")) {
            startActivity(Intent(this, Main2Activity::class.java))
        }
    }

    fun connect(view: View) {
        var pref = applicationContext.getSharedPreferences("prefs", Context.MODE_PRIVATE)
        pref.edit().putString("name", name.text.toString()).apply()
        pref.edit().putString("password", password.text.toString()).apply()
        startActivity(Intent(this, Main2Activity::class.java))
    }
}
