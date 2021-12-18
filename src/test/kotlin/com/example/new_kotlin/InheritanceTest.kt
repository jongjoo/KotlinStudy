package com.example.new_kotlin

import org.junit.jupiter.api.Test

open class InheritanceTest {

    /*
    * open으로 열어줘야함.
    * */
    open val firstProperty: String = "InheritanceTest property"
    open fun service(): String = "Base"

    init {
        println("InheritanceTest initialize")
    }

    @Test
    fun inherTest() {
        val mappingService = MappingService("H")
        println("service = ${mappingService.service()}")
    }
}

/*
* 부모클래스 상속. 인터페이스 상속
* */
class MappingService(val fir: String) : InheritanceTest(), MyInterface {

    init {
        println("MappingService initialize")
    }

    /*
    * 오버라이딩
    * */
    override val firstProperty: String = "MappingService property"
    override fun service(): String {
        println(firstProperty)
        return "MappingService"
    }

    override val prop: Int
        get() = 1

    override fun bar() {
        TODO("Not yet implemented")
    }

}

/*
* 코틀린의 모든 클래스는 명시적으로 특정 클래스를 상속 받지 않으면 Any 객체를 묵시적으로 상속받습니다.
* 따라서 Any 클래스는 모든 객체의 부모 객체입니다. 이러한 Any 클래스에는 3가지의 메서드만이 정의되어 있습니다.
* 바로 equals(), hashCode(), toString() 입니다.
* */


/*
* interface
* */
interface MyInterface {
    val prop: Int
    fun bar()
    fun foo() {

    }
}