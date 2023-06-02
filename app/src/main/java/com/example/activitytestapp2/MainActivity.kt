package com.example.activitytestapp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button=findViewById(R.id.btn);

        btn.setOnClickListener(){
            secondApp();
        }
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"pause called",Toast.LENGTH_LONG).show()
    }
    fun secondApp(){
        val i= Intent(this,SecondActivity::class.java)
        startActivity(i)
    }

}