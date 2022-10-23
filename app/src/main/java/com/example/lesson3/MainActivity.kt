package com.example.lesson3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var foods = arrayListOf("Hamburger", "Chinese", "Italian", "American");
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDecide.setOnClickListener {
            var randonFood = foods.random();
            while(randonFood == txtFood.text) {
                randonFood = foods.random();
            }
            txtFood.text = randonFood;
        }

        btnAddFood.setOnClickListener {
            val newFood = inputAddFood.text.toString();
            if(newFood != ""){
                foods.add(newFood);
                inputAddFood.text?.clear()
            }
        }
    }
}