package com.example.kolokolnikov_android_studio_second_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kolokolnikov_android_studio_second_course.databinding.Activity16mayBinding
import com.example.kolokolnikov_android_studio_second_course.databinding.ActivityMainBinding

class Activity_16may : AppCompatActivity() {
    lateinit var bindingClass: Activity16mayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = Activity16mayBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.textViewActivity16may.text = "activity_16may\nПро bindingClass и findViewById."
    }

    fun closeActivity16may(view: View) {
        this.finish()
    }

    fun doActivity16may(view: View) {
        bindingClass.textViewActivity16may.text = "Кнопка была нажата"
    }

    override fun onRestart() {
        super.onRestart()
        bindingClass.textViewActivity16may.text = "Вы вернулись"
    }

    /* 16.05.2023 Занесение объектов разметки через экземпляр класса findViewById
    override fun onRestart() {
        super.onRestart()
        val actMainText = findViewById<TextView>(R.id.textView)
        actMainText.text = "You are back"
    }

    fun onClickTest(view: View) {
        val actMainText = findViewById<TextView>(R.id.textView)
        actMainText.text = "Button clicked"
    }
     */
}