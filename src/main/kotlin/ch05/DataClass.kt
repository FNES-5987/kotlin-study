package ch05

// 메서드 없이 필드값만 사용하는 클래스
// val p = Person("Alice", 30)
// println(p) // Person@ah9393h
// 롬복 @Data -> toString() -> Person(name="Alice", age=30)


// data class
// toString(필드출력), copy(필드카피), equals(필드레벨비교), hashcode
// componentN() (필드의 순서)
// 함수를 생성해줌
// 데이터이기 떄문에 참조가 기준이 아닌, 필드값으로 처리되는 함수를 만들어줌
data class Person(val name: String, val age: Int)

fun main() {
    // 객체 생성
    val person1 = Person("Alice", 30)
    val person2 = Person("John", 40)
    val person3 = Person("Alice", 30)

    // toString 구현
    println(person1)

    // 필드 값 수준의 동등비교
    println(person1 == person2)
    println(person1 == person3)

    // js
    // const arr = [1, 2]
    // const [first, second]
    // console.log(first)
    val (name, age) = person1
    println(name)
    println(age)

    // copy
    val person4 = person1.copy(age = 35)
    println(person4)
}