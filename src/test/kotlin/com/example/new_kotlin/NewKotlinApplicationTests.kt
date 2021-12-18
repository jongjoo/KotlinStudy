package com.example.new_kotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class NewKotlinApplicationTests {

    /*
    * 출력
    * */
    @Test
    fun contextLoads() {
        val name = "NAME"
        val name2 = 1
        var age = 20;

        age = 30;
        println(name)
        println(name2)
        println(age)
    }

    /*
    * 조건문
    * */
    @Test
    fun ifTest() {
        var a = 3
        var b = 2

        if (a > b) {
            a = 1
        }
        println(a)

        when (a) {
            1 -> println("data - 1")
            in 3..10 -> println("data - 2")
            else -> println("else")

        }

        when {
            false -> println("True")
            true -> println("True2")
        }
    }

    /*
    * 반복문.
    * */
    @Test
    fun forTest() {
        val array = arrayOf(1, 2, 3, 4, 5)
        for (i in array) {
            print(i)
        }
    }

    /*
    * 입력, 리턴 함수
    * */
    fun functionTest(x: Int = 1): Int {
        return x * 2
    }

    // return 생략 및 타입추론
    /*
    * 소스 비교 명확히 가능 - git 등을 사용하여 코드를 비교할 때 , 는 변화로 잡지 않기 때문에 값의 변화에 집중할 수 있습니다.
    * 순서 재정렬이 편함 - 함수, enum 등에서 재정렬할때 , 를 신경쓰지 않아도 됩니다.
    * 코드 자동생성 만들 시 편함 - 마지막 파라미터일 때는 ,를 뺀다라는 로직이 필요없으므로 코드 자동생성을 만들때 좋습니다.
    * */
    fun functionTest2(
        x: Int = 1,
        y: Int,
    ) = x * y

    /*
    * 클로저
    * */
    fun closureTest(x: Int = 2): Int{
        fun closureFun(x: Int) = x * 3
        return closureFun(3) * 2
    }

}
