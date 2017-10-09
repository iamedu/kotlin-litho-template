package com.conveyor.transport

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.facebook.litho.ComponentContext
import com.facebook.litho.LithoView
import com.facebook.litho.widget.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val c = ComponentContext(this)
        val lithoView = LithoView.create(
                this,
                Text.create(c)
                    .text("Hello world!")
                    .textSizeDip(50f)
                    .build())

        setContentView(lithoView)
    }
}
