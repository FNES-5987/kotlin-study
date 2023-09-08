package ch07

// 자바의 인터페이스 : 메서드의 설계 -> 맞춰서 구현
// 코틀린의 인터페이스 : 메서드 구조(시그니쳐)/필드명 선언 -> 맞춰서 구현
interface IAnimal {
    val name : String
    fun makeSound()
}

// 인터페이스 구현
// class 구현클래스명: 인터페이스명
class AnimalImpl(override val name: String): IAnimal {
    override fun makeSound() {
        println("make sounds")
    }

}