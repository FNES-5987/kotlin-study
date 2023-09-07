package ch01

fun main() {
    val name = "John"
    val lastName = "Doe"
    val fullName = name + lastName

    // 템플릿 리너럴
    // JS : `${변수명(함수호출리턴값)}`
    val age = 30;
//    val sentence = "My name is ${name + lastName} and I'm $age years old."
    val sentence2 = "My name is $fullName and I'm $age years old."

    val lowerName = "john"
    // 대소문자 구분없이 문자열 비교
    lowerName.equals(name, ignoreCase = true)
}