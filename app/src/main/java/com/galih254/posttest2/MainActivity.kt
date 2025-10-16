package com.galih254.posttest2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view_stories)

        val storyDataList = ArrayList<Story>()
        storyDataList.add(
            Story(
                "Keindahan Tersembunyi Gunung Bromo",
                "Gunung Bromo di Jawa Timur menawarkan pemandangan matahari terbit yang megah...",
                "Galih 254",
                R.drawable.bromo
            )
        )
        storyDataList.add(
            Story(
                "Resep Nasi Goreng Spesial Keluarga",
                "Nasi goreng adalah hidangan favorit sepanjang masa. Dengan resep ini, Anda bisa...",
                "Galih 254",
                R.drawable.nasgor
            )
        )
        storyDataList.add(
            Story(
                "Smartphone Terbaru Rilis dengan Kamera 200MP",
                "Persaingan di pasar smartphone semakin sengit dengan diluncurkannya model terbaru...",
                "Galih 254",
                R.drawable.hp
            )
        )

        val adapter = StoryAdapter(storyDataList)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}