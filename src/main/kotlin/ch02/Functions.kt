package ch02

// fun 함수명(매개변수) : 반환타입 { ... }
// 클래스, 객체 내부에 있지 않음 함수
fun add(a: Int, b: Int) : Int {
    return a + b
}

// 단일 표현식 함수
// 함수 본체가 1개의 식과 식의 결과가 반환값인 경우
fun addInline(a: Int, b: Int) = a + b

fun printInfo(firstName: String, lastName: String, age: Int) {
    println("$firstName $lastName is $age years old.")
}

// 가변인자(varargs)
fun sum(vararg numbers : Int) : Int {
    // 가변인자는 배열처럼 인식됨
    return numbers.sum()
}

fun greet(name: String = "Guest") {
    println("Hello, $name")
}

// 확장 함수(Extension Function)
// 상속 없이 메서드만 추가해서 사용가능함
fun String.addExclamation() : String {
    return "$this!"
}

fun main() {
    println(add(1, 2))
    println(addInline(1, 2))
    greet()
    println(greet("John"))

    // 명명된 인자(Named Arguments)
    printInfo(age = 10, lastName = "Doe", firstName = "John")
    printInfo("John", "Doe", 10)

    sum(1, 2)
    sum(1, 3, 5, 7, 9)
    sum(2, 4, 6)

    // 문자열의 기본함수만 쓸 수 있는게 아니라, 추가적으로 함수를 등록할 수 있음
    // 외부라이브러리 참조한 클래스의 메서드를 소스코드 안 고치고 추가할 수 있다는 것.
    // HttClient.get(url : String) { ... }
    val str = "Hello"
    println(str.addExclamation())
}