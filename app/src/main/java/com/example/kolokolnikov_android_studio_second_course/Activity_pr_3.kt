package com.example.kolokolnikov_android_studio_second_course

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.core.content.ContextCompat
import com.example.kolokolnikov_android_studio_second_course.databinding.ActivityPr3Binding

class Activity_pr_3 : AppCompatActivity() {
    lateinit var binding: ActivityPr3Binding
    lateinit var selectedColor: ColorObject_pr_3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPr3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        //binding.tvColor.ContextCompat.getColor(this, R.color.{"#FBB117"})
        //binding.tvColor.setTextColor((Color.parseColor("#FBB117")))

        loadColorSpinner()
    }

    private fun loadColorSpinner() {
        selectedColor = ColorList_pr_3().defaultColor
        binding.colorSpinner.apply {
            adapter = ColorSpinnerAdapter_pr_3(applicationContext, ColorList_pr_3().basicColors())
            setSelection(ColorList_pr_3().colorPosition(selectedColor), false)

            onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long){
                    selectedColor = ColorList_pr_3().basicColors()[position]
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                }
            }
        }
    }

    fun closeActivityPr3(view: View){
        finish()
    }
}