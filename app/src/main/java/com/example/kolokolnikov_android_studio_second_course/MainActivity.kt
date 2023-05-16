package com.example.kolokolnikov_android_studio_second_course

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kolokolnikov_android_studio_second_course.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startActivityPr1(view: View) {
        // 15.05.2023
        val intentPr1 = Intent(this, Activity_pr_1::class.java)
        startActivity(intentPr1)
    }

    fun startActivity16May(view: View) {
        // 16.05.2023
        val intent16May = Intent(this, Activity_16may::class.java)
        startActivity(intent16May)
    }
}