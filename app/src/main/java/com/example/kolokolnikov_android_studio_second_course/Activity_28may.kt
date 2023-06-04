package com.example.kolokolnikov_android_studio_second_course

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.kolokolnikov_android_studio_second_course.constance_28may.Сonstance28May
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.kolokolnikov_android_studio_second_course.databinding.Activity28mayBinding

class Activity_28may : AppCompatActivity() {
    lateinit var binding28may: Activity28mayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding28may = Activity28mayBinding.inflate(layoutInflater)
        setContentView(binding28may.root)

        val question = intent.getStringExtra(Сonstance28May.INTENT_QUESTION)
        binding28may.arrivalQuestion.text = question

    }

    fun sendToMainActivity(view: View) {
        val intentSendToMainActivity = Intent(this, MainActivity::class.java)
        intentSendToMainActivity.putExtra(Сonstance28May.INTENT_ANSWER, binding28may.answerField.text.toString())
        setResult(RESULT_OK, intentSendToMainActivity)
        finish()
    }


    fun createMainActivity(view: View) {
        val intentForCreateMainActivity = Intent(this, MainActivity::class.java)
        startActivity(intentForCreateMainActivity)
    }

    fun closeActivity28may(view: View) {
        this.finish()
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity_28may", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity_28may", "onDestroy")
    }
}