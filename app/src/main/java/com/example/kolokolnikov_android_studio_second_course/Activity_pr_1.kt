package com.example.kolokolnikov_android_studio_second_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class Activity_pr_1 : AppCompatActivity() {
    var msgOnStart = true
    var msgOnResume = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pr1)
        Log.d("pr_1", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        if (this.msgOnStart) {
            Log.d("pr_1", "onStart")
            this.msgOnStart = false
        }
    }

    override fun onResume() {
        super.onResume()
        if (this.msgOnResume) {
            Log.d("pr_1", "onResume")
            this.msgOnResume = false
        }
    }

    override fun onPause() {
        super.onPause()
        Log.d("pr_1", "(onPause)")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("pr_1", "(onDestroy)")
    }

    override fun onStop() {
        super.onStop()
        Log.d("pr_1", "(onStop)")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("pr_1", "(onRestart)")
        Log.d("pr_1", "App is running")
    }

    fun closeActivityPr1(view: View) {
        this.finish()
    }

}