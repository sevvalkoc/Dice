package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Rastgele = Random.nextInt(1,7)
        val Numara = findViewById(R.id.Numara) as TextView
        Numara.text= Rastgele.toString()


    }

    fun Roll(v:View) {
        var Rastgele = Random.nextInt(1,7)
        val viewImage = findViewById(R.id.imageView) as ImageView

        val Numara = findViewById(R.id.Numara) as TextView
        Numara.text= Rastgele.toString()

        if(Rastgele==1){
            viewImage.setImageResource(R.drawable.dice_1)
        }
        else if(Rastgele==2){
            viewImage.setImageResource(R.drawable.dice_2)
        }
        else if(Rastgele==3){
            viewImage.setImageResource(R.drawable.dice_3)
        }
        else if(Rastgele==4){
            viewImage.setImageResource(R.drawable.dice_4)
        }
        else if(Rastgele==5){
            viewImage.setImageResource(R.drawable.dice_5)
        }
        else if(Rastgele==6){
            viewImage.setImageResource(R.drawable.dice_6)
        }

    }


}