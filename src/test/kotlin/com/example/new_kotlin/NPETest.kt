package com.example.new_kotlin

import org.junit.jupiter.api.Test

class NPETest {
    /*
    * 코틀린의 null 처리
    * 런타임에서 NPE 제거를 목표로 하고있음.
    *
    * NPE 가 가능한 케이스.
    * throw NullPointException()
    * !! 키워드
    * Java와 상호 작용
    * */


    @Test
    fun funNPETest() {
        var name = "jj"
        println("TEST1 -> $name")
//        name = null  // error
        var name2: String? = "jj2"
        name2 = null
        println("TEST2 -> $name2")

        // 분기 없을시 컴파일 에러
        if (name2 != null) {
            name2.length
        }

        // ?. 사용하면 null을 반환.
        println("name = ${name2?.length}")

        /* ?: (엘비스 연산자, Elvis operator)
        *  null일 경우 추가적인 표현식 실행.
        *  return, function, exception 까지 실행가능.
        * */
        val isNotNull: String = name2 ?: "yesNotNull"
        println(isNotNull)

        /*
        * !! operator
        * NPE 발생
        * val name = outterEntity!!.innerEntity!!.name // java.lang.NullPointerException
        * */

        
    }
}