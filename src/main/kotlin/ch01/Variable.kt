package ch01

fun main() {
    // 코틀린 변수 : 불변번수/가변변수 (자바로 치면 const/let)

    // 가변변수(variable)
    var mutableVar = 10 // 변수선인 및 대입, 타입추론(type inference)
    // 타입추론 : 변수의 대입 값에 따라 타입이 지정됨.
//    mutableVar = "abc" // X

    // 불변변수(value)
    val immutableVal = 20

    // ------------------------------------------------------------

    // 코틀린에서는 var/val 변수명 : 타입
    // null 이 가능한 타입과 null 이 불가능한 타입 분리
    // 자바 : int 기본값 0, int 기본이 null

//    var str : String = null // 기본적으로 모든 타입은 null 이 불가능

    // null 이 불가능하기 때문에 null 체크가 필요없음.
    var str2 : String = ""

    var nullableStr : String? = null // null 을 사용하려면 타입 뒤에 ? 를 붙임
}