package com.test.myapp.activity

import android.content.Intent
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.Explode
import android.view.View
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import com.test.myapp.R

class TransitionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(window) {
            requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
            enterTransition = Explode()
            returnTransition = AutoTransition()
            exitTransition = Explode()
        }
        setContentView(R.layout.activity_transition)

        findViewById<View>(R.id.iconHand).setOnClickListener {
            val activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(this, Pair(it, "detail:image"))
            ActivityCompat.startActivity(
                this,
                Intent(this, ImageTransformActivity::class.java),
                activityOptions.toBundle()
            )
        }
    }
}