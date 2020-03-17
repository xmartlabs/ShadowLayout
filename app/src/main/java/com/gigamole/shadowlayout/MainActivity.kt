package com.gigamole.shadowlayout

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import coil.api.load

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    (findViewById<ImageView>(R.id.imageView))
        .load("https://github.com/xmartlabs/fountain/blob/master/images/banner.png?raw=true")
  }
}