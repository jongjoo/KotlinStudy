package com.example.new_kotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class StaticClassTest {

    val staticClaTest = StaticClaTest;

    @Test
    fun staticTest() {
//        staticClaTest.create()
        println(staticClaTest.create("123"))
        println(staticClaTest.DEFAULT_NAME)
    }
}

class StaticClaTest private constructor(
    val name: String = DEFAULT_NAME
) {

    /*
    * companion object - 상수
    * ex java. public static final int aa = 0;
    * */
    companion object {
//        fun create(): MappingService = MappingService()

        fun create(name: String): StaticClaTest = StaticClaTest(name)

        const val DEFAULT_NAME: String = "jj"

    }

}
/*
const 키워드를 통해 컴파일 타임 상수를 만들어낼 수 있습니다.
컴파일 타임 상수는 class 명세가 method 메모리 영역에 들어갈 때 함께 초기화 되어 객체를 만들지 않아도 사용할 수 있는 상수입니다.
코틀린에서 이 상수는 3가지 조건을 만족시켜 만들 수 있습니다.

Top-level 또는 object 선언 또는 companion object
String 또는 primitive type
getter 함수가 없음
위 조건을 만족시키는 컴파일 타임 상수들은 아래와 같습니다.
첫번째는 companion object를 클래스 내부에 선언 후 그 내부에 const val을 사용하는 방법입니다.

1.
class MappingService {
    companion object {
        const val DEFAULT_NAME: String = "sabardada"
    }
}

2. top-level
const val DEFAULT_NAME_2: String = "sabardada"
class MappingService private constructor(
    val name: String? = DEFAULT_NAME_2
)

3. SingleTon
object MappingBaseService {
    const val DEFAULT_NAME_3: String = "sabardada"
}
*/

/*
* 접근 제어자
* private - 클래스 외부에서 접근이 불가능합니다.
* protected - 상속관계에 있는 외부에서는 접근이 가능합니다.
* internal - 한 모듈안에서 라면 접근이 가능합니다.
* public - 어디서든 접근이 가능합니다.
* */