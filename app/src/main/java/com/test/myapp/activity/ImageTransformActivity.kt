package com.test.myapp.activity

import android.os.Bundle
import android.view.View
import androidx.core.view.ViewCompat
import com.test.myapp.R
import com.test.myapp.base.BaseActivity

class ImageTransformActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_transform)

        val iconHandView = findViewById<View>(R.id.iconHand)
        ViewCompat.setTransitionName(iconHandView, "detail:image")
    }
}