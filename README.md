# Weather Forecast App 🗞
Retrieve Weather Forecast Information from CurrentWeatherData API to show an example concepts of MVVM and Kotlin

The weather information retrieved from https://openweathermap.org/api > CurrentWeatherData API and Display the data in a list.

Compatibility with Android 4.1 and onwards
Code quality, readability and consistent code style
Best UI practices (Material design)
Unit test (JUnit/Robolectric)
UI tests using Espresso
Retrofit
Android Architecture Components

The idea is to keep the app super simple while demonstrating new libraries and tools which makes it easier to build high quality Android applications.

# Development Setup 🖥

You will require latest version of Android Studio 3.0 (or newer) to be able to build the app

## API key 🔑
You'll need to provide API key to fetch the weather data from the openweather Service (API). Currently the data is fetched OpenWeather [OpenWeather API](https://openweathermap.org/)

- Build the app

## Libraries and tools 🛠

Weather
 App uses libraries and tools used to build Modern Android application, mainly part of Android Jetpack 🚀

- [Kotlin](https://kotlinlang.org/) first
- Architecture components
- [Retrofit](https://square.github.io/retrofit/)
- Other [Android Jetpack](https://developer.android.com/jetpack) components


## Architecture

The app uses MVVM [Model-View-ViewModel] architecture to have a unidirectional flow of data, separation of concern, testability, and a lot more.

Read more: 
- [Building Modern Android Apps with Architecture Guidelines](https://medium.com/@aky/building-modern-apps-using-the-android-architecture-guidelines-3238fff96f14)
- [Guide to app architecture](https://developer.android.com/jetpack/docs/guide)

![Architecture](https://developer.android.com/topic/libraries/architecture/images/final-architecture.png)

--------------------

## Learn Architecture Components
Trying to learn the new Architecture Components. I have wrote a series of articles to understand Android Architecture Components. Feel free to check it out to learn more.

- [Introduction to Architecture Components](https://medium.com/@aky/introduction-to-android-architecture-components-22b8c84f0b9d)
- [Exploring ViewModel Architecture component](https://medium.com/@aky/exploring-viewmodel-architecture-component-5d60828172f9)
- [Exploring LiveData Architecture component](https://medium.com/@aky/exploring-livedata-architecture-component-f9375d3644ee)
- [Exploring Room Architecture component](https://medium.com/@aky/exploring-room-architecture-component-6db807094241)
- [Building Modern Android Apps with Architecture Guidelines](https://medium.com/@aky/building-modern-apps-using-the-android-architecture-guidelines-3238fff96f14)

### Extra - Caster.io Course and Podcast
- [Android Architecture Components - A Deep Dive - Caster.io](https://caster.io/courses/android-architecture-components-deep-dive) 📺
- [Android Architecture Components Podcast on Fragmented](http://fragmentedpodcast.com/episodes/115/) 🎤

## Testing
The architecture components are highly testable. Following table shows how to test various parts of the app (cheatsheet for testing architecture component)

|  Component |     Test     |        Mock        |
|:----------:|:------------:|:------------------:|
|     UI     |   Espresso   |      ViewModel     |
|  ViewModel |     JUnit    |     Repository     |
| Repository |     JUnit    | DAO and WebService |
|     DAO    | Instrumented |          -         |
| WebService | Instrumented |    MockWebServer   |
