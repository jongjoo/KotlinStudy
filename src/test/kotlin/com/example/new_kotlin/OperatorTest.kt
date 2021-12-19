package com.example.new_kotlin

import org.junit.jupiter.api.Test

class OperatorTest {

    /*
    * 무지하게 생소한 연산자 오버로딩..
    * 연산자를 오버로딩한다.. 신기하네.
        a + b	a.plus(b)
        a - b	a.minus(b)
        a * b	a.times(b)
        a / b	a.div(b)
        a % b	a.rem(b)
        a += b	a.plusAssign(b)
        a -= b	a.minusAssign(b)
        a *= b	a.timesAssign(b)
        a /= b	a.divAssign(b)
        a %= b	a.remAssign(b)

    https://sabarada.tistory.com/174?category=941106 참고.
    * */


    // data
    val ttdata = Testdata("name", 20)
    @Test
    fun dataTest(){
        println(ttdata.name)
        ttdata.age = 1
        println(ttdata.age)
        println(ttdata.adr)
    }
}

data class Testdata(
    val name: String,
    var age: Int,
){
    val adr: String = "what"
}