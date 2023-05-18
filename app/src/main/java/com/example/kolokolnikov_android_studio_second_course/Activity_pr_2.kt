package com.example.kolokolnikov_android_studio_second_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kolokolnikov_android_studio_second_course.databinding.ActivityPr2Binding

class Activity_pr_2 : AppCompatActivity() {
    lateinit var bindingClass: ActivityPr2Binding
    private var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityPr2Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

    fun closeActivityPr2(view: View) {
        this.finish()
    }

    fun minusOne(view: View) {
        number -= 1
        updateTextWithNumber()
    }

    fun plusOne(view: View) {
        number += 1
        updateTextWithNumber()
    }

    private fun updateTextWithNumber() {
        bindingClass.textWithNumber.text = number.toString()
    }
}