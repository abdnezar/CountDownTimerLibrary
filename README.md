[![Android CI - Build Apk & AAR](https://github.com/abdnezar/CountdownTimerLibrary/actions/workflows/android.yml/badge.svg)](https://github.com/abdnezar/CountdownTimerLibrary/actions/workflows/android.yml)
[![](https://jitpack.io/v/abdnezar/CountdownTimerLibrary.svg)](https://jitpack.io/#abdnezar/CountdownTimerLibrary)

# Countdown Timer Library for Android
A lightweight Android library that simplifies working with Countdown Timer Class with TextView can add to your views

## Features
The CountdownTimerLibrary simplifies the creation and management of countdown timers in your Android applications. It provides a user-friendly interface for defining timers, customizing their behavior, and receiving updates as the countdown progresses. This library offers features like:

* Easy timer creation and configuration
* Flexible formatting options
* Customizable callbacks for timer updates and completion
* Clear API for integration with your Android projects

**Installation**
1. Add JitPack to your root `build.gradle` at the end of repositories:
```
allprojects {
  repositories {
    // ... other repositories
    maven { url 'https://jitpack.io'  }
  }
}
```

2. Add the dependency in app module build.gradle:
```
// force androidx.appcompat:appcompat:1.6.1 if don't need to updated version 
configurations.configureEach {
    resolutionStrategy {
        force 'androidx.appcompat:appcompat:1.6.1'
    }
}

dependencies {
  implementation 'com.github.abdnezar:CountdownTimerLibrary:1.0.1'
}
```

## latest  version on maven: 
[![](https://jitpack.io/v/abdnezar/CountdownTimerLibrary.svg)](https://jitpack.io/#abdnezar/CountdownTimerLibrary)

## Usage
add to your layout xml:
```xml
    <com.abdnezar.countdowntimer.CountDownTimerView
        android:id="@+id/cdt"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:gravity="center"
        android:textSize="26sp"/>
```
add to your Activty Class:
```kotlin
        cdt = binding.cdt // get CountDownTimerView
        cdt.setTime(10000) // add your time in millisecond

        # add counter listener
        cdt.setOnTimerListener(object : CountDownTimerView.TimerListener {
            override fun onTick(millisUntilFinished: Long) {
                Toast.makeText(this@ExampleActivity, "onTick", Toast.LENGTH_SHORT).show()
            }

            override fun onFinish() {
                Toast.makeText(this@ExampleActivity, "Timer Finished", Toast.LENGTH_SHORT).show()
            }
        })

        # start timer
        cdt.startCountDown()

        # stop timer
        cdt.stopCountDown()
```

you can see full example code in [app](https://github.com/abdnezar/CountdownTimerLibrary/tree/master/app) module

## License

[MIT License](https://choosealicense.com/licenses/mit/)

