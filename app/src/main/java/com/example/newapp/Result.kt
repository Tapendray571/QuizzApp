package com.example.newapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName:TextView=findViewById(R.id.tvname)
        val tvscore:TextView=findViewById(R.id.tvscore)
        val btnFinish: Button=findViewById(R.id.btnfinish)

        tvName.text=intent.getStringExtra(Constants.User_Name)

        val totalQuestion=intent.getIntExtra(Constants.TOTAL_QUESTION,0)
        val correctAnswer=intent.getIntExtra(Constants.CORRECT_ANSWER,0)

        tvscore.text="your Score is $correctAnswer out of $totalQuestion"
        btnFinish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))

        }



    }
}