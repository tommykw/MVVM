package com.github.tommykw.mvvm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val x: Int
        try {
            x = 1
        }
        catch(e: Exception) {
            x = 2
        }
    }
}
