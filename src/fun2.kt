import kotlin.math.pow

fun power(num:Int, exp:Int=2)=num.toDouble().pow(exp)
fun summer(a:Int,b:Int,c:Int)= a+b+c
fun main(){
    val ans= summer(5,5,9)
    println(ans)
    println(power(20))
}