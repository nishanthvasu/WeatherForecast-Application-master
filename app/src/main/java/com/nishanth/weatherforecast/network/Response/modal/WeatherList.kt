package com.nishanth.weatherforecast.network.Response.modal

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class WeatherList {

    @SerializedName("dt")
    @Expose
    val dt: Int = 0
    @SerializedName("main")
    @Expose
    val main: Main? = null
    @SerializedName("weather")
    @Expose
    val weather: List<Weather>? = null
    @SerializedName("clouds")
    @Expose
    val clouds: Clouds? = null
    @SerializedName("wind")
    @Expose
    val wind: Wind? = null
    @SerializedName("sys")
    @Expose
    val sys: Sys? = null
    @SerializedName("dt_txt")
    @Expose
    val dtTxt: String? = null
    @SerializedName("rain")
    @Expose
    val rain: Rain? = null
}