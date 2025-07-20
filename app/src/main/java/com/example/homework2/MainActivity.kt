package com.example.homework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework2.adapters.ItemsAdapter
import com.example.homework2.databinding.ActivityMainBinding
import com.example.homework2.utils.DataGenerator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val items = DataGenerator.generateItems(5)

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ItemsAdapter(items) { item ->

                startActivity(
                    Intent(this@MainActivity, DetailActivity::class.java).apply {
                        putExtra("ITEM", item)
                    }
                )
            }
        }
    }
}