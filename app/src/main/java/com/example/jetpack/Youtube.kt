package com.example.jetpack

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import android.util.Log
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_youtube.*

class Youtube : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)


    }
}
