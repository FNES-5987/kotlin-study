package accountManager.kotlin

import ch02.add

class Account(val accNum: String, val balance: Int)

object AccountManagement {
    val nums = listOf(1, 2, 3, 4)
    val accountList = mutableListOf<Account>()
    val accountCount = 0

    fun run() {
        while (true) {

            // UX, 기능목록 출력
            println("\n=== 계좌 관리 프로그램 ===")
            println("1. 계좌 추가")
            println("2. 계좌 목록 조회")
            println("3. 입금")
            println("4. 출금")
            println("0. 종료")
            print("원하는 기능을 선택하세요: ")

            try {
                val choice = readln().toInt()
                println(choice)

                when(choice) {
                    0 -> { /* 종료 */
                        println("프로그램을 종료합니다.")
                        break }
                    1 -> { /* 계좌 개설 */
                        println("추가하실 계좌번호를 입력해주세요.")
                        val readAcc =  readln().toString()
                        val addAcc = Account(readAcc, 0)
                        accountList.add(accountCount, addAcc)
                        println("추가된 계좌번호 : ${ accountList[accountCount].accNum }")
                        accountCount + 1
                        return run()
                    }
                    2 -> { /* 목록 조회 */
                        for (i in 0..accountCount) {
                            println("------------------------------------")
                            println("계좌번호 : ${accountList[i].accNum}")
                            println(" 잔액 : ${accountList[i].balance}")
                            println("------------------------------------")
                        }
                        return run()
                    }
                    3 -> { /* 입금 */
                        println("입금하실 계좌번호를 입력해주세요.")
                        val readAcc =  readln().toString()
                        val findAcc = accountList.find { it.accNum == readAcc }
                        if ( findAcc == null ) {
                            println("입력하신 번호의 계좌가 없습니다.")
                            return run()
                        } else {
                            println("입금하실 금액을 입력해주세요.")
                            println("입금 가능 단위는 10원 입니다.")
                            val readBal = readln().toInt()
                            if (readBal < 1) {
                                println("유효한 금액이 아닙니다.")
                                return run()
                            }
                            if (readBal % 10 != 0) {
                                println("입금은 10원 단위로 가능합니다.")
                                return run()
                            } else {
                                findAcc.balance + readBal
                                println("$readAcc 의 잔액 = ${ findAcc.balance }")
                            }
                        }
                        return run()
                    }
                    4 -> { /* 출금 */ }
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