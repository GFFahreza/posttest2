package com.galih254.posttest2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StoryAdapter(private val storyList: List<Story>) : RecyclerView.Adapter<StoryAdapter.StoryViewHolder>() {

    class StoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val storyImage: ImageView = itemView.findViewById(R.id.story_image)
        val storyTitle: TextView = itemView.findViewById(R.id.story_title)
        val storyDescription: TextView = itemView.findViewById(R.id.story_description)
        val storyAuthor: TextView = itemView.findViewById(R.id.story_author)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.halaman_item, parent, false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        val currentStory = storyList[position]
        holder.storyImage.setImageResource(currentStory.imageResId)
        holder.storyTitle.text = currentStory.title
        holder.storyDescription.text = currentStory.description
        holder.storyAuthor.text = "Oleh: ${currentStory.author}"
    }

    override fun getItemCount(): Int {
        return storyList.size
    }
}