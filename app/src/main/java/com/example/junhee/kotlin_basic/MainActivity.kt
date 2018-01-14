package com.example.junhee.kotlin_basic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    /**
     * 1. 코틀린의 문법적 특징
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1.1 표현의 간결성
        // 변수의 타입 자동 추론 가능
        val name_1 = "jun hee"

        // 변수의 형 명시 또한 가능
        val name_2: String = "jun hee"

        // 클래스 생성 시, new ClassName() 하지 않아도 됨
        val person = Person(name_1)


        // 1.2. 가변/불변 변수
        // immutable 객체에 add 함수 자체가 정의되어 있지 않음
        val immutable: List<String> = listOf("jun hee", "hee jin", "young jun")
        immutable.add

        var mutable: MutableList<String> = mutableListOf("jun hee", "hee jin", "young jun")
        mutable.add("seung hee")

        // 1.3. 람다식 지원
        findViewById<TextView>(R.id.textview).setOnClickListener {
            Toast.makeText(applicationContext, "good!", Toast.LENGTH_SHORT)
        }

        // 1.4. 스트림 API 지원
        val items = listOf<Int>(1, 3, 5, 67, ,9, 432, 34, 45, 7, 23, 4)
        val filteredVal = items.filter { it > 50 }


        /**
         * 2. 코틀린의 주요 문법
         */

        // 2.1. 함수 선언
        fun printMyName() {
            print("jun hee")
        }

        fun printSth(): Unit {
            print("jun hee")
        }

        fun printDogName(doggy: String) {
            // 훨씬 편리
            print("dog name is $doggy!")
            // 자바에선 아래와 같이 명시해줘야 했던 부분
            print("dog name is " + doggy + "!")
        }
    }

    // 2.2. 클래스 생성
    class Dog : Animal() {
        override fun run() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun sleep() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun bark() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        val type = "dog"
        fun sayType() {
            print("my type is $type")
        }
    }

    // kotlin은 상속 가능한 class 앞에 open을 명시한다.
    open class Animal(val kind : String, val legs : Int) : Behavior {
        override fun bark() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun run() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun sleep() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        constructor() : this()

    }

    // 2.3. interface 선언
    interface Behavior {
        fun bark()
        fun run()
        fun sleep()
    }

    // 2.3. 조건문
    // if 문
    fun checkAdult(age: Int): Boolean {
        if (age > 20)
            return true
        else
            return false
    }

    // when 문 (= switch in java)
    fun checkCountry(type : Int) : String {
        when (type){
            1 -> return "korea"
            else -> return "other country"
        }
    }

    object Dog





}
