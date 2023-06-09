package com.example.kolokolnikov_android_studio_second_course

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kolokolnikov_android_studio_second_course.databinding.CharacterItem30mayBinding

class CharacterAdapter_06june1: RecyclerView.Adapter<CharacterAdapter_06june1.CharacterHolder>() {

    val characters = ArrayList<Character_06june_1>()

    class CharacterHolder(item: View): RecyclerView.ViewHolder(item){
        val binding = CharacterItem30mayBinding.bind(item)
        fun bind(character: Character_06june_1) = with(binding){
            imageView.setImageResource(character.imageId)
            textViewTitle.text = character.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.character_item_30may, parent, false)
        return CharacterHolder(view)
    }

    override fun onBindViewHolder(holder: CharacterHolder, position: Int) {
        holder.bind(characters[position])
    }

    override fun getItemCount(): Int {
        return characters.size
    }

    fun addCharacter(character: Character_06june_1){
        characters.add(character)
        notifyDataSetChanged()
    }
}