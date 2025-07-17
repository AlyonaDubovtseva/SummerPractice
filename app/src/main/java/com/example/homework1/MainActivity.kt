package com.example.homework1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val picturesList = listOf(
        "https://images.steamusercontent.com/ugc/10803836100593538/946D745B8F0BAB1CE2F84D99074019F9BBBC5DF0/?imw=637&imh=358&ima=fit&impolicy=Letterbox&imcolor=%23000000&letterbox=true",
        "https://avatars.mds.yandex.net/i?id=63890b429d57816e8e72540c07a6ca0f_l-4146488-images-thumbs&n=13",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Likee.jpg/330px-Likee.jpg",
        "https://sf-static.tiktokcdn.com/obj/eden-sg/uhtyvueh7nulogpoguhm/tiktok-icon2.png",
        "https://cdn.tripster.ru/thumbs2/96e82566-847f-11ef-b246-8e8f6606cbb1.1220x600.jpeg",
        "https://moya-planeta.ru/upload/images/xl/85/ec/85ec639804ea05eb0d5bf4e6793c540e5951d508.jpg",
        "https://lh6.googleusercontent.com/proxy/YbYSvmNVtYtsWIbMWANrcTe-TkuoFmX7YKvk72gJ7nVxZJC3NzzMwaDRWoLPzPAd0NbB5y3Mgw_ZndbCO2DUfjUC41UyG3gD7N95l7uYWmdMNttv2Y0uMAfCokYWKpQgd3tE5-tsTJo",
        "https://steamuserimages-a.akamaihd.net/ugc/922555509665459837/880A9BDFB071EF1DAABA36ACED10C66BC85314C7/",
        "https://alpagama.org/wp-content/uploads/2017/02/fk_sredi_vershin2016-17.jpg",
        "https://chudo-udo.info/images/stories/kontent2/167_19.jpg"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val btnRandomImage = findViewById<Button>(R.id.btnRandomImage)
        val btnNext = findViewById<Button>(R.id.btnNext)
        btnRandomImage.setOnClickListener {
            val index = Random.nextInt(0, 10)
            val url = picturesList[index]
            Glide.with(this)
                .load(url)
                .into(imageView)
        }
        btnNext.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}