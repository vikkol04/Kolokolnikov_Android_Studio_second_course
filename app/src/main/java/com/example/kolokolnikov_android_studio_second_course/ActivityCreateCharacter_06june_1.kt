package com.example.kolokolnikov_android_studio_second_course

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kolokolnikov_android_studio_second_course.constance_06june.Constance_06june
import com.example.kolokolnikov_android_studio_second_course.constance_06june.ImageList_06june
import com.example.kolokolnikov_android_studio_second_course.databinding.Activity06june1Binding
import com.example.kolokolnikov_android_studio_second_course.databinding.ActivityCreateCharacter06june1Binding

class ActivityCreateCharacter_06june_1 : AppCompatActivity() {
    lateinit var binding: ActivityCreateCharacter06june1Binding
    private var imageIndex = 0
    private var imageId = ImageList_06june.IMAGES[0]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateCharacter06june1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        initButtons()
    }

    private fun initButtons() = with(binding){
        bPrevious.setOnClickListener{
            imageIndex--
            if(imageIndex<0) imageIndex = ImageList_06june.IMAGES.size-1
            imageId = ImageList_06june.IMAGES[imageIndex]
            imageView2.setImageResource(imageId)
        }
        bNext.setOnClickListener{
            imageIndex++
            if(imageIndex>ImageList_06june.IMAGES.size-1) imageIndex = 0
            imageId = ImageList_06june.IMAGES[imageIndex]
            imageView2.setImageResource(imageId)
        }
        bDone.setOnClickListener{
            val character = Character_06june_1(imageId, edTitle.text.toString())
            val characterCreationIntent = Intent().apply {
                putExtra(Constance_06june.INTENT_USER_CREATION, character)
            }
            setResult(RESULT_OK, characterCreationIntent)
            finish()
        }


    }
}