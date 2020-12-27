package com.pushpendra.android.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

const val MESSAGE = "com.pushpendra.android.explicitintent.MESSAGE"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messageEditText = findViewById<EditText>(R.id.message_edit_text)
        val sendButton = findViewById<Button>(R.id.send_button)

        sendButton.setOnClickListener{
            val text = messageEditText.text.toString()
            val intent  = Intent(this,ShowMessage::class.java).apply {
                putExtra(MESSAGE,text)
            }
            startActivity(intent)
        }
    }
}