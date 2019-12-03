package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.RandomAccess

class MainActivity : AppCompatActivity() {
    //Code By Adnan Shehzad for Simple ArrayList Iteration
    val list = arrayListOf<String>("Hamburger", "American", "Chinese","Pakistani","Indian")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun addFoodInList(view: View) {
        tv_newFood.text = tv_add.text
        list.add(tv_add.text.toString())
    }
    fun decide(view: View) {

        tv_newFood.text = list.shuffled().take(1)[0]
    }
}
