package ch02

fun main() {
    // if-else
    val a = 10
    val b = 20

    // 코틀린에서는 if-else 는 1개의 식이다.
    val result = if (a > b) {
        a
    } else {
        b
    }
    println(result)

    println(if (a > b) {
        a
    } else {
        b
    })

    // 삼항연산 X
    // if-else 문의 식이 1개이면, 식의 결과가 반환값
    val max = if (a > b) a else b

    println(max)

    // when(switch-case 대신에)
    // break 구문이 필요없음.
    val num = 3
    when (num) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three") // break 문이 없음
        else -> println("Other") // default
    }

    // if-else, when
    // 조건문이 식이 \(expression)
    val description = when (num) {
        1 -> "One"
        2 -> "Two"
        else -> "Other"
    }
}