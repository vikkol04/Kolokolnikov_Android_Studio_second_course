package com.example.kolokolnikov_android_studio_second_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.kolokolnikov_android_studio_second_course.databinding.Activity30mayBinding

class Activity_30may : AppCompatActivity() {
    lateinit var binding30May: Activity30mayBinding
    private val adapter = CharacterAdapter_30may()

    private val charactersList = listOf(
        Character_30may(R.drawable.aphrodite, "Aphrodite"),
        Character_30may(R.drawable.apollo, "Apollo"),
        Character_30may(R.drawable.ares, "Ares"),
        Character_30may(R.drawable.dionysus, "Dionysus"),
        Character_30may(R.drawable.hades, "Hades"),
        Character_30may(R.drawable.hera, "Hera"),
        Character_30may(R.drawable.hermes, "Hermes"),
        Character_30may(R.drawable.poseidon, "Poseidon"),
        Character_30may(R.drawable.zeus, "Zeus"),
    )

    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding30May = Activity30mayBinding.inflate(layoutInflater)
        setContentView(binding30May.root)

        init()
    }

    private fun init(){
        binding30May.apply {
            recyclerView.layoutManager = GridLayoutManager(this@Activity_30may, 2)
            recyclerView.adapter = adapter
            buttonShowImage.setOnClickListener{
                if(index > charactersList.size-1) index = 0
                val character = charactersList[index]
                adapter.addCharacter(character)
                index++
            }
        }
    }
}