package com.example.fu04

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.widget.Button
import android.widget.Toast
import androidx.core.view.WindowInsetsCompat
import com.unity3d.player.UnityPlayerGameActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val launchBtn: Button = findViewById(R.id.launchUnityButton)
        launchBtn.setOnClickListener {

            // Perform button click action
            Toast.makeText(this, "Model Deploying", Toast.LENGTH_SHORT).show()

            // Start Unity
            val intent = Intent(this, UnityPlayerGameActivity::class.java)
            startActivity(intent)

        }

    }
}