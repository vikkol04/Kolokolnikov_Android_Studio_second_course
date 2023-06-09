package com.example.kolokolnikov_android_studio_second_course

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kolokolnikov_android_studio_second_course.databinding.CharacterItem30mayBinding

class CharacterAdapter_30may: RecyclerView.Adapter<CharacterAdapter_30may.CharacterHolder>() {

    val characters = ArrayList<Character_30may>()

    class CharacterHolder(item: View): RecyclerView.ViewHolder(item){
        val binding = CharacterItem30mayBinding.bind(item)
        fun bind(character: Character_30may) = with(binding){
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

    fun addCharacter(character: Character_30may){
        characters.add(character)
        notifyDataSetChanged()
    }
}