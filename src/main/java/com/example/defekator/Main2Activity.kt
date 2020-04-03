package com.example.defekator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var prefs = applicationContext.getSharedPreferences("prefs", Context.MODE_PRIVATE)
        displayname.text = prefs.getString("name", "")
        displaypassword.text = prefs.getString("password", "")
    }
}
