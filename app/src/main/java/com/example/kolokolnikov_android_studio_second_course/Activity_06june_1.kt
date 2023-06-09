package com.example.kolokolnikov_android_studio_second_course

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.GridLayoutManager
import com.example.kolokolnikov_android_studio_second_course.constance_06june.Constance_06june
import com.example.kolokolnikov_android_studio_second_course.databinding.Activity06june1Binding

class Activity_06june_1 : AppCompatActivity() {
    lateinit var binding06june1: Activity06june1Binding
    private val adapter = CharacterAdapter_06june_1()
    private var launcher: ActivityResultLauncher<Intent>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding06june1 = Activity06june1Binding.inflate(layoutInflater)
        setContentView(binding06june1.root)

        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            if (it.resultCode == RESULT_OK)
                adapter.addCharacter(it.data?.getSerializableExtra(Constance_06june.INTENT_USER_CREATION) as Character_06june_1)

        }

        init()
    }

    private fun init(){
        binding06june1.apply {
            recyclerView.layoutManager = GridLayoutManager(this@Activity_06june_1, 2)
            recyclerView.adapter = adapter
            addButton.setOnClickListener{
                launcher?.launch(Intent(this@Activity_06june_1, ActivityCreateCharacter_06june_1::class.java))
            }
        }
    }
}