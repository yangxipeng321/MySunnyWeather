package com.example.mysunnyweather.logic.network

import com.example.mysunnyweather.MySunnyWeatherApplication
import com.example.mysunnyweather.logic.model.DailyResponse
import com.example.mysunnyweather.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {
    @GET("v2.5/${MySunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng")lng:String,@Path("lat")lat:String):Call<RealtimeResponse>

    @GET("v2.5/${MySunnyWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng")lng:String,@Path("lat")lat:String):Call<DailyResponse>
}