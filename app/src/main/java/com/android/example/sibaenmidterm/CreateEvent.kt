package com.android.example.sibaenmidterm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class CreateEvent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_event)

        val pressCancel = findViewById<Button>(R.id.button1)
        val pressHome = findViewById<Button>(R.id.button2)
        val pressSave = findViewById<Button>(R.id.button3)

        pressHome?.setOnClickListener {
            val iNext= Intent(this, HomeActivity::class.java)
            startActivity(iNext)
        }
        pressCancel?.setOnClickListener {
            Toast.makeText(this, "Details not saved", Toast.LENGTH_SHORT).show()
        }
        pressSave?.setOnClickListener {
            Toast.makeText(this, "Details saved", Toast.LENGTH_SHORT).show()
        }
    }
}