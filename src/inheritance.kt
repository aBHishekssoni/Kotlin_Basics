// class inheritance
open class Human(
    open val name: String,
    open val age: Int,
    open val gender: String = "M"
) {
    open fun detail() {
        println("I am $name")
        println("I am $age year old")
//        println("I am $gender")
        when (gender) {
            "M" -> println("i am male")

            "F" -> println("i am Female")
        }
    }

}

class Student(
    override val name: String,
    override val age: Int,
    override val gender: String,
    val school: String,
    val klass: String
) : Human(name, age) {
    override fun detail() {
        super.detail()
        println(school)
        println(klass)
    }

}

fun main() {
    val h1 = Human("ravi", 20)
    val s1 = Student("Rani", 18, "F", "Kv", "12th")
    h1.detail()
    println()
    s1.detail()
}