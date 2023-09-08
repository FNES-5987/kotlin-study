package ch06

fun main() {
    // mapOf(키 to 값 ...)
    // 초기값 설정
    val person = mapOf("name" to "Alice", "age" to 30)
    // 초기값 미설정
    val person2 = mutableMapOf<String, Any>()
    person2["name"] = "Alice"
    person2["age"] = 30

    for (key in person2.keys) {
        println(person2[key])
    }

    val num = person2["age"].toString().toInt() + 1
    println(num)

    val people = mutableListOf<MutableMap<String, Any>>()
    people.add(mutableMapOf("name" to "Alice", "age" to 30))
    people.add(mutableMapOf("name" to "Bob", "age" to 35))
}