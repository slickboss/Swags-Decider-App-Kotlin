package com.slickboss.kotlinn

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    val nameList = arrayListOf("Ada", "Ifeoma", "Chioma", "Daniella", "Rejoice")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

 //       winnerText.text="You just won yourself a swag"

        decideButton.setOnClickListener{
            val random = Random()
            val randomName = random.nextInt(nameList.count())
          //  winnerText.text="You just won yourself a swag"
            winnerText.text="You just won yourself a swag"  + " - "  + nameList[randomName]
        //    println("it is working")

        }
;
        addButton.setOnClickListener{
            val newName = addName.text.toString()
            nameList.add(newName)
            addName.text.clear()


        }







    }
}
