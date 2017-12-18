package com.example.ritwikjha.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.nio.file.attribute.AclFileAttributeView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* buFindAge.setOnClickListener{
            val yearofBirth=txtYearOfBirth.text.toString().toInt()
            val currentyear=Calendar.getInstance().get(Calendar.YEAR)
            val myage= currentyear-yearofBirth
            tvShowAge.text="Your age is $myage years"
        } */
    }

    fun buFindAgeEvent(view:View){
        if(txtYearOfBirth.text.toString().toLong()>Calendar.getInstance().get(Calendar.YEAR)){
            tvShowAge.text="Invalid Input, have u come from future???"
            return
        }
        else if (txtYearOfBirth.text.toString().toLong()<1930){
            tvShowAge.text="Give ur DOB of this birth instead of previous one"
            return
        }
        val yearofBirth=txtYearOfBirth.text.toString().toLong()
        val currentyear=Calendar.getInstance().get(Calendar.YEAR)
        val myage= currentyear-yearofBirth
        tvShowAge.text="Your age is $myage years"
    }
}
