package com.conveyor.transport

import android.app.Application
import com.facebook.soloader.SoLoader

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        SoLoader.init(this, false)
    }
}

