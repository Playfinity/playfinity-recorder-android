package com.playfinity.recorder.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.playfinity.recorder.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        findViewById<LinearLayout>(R.id.top)
            .setOnClickListener {
                val intent = Intent(this, FootballActivity::class.java)
                startActivity(intent)
            }

        findViewById<LinearLayout>(R.id.bottom)
            .setOnClickListener {
                val intent = Intent(this, SmartBallActivity::class.java)
                startActivity(intent)
            }
    }
}
