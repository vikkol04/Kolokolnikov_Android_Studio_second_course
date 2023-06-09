package com.example.kolokolnikov_android_studio_second_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.kolokolnikov_android_studio_second_course.databinding.ActivityResourses06june3Binding

class ActivityResourses_06june_3 : AppCompatActivity() {
    lateinit var binding: ActivityResourses06june3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val green = ContextCompat.getColor(this, R.color.green_apple)
        binding = ActivityResourses06june3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            binding.button.isEnabled = isChecked
        }
        binding.button.setOnClickListener{
            binding.button.isSelected = !binding.button.isSelected
            binding.textView2.setTextColor(green)
            binding.textView2.setText(R.string.text_view_button_clicked)
        }
    }
}