package com.test.myapp.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.test.myapp.R
import com.test.myapp.activity.TransitionActivity
import com.test.myapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.jumpBtn.setOnClickListener {
            startActivity(Intent(this, TransitionActivity::class.java))
        }
    }
}