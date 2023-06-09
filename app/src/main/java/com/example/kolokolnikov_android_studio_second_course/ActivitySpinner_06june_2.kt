package com.example.kolokolnikov_android_studio_second_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.kolokolnikov_android_studio_second_course.constance_06june.Constance_06june
import com.example.kolokolnikov_android_studio_second_course.databinding.Activity06june1Binding
import com.example.kolokolnikov_android_studio_second_course.databinding.ActivitySpinner06june2Binding

class ActivitySpinner_06june_2 : AppCompatActivity() {
    lateinit var binding06june2: ActivitySpinner06june2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding06june2 = ActivitySpinner06june2Binding.inflate(layoutInflater)
        setContentView(binding06june2.root)
        binding06june2.spinner.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Constance_06june.SPINNER_OPTIONS)
        binding06june2.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                binding06june2.textView.text = Constance_06june.SPINNER_OPTIONS.get(position)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                binding06june2.textView.text = "Please Select Item"
            }

        }
    }
}