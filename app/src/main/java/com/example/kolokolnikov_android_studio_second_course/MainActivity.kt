package com.example.kolokolnikov_android_studio_second_course

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MyLogAct", "onCreate(Main)")
        val intentPr1 = Intent(this, Activity_pr_1::class.java)
        startActivity(intentPr1)

    }
}