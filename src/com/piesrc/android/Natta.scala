package com.piesrc.android

import _root_.android.app.Activity
import _root_.android.content.Context
import _root_.android.os.Bundle
import _root_.android.widget.{ArrayAdapter, ListView}

class Natta extends Activity {

    private var tweetList: ListView = _

    override def onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main)

        tweetList = findViewById(_root_.android.R.id.list).asInstanceOf[ListView]
        val tweets = Array(
            "Hello", "Twitter", "World"
        )
        val adapter = new ArrayAdapter[String](this, R.layout.list_item, tweets)
        tweetList setAdapter adapter
    }
}
