package com.test.myapp.main

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.Explode
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.test.myapp.R
import com.test.myapp.activity.TransitionActivity
import com.test.myapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        with(window) {
            requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
            enterTransition = Explode()
            returnTransition = AutoTransition()
        }

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.jumpBtn.setOnClickListener {
            Intent(this, TransitionActivity::class.java).let {
                startActivity(it, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
            }

        }
    }
}