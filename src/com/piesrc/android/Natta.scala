package com.piesrc.android

import _root_.android.app.Activity
import _root_.android.content.Context
import _root_.android.os.Bundle
import _root_.android.widget.{ArrayAdapter, Button, EditText, ListView}

class Natta extends Activity {

    private var newTweet: EditText = _
    private var tweetList: ListView = _
    private var sendBtn: Button = _

    override def onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main)

        tweetList = findViewById(R.id.list).asInstanceOf[ListView]
        newTweet = findViewById(R.id.textField).asInstanceOf[EditText]
        sendBtn = findViewById(R.id.button).asInstanceOf[Button]

        val tweets = Array(
            "Hello", "Twitter", "World"
        )

        val adapter = new ArrayAdapter[String](this, R.layout.list_item, tweets)
        tweetList setAdapter adapter
    }
}
