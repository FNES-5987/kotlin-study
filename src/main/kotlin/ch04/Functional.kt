package ch04

import jdk.dynalink.Operation

// 교차 함수(Higher-Other Function)
// 다른 함수를 매개변수로 받거나 함수를 반환하는 함수
// function1 -> function2 -> function1 + function2
fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    // 매개변수 2개를 받고, 반환하는 함수 타입을 선언
    // 변수: 함수타입 = {함수식}
    // {매개변수 -> 식(식의결과가 반환값)

    // 람다함수(lambda function)
    // : 매개변수오 ㅏ1개의 식으로 구성이 되어있고, 식의 결과가 반환값인 함수
    // : 수학적으로 함수와 일치하는 개념
    val sum: (Int, Int) -> Int = {a , b -> a + b}

    val sum2 = applyOperation(3, 4) {a, b -> a + b}
    val mul = applyOperation(3, 4) {a, b -> a * b}
    println(sum2)
    println(mul)
}