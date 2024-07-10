class circle(
    val radius:Int
) {
    init {
        println("circle object created")
    }

    fun circumferance()= 2*Math.PI*radius
    fun area()=Math.PI*radius*radius
    init {
        println("circle object created")
    }
}

fun main() {
    val r= readln().toInt()
    val c1= circle(r)
    println("Circle with radius ${c1.radius}")
    println("Area will be ${c1.area()}")
    println("circumferance will be  ${c1.circumferance()}")

}