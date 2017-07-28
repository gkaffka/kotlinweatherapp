package com.kaffka.weatherapp.data

import android.util.Log
import java.net.URL

/**
 * Created by kaffka on 7/29/2017.
 */
class Request(val url: String) {
    fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}