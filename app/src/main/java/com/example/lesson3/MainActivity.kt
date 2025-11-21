package com.example.lesson3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import com.example.lesson3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private var text: String = "<всем> привет я в <магазине> как <дела> попробуй вытащить слова"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100 && resultCode == RESULT_OK && data != null) {
            binding.textView3?.visibility = VISIBLE
            var name1 = data.getStringExtra("key")
            binding.textView3?.text = getString(R.string.name, name1)
        }
    }


    fun onClickGoTest1(view: View) {
        val intent = Intent(this, TestActivity1::class.java).also {
            it.putExtra("key", "What is your name?")
            startActivityForResult(it, 100)
        }
    }

    fun onClickGoTest2(view: View) {
        val intent = Intent(this, TestActivity2::class.java)
        startActivity(intent)
    }

    fun finish(view: View) {
        finish()  // close this activity
    }


}

// итог - почему-то не работает - потом когда-нибудь исправить