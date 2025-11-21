package com.example.lesson3

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson3.databinding.ActivityTest1Binding
import com.example.lesson3.databinding.ActivityTest2Binding

class TestActivity2: AppCompatActivity() {

    lateinit var binding: ActivityTest2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTest2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun returnToMain2(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun onClickGoTest1(view: View) {
        val intent = Intent(this, TestActivity1::class.java)
        startActivity(intent)
    }

    fun finish(view: View) {
        finish()
    }
}