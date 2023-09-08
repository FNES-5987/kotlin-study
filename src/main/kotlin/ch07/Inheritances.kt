package ch07

open class Animal(val name: String) {
    open fun sound() {
        println("$name makes a sound")
    }
}

// class 자식클래스 : 부모클래스생성자 호출구문
class Dog(name: String) : Animal(name) {
    override fun sound() {
        println("$name barks")
    }
}

fun main() {
    val myAnimal = Animal("Cat")
    myAnimal.sound()

    val myDog = Dog("My Dog")
    myDog.sound()
}