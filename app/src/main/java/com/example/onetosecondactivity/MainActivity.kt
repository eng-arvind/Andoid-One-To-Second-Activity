package com.example.onetosecondactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnsendMessagetonexActivity.setOnClickListener {
            val message : String=etuserMessage.text.toString()
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
            val intent=Intent(this,Main2Activity::class.java)
            startActivity(intent)
        }
    }
}

