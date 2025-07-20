package com.example.homework2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework2.databinding.ActivityDetailBinding
import com.example.homework2.model.ItemModel

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val item = intent.getParcelableExtra<ItemModel>("ITEM") ?: run {
            finish()
            return
        }

        // Устанавливаем данные
        with(binding) {
            detailImage.setImageResource(item.imageRes)
            detailTitle.text = item.title
            detailDescription.text = item.description
        }
    }
}