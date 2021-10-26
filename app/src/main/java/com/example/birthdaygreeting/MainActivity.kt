package com.example.birthdaygreeting

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
     @Override
// on create tb kaam karta hai jab activity pheli baar create hoti hai....
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    // createBirthdayCard is in activity_main with name online click then we do create func here.

    fun createBirthdayCard(view: View) {
        Toast.makeText(this, "Button Was Clicked", Toast.LENGTH_LONG).show()
    }

}