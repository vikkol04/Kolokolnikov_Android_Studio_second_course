package com.example.kolokolnikov_android_studio_second_course

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.kolokolnikov_android_studio_second_course.constance_28may.Сonstance28May
import com.example.kolokolnikov_android_studio_second_course.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bindingMain: ActivityMainBinding
    private var launcher: ActivityResultLauncher<Intent>? = null    //Для Activity_28may

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        //Для Activity_28may
        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            result: ActivityResult ->
            if (result.resultCode == RESULT_OK){
                bindingMain.arrivalAnswer.text = result.data?.getStringExtra(Сonstance28May.INTENT_ANSWER)
            }
        }
    }

    fun startActivityPr1(view: View) {
        // 15.05.2023
        val intentPr1 = Intent(this, Activity_pr_1::class.java)
        startActivity(intentPr1)
    }

    fun startActivityPr2(view: View) {
        //18.05.2023
        val intentPr2 = Intent(this, Activity_pr_2::class.java)
        startActivity(intentPr2)
    }

    fun startActivityPr3(view: View) {
        //06.06.2023
        val intentPr3 = Intent(this, Activity_pr_3::class.java)
        startActivity(intentPr3)
    }

    fun startActivity16May(view: View) {
        // 16.05.2023
        val intent16May = Intent(this, Activity_16may::class.java)
        startActivity(intent16May)
    }

    fun startActivity28May(view: View) {
        // 01.06.2023
        val intent28May = Intent(this, Activity_28may::class.java)
        intent28May.putExtra(Сonstance28May.INTENT_QUESTION, bindingMain.questionField.text.toString())
        launcher?.launch(intent28May)
    }

    fun startActivity30May(view: View) {
        // 03.06.2023
        val intent30May = Intent(this, Activity_30may::class.java)
        startActivity(intent30May)
    }

    fun startActivity06June1(view: View) {
        //08.06.2023
        val intent06June1 = Intent(this, Activity_06june_1::class.java)
        startActivity(intent06June1)
    }

    fun startActivitySpinner06June2(view: View) {
        //09.06.2023
        val intent06June2 = Intent(this, ActivitySpinner_06june_2::class.java)
        startActivity(intent06June2)
    }

    fun startActivityResourses06June3(view: View) {
        //09.06.2023
        val intent06June3 = Intent(this, ActivityResourses_06june_3::class.java)
        startActivity(intent06June3)
    }

    fun startActivityFirstLw(view: View) {
        //13.06.2023
        val intentLw = Intent(this, ActivityFirst_lw::class.java)
        startActivity(intentLw)
    }
}