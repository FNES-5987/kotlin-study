package accountManager.kotlin

import java.util.Scanner

class Account()

object AccountManagement {
    val nums = listOf(1, 2, 3, 4)
    val accountList = mutableListOf<Account>()

    fun run() {
        while (true) {
            try {
                val choice = readln().toInt()
                println(choice)

                when(choice) {
                    0 -> {
                        println("프로그램을 종료합니다.")
                        break }
                    1 -> { /* 1번 로직 */ }
                    2 -> { /* 2번 로직 */ }
                    3 -> { /* 3번 로직 */ }
                    4 -> { /* 4번 로직 */ }
                    else -> { println("유효한 번호값 입력")
                        continue
                    }
                }
            } catch (e : NullPointerException) {
                println("숫자를 입력하세요")
                continue
            }
        }
    }
}