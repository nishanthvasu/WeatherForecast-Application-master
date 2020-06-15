package com.nishanth.weatherforecast.viewmodel

import android.app.Application
import com.nishanth.weatherforecast.model.WeatherData
import com.nishanth.weatherforecast.model.WeatherDataProcessor
import com.nishanth.weatherforecast.utils.DBHelper
import junit.framework.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers.anyLong
import org.mockito.Mock
import org.mockito.Mockito.never
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations
import java.util.*

class WeatherDataViewModelTest {

    lateinit var weatherDataViewModel: WeatherDataViewModel

    @Mock
    lateinit var mockWeatherDataProcessor: WeatherDataProcessor

    @Mock
    lateinit var mockApplication: Application

    lateinit var db: DBHelper

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        db = DBHelper(mockApplication)
        weatherDataViewModel = WeatherDataViewModel(mockApplication, mockWeatherDataProcessor)
    }

    @Test
    fun testUpdateBadWeatherTemp() {
        val weatherData = WeatherData(temp = 125.0, dateCreated = Date())
        verify(mockWeatherDataProcessor, never()).loadWeatherDataByDt(Date(anyLong()))
        assertNotEquals(mockWeatherDataProcessor.loadWeatherDataByDt(Date(anyLong())), weatherData.dateCreated)
    }

    @Test
    fun testSaveWeatherData() {
        val stubCreateDate = Date()
        val stub = WeatherData(temp = 10.00, dateCreated = stubCreateDate)
        weatherDataViewModel.updateOutputs(stub)
        assertEquals(stubCreateDate, weatherDataViewModel.lastWeatherData.dateCreated)
    }
}