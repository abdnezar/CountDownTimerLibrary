# Countdown Timer Library
A lightweight Android library that simplifies working with Countdown Timer Class with TextView can add to your views

## Features
* Easy to use
* have xml view (CountDownTimerView)
* add counter listener to listen to remaining time
* control timer (startCountDown(), stopCountDown())

## Installation
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
dependencies {
  implementation 'com.github.abdnezar:CountdownTimerLibrary:1.0.1'
}
```

## latest  version on maven: 
[![](https://jitpack.io/v/abdnezar/CountdownTimerLibrary.svg)](https://jitpack.io/#abdnezar/CountdownTimerLibrary)

## Usage
add to your layout xml:
```
    <com.abdnezar.countdowntimer.CountDownTimerView
        android:id="@+id/cdt"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:gravity="center"
        android:textSize="26sp"/>
```
add to your Activty Class:
```
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

## License

[MIT License](https://choosealicense.com/licenses/mit/)

