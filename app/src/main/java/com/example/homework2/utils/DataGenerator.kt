package com.example.homework2.utils

import com.example.homework2.R
import com.example.homework2.model.ItemModel

object DataGenerator {
    private val titles = listOf(
        "Первый котик",
        "Второй котик",
        "Третий котик",
        "Четвертый котик",
        "Пятый котик"
    )

    private val descriptions = listOf(
        "Мягкий и пушистый",
        "Любит спать",
        "Игривый",
        "Любит покушать",
        "Очень ласковый"
    )

    val images = listOf(
        R.drawable.cat1,
        R.drawable.cat2,
        R.drawable.cat3,
        R.drawable.cat4,
        R.drawable.cat5
    )

    fun generateItems(count: Int): List<ItemModel> {
        
        return List(count) { i ->
            ItemModel(
                id = i,
                imageRes = images[i % images.size],
                title = titles[i % titles.size],
                description = descriptions[i % descriptions.size]
            )
        }
    }
}