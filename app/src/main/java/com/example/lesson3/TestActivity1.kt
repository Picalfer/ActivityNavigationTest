package com.example.lesson3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lesson3.databinding.ActivityMainBinding
import com.example.lesson3.databinding.ActivityTest1Binding

class TestActivity1 : AppCompatActivity() {

    lateinit var binding: ActivityTest1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val message = intent.getStringExtra("key")

        binding.textFromMain.text = message
    }

    fun onClickGoTest2(view: View) {
        val intent = Intent(this, TestActivity2::class.java)
        startActivity(intent)
    }

    fun returnToMain(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun finish(view: View) {
        intent.putExtra("key", binding.tvName.text.toString())
        setResult(RESULT_OK,intent)
        finish()
    }
}