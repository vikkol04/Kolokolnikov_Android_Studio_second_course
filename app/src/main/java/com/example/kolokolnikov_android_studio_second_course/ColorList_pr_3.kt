package com.example.kolokolnikov_android_studio_second_course

class ColorList_pr_3 {
    private val blackHex = "000000"
    private val whiteHex = "FFFFFF"

    val defaultColor: ColorObject_pr_3 = basicColors()[0]

    fun colorPosition(colorobjectPr3: ColorObject_pr_3): Int {
        for (i in basicColors().indices){
            if(colorobjectPr3 == basicColors()[i])
                return i
        }
        return 0
    }


    fun basicColors(): List<ColorObject_pr_3>{
        return listOf(
            ColorObject_pr_3("Серый", "808080", whiteHex),
            ColorObject_pr_3("Красный", "FF0000", whiteHex),
            ColorObject_pr_3("Розовый", "FF00FF", whiteHex),
            ColorObject_pr_3("Зелёный", "008000", whiteHex),
            ColorObject_pr_3("Лаймовый", "00FF00", whiteHex),
            ColorObject_pr_3("Оливковый", "808000", whiteHex),
            ColorObject_pr_3("Жёлтый", "FFFF00", whiteHex),
            ColorObject_pr_3("Синий", "0000FF", whiteHex),
            ColorObject_pr_3("Бирюзовый", "008080", whiteHex),
            ColorObject_pr_3("Морской", "00FFFF", whiteHex))
    }

}