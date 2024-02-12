package ru.spider.bottomsheetwithinput

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

lateinit var button: MaterialButton

class MainActivity : AppCompatActivity() {

    lateinit var button: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.action)

        button.setOnClickListener {
            InputBottomSheetFragment().show(
                supportFragmentManager,
                null
            )
        }

    }
}