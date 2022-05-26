package com.example.nativeandroidunity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.unity3d.player.UnityPlayerActivity

class UnityHandlerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unity_play)

        val btnClick = findViewById<Button>(R.id.btnClick)

        btnClick.setOnClickListener {
            Log.i("Btn Click Start Tag : ", "Start Click OK!")
            startActivity(Intent(this, UnityPlayerActivity::class.java))
        }
    }
}