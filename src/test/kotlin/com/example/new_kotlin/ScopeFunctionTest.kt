package com.example.new_kotlin

import org.junit.jupiter.api.Test

class ScopeFunctionTest {


    @Test
    fun printTest() {
        val constServiceTest = ConstServiceTest("JJ", 20);
        println(constServiceTest)
        constServiceTest.changeName("Jong")
        constServiceTest.incrementAge()
        println(constServiceTest)

        /*
        * Scope Function
        * let, run, with, apply, also
        *
        *   this : run, with, apply
        *   it : let, also
        * 함수	객체 참조 방법	반환 값	확장 함수 여부
            let 	it	    Lambda result	Yes
            run	    this	Lambda result	Yes
            run	    this	Lambda result	No: called without the context object
            with	this	Lambda result	No: takes the context object as an argument.
            apply	this	Context object	Yes
            also	it	    Context object	Yes
        * */

        /*
        * let
        * non-null일 경우
        * */
        ConstServiceTest("JJ", 20).let {
            println(it)
            it.changeName("Jong")
            it.incrementAge()
            println(it)
        }

        /*
        * also
        * call changing
        * */
        ConstServiceTest("JJ", 20)
            .also { println(it) }
            .also { it.changeName("Jong") }
            .also { it.incrementAge() }
            .let { println(it) }

        /*
        * with
        * 확장 함수가 아님. 객채를 파라미터로 받음.
        *  */
        with(ConstServiceTest("JJ", 20)) {
            println(this)
            this.changeName("Jong")
            this.incrementAge()
            println(this)
        }

        /*
        * apply
        * this를 통해 해당 객체에 접근가능. 객체 자체를 반환함.
        * */
        val constServiceTest2: ConstServiceTest = ConstServiceTest("jj", 20)
            .apply {
                this.incrementAge()
                this.incrementAge()
            }
        println(constServiceTest2)

        /*
        * run
        * this를 이용하여 접근 가능. 람다 반환.
        * */
        val objectString: String = ConstServiceTest("JJ", 20).run {
            this.incrementAge()
            this.toString()
        }
        println(objectString)
        val resultString: String = run {
            val first: String = "jong"
            val second: String = "joo"

            "$first is $second"
        }
        println(resultString) // 결과 : sabarada is Karol


    }

}

class ConstServiceTest(
    private var name: String,
    private var age: Int,
) {
    fun changeName(name: String) {
        this.name = name
    }

    fun incrementAge() {
        age++
    }

    override fun toString(): String {
        return "이름 = $name, 나이 = $age"
    }

}