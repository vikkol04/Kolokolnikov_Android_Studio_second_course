package com.example.kolokolnikov_android_studio_second_course

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import org.w3c.dom.Text



class ColorSpinnerAdapter_pr_3 (context: Context, list: List<ColorObject_pr_3>)
    : ArrayAdapter<ColorObject_pr_3>(context, 0 , list)
{
    private var layoutInflater = LayoutInflater.from(context)

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View
    {
        val view: View = layoutInflater.inflate(R.layout.color_spinner_bg_pr_3, null, true)
        return view(view, position)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View
    {
        var cv = convertView
        if(cv == null)
            cv = layoutInflater.inflate(R.layout.color_spinner_item_pr_3, parent, false)
        return view(cv!!, position)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun view(view: View, position: Int): View
    {
        val colorObject: ColorObject_pr_3 = getItem(position)?: return view

        val colorNameItem = view.findViewById<TextView>(R.id.colorName)
        val colorHexItem = view.findViewById<TextView>(R.id.colorHex)
        val colorNameBG = view.findViewById<TextView>(R.id.colorNameBG)
        val colorBlob = view.findViewById<View>(R.id.colorBlob)

        colorNameBG?.text = colorObject.name
        colorNameBG?.setTextColor(Color.parseColor(colorObject.contrastHexHash))

        colorNameItem?.text = colorObject.name
        colorHexItem?.text = colorObject.hex

        colorBlob?.background?.setTint(Color.parseColor(colorObject.hexHash))

        return view
    }
}