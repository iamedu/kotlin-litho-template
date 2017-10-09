package com.conveyor.transport

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.conveyor.transport.specs.Login
import com.facebook.litho.ComponentContext
import com.facebook.litho.LithoView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val c = ComponentContext(this)

        val lithoView = LithoView.create(
                this,
                Login.create(c).build())

        setContentView(lithoView)
    }
}
