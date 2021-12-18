package com.example.new_kotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

/*
* PascalCase
* */
@SpringBootTest
class NewClassTest {
    /*
    *    클래스 이름 옆에 생성자 키워드 constructor을 넣어 생성자를 선언 가능
    *  ex class NewClassTest constructor(name: String) {
    * */
    /*
    * 맴버 변수.
    * */
    private val innerVal = "InnerVal"

    /*
    * 초기화 블럭 설정.
    * */
    init {
        println("Start NnewClassTest $innerVal")
    }

    @Test
    fun constructorTest() {
        val service = NameService("test")
        println("service = ${service.printName()}")
    }
}

class NameService(name: String) {

    private val firstProperty = "First property: $name"

    init {
        println("First initializer block that pr-ints $name")
    }

    fun printName(): String = this.firstProperty
}