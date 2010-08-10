package com.piesrc.android


// we need these _root_ because com.android exists,
// and we are in com.example.helloscala.
import _root_.android.app.Activity
import _root_.android.os.Bundle


// Not another terrible twitter app
class Natta extends Activity {
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)
  }
}
