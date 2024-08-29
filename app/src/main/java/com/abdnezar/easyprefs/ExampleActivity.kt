package com.abdnezar.easyprefs

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.abdnezar.countdowntimer.databinding.ActivityExampleBinding
import com.abdnezar.countdowntimer.CountDownTimerView

class ExampleActivity : AppCompatActivity() {
    private val TAG = this.javaClass.simpleName
    private lateinit var binding: ActivityExampleBinding
    private lateinit var cdt: CountDownTimerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        cdt = binding.cdt
        cdt.setTime(10000)

        cdt.setOnTimerListener(object : CountDownTimerView.TimerListener {
            override fun onTick(millisUntilFinished: Long) {
                Toast.makeText(this@ExampleActivity, "onTick", Toast.LENGTH_SHORT).show()
            }

            override fun onFinish() {
                Toast.makeText(this@ExampleActivity, "Timer Finished", Toast.LENGTH_SHORT).show()
            }
        })

        cdt.startCountDown()
    }

    override fun onStop() {
        super.onStop()

        cdt.stopCountDown()
    }

}