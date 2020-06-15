package com.nishanth.weatherforecast.network

import com.nishanth.weatherforecast.network.Response.ForecastResponse
import com.nishanth.weatherforecast.network.Response.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET("/data/2.5/weather")
    fun getWeather(@Query("zip") id: String, @Query("appid") appId: String, @Query("units") units: String): Call<WeatherResponse>

    @GET("/data/2.5/forecast")
    fun getWeatherForecast(@Query("q") id: String, @Query("appid") appId: String, @Query("units") units: String, @Query("ent") ent: Int): Call<ForecastResponse>
}