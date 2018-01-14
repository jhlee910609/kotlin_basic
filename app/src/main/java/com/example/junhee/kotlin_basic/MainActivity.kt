package com.example.junhee.kotlin_basic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val immutable: List<String> = listOf("jun hee", "hee jin", "young jun")
        // immutable 객체에 add 함수 자체가 정의되어 있지 않음
        immutable.add

    }
}
