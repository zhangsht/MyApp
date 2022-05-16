package com.test.myapp.main

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.Explode
import android.view.Window
import androidx.databinding.DataBindingUtil
import com.test.myapp.R
import com.test.myapp.activity.TransitionActivity
import com.test.myapp.base.BaseActivity
import com.test.myapp.dagger.DaggerFragment
import com.test.myapp.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        with(window) {
            requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
            enterTransition = Explode()
            returnTransition = AutoTransition()
        }

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setButtonAction()
    }

    private fun setButtonAction() {
        binding.jumpBtn.setOnClickListener {
            Intent(this, TransitionActivity::class.java).let {
                startActivity(it, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
            }
        }

        binding.showFragment.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fragmentContainer, DaggerFragment.newInstance())
                .commitAllowingStateLoss()
        }
    }
}