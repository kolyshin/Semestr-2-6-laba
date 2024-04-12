package com.example.semestr_2_6_laba

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView: ImageView = findViewById(R.id.imageView)
        val sunRiseAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.sun_rise)
        imageView.startAnimation(sunRiseAnimation)
        val imageView1: ImageView = findViewById(R.id.Clock)
        val clockTurnAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.clock_turn)
        imageView1.startAnimation(clockTurnAnimation)
        val imageView2: ImageView = findViewById(R.id.imageView6)
        val hourTurn: Animation = AnimationUtils.loadAnimation(this, R.anim.hour_turn)
        imageView2.startAnimation(hourTurn)
    }
}