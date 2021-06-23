package com.example.mysunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class MySunnyWeatherApplication : Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "T72n95OEHOwDWZrL"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}