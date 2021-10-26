package com.example.birthdaygreeting

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


internal class BirthdayGreetingActivity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name_extra"
    }


       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

         val name = intent.getStringExtra(NAME_EXTRA)

        val birthdayGreeting = findViewById<View>(R.id.birthdayGreeting) as TextView;
         birthdayGreeting.text = "Happy-Birthday \n $name"

           birthdayGreeting.text ="Happy-Birthday \n $name"
       }
 }





