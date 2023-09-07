package ch02

fun main() {
    val arr = intArrayOf(1, 2, 3)
    for (num in arr) {
//        println(num)
    }
    // for(let i = 0; i < 5; i++) {}
    // 범위를 이용한 반복문
    for (i in 1 .. 5) {
//        println(i)
    }

    for (i in 1 .. 10 step 2) {
//        println(i)
    }

    // 내림차순
    for (i in 10 downTo 1) {
//        println(i)
    }

    arr.forEach { num -> println(num) }
}