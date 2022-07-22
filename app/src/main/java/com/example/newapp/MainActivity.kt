package com.example.newapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnstart : Button = findViewById(R.id.btnstart)
        val etname : EditText = findViewById(R.id.etname)
        btnstart.setOnClickListener {

            if (etname.text.isEmpty()){

            }else{
                val intent = Intent(this, NewApp2::class.java)
                intent.putExtra(Constants.User_Name,etname.text.toString())
                startActivity(intent)
                finish()
            }
        }


    }
}