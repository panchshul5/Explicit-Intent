package com.pushpendra.android.explicitintent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ShowMessage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.message_show_layout)

        val message = intent.getStringExtra(MESSAGE)   //receiving the intent from MainActivity.kt and extracting the message sent.
        val messageTextView = findViewById<TextView>(R.id.show_message_text_view)//hook for the message textView UI.
        messageTextView.text = message //setting the UI TextView to show the the message text.
    }
}