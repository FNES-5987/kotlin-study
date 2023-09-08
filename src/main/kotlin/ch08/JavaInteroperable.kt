package ch08

// 상호운영성(Interoperable)
fun main() {
    val person = Person("John")
    println(person.name)
    person.name = "Jane"

    person.printInfo()
}