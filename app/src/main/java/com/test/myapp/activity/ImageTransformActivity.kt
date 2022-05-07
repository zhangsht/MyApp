package com.test.myapp.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import com.test.myapp.R

class ImageTransformActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_transform)

        val iconHandView = findViewById<View>(R.id.iconHand)
        ViewCompat.setTransitionName(iconHandView, "detail:image")
    }
}