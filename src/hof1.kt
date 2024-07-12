fun main() {
    val data = listOf(2,4,5,3,55,66,65,545,65,25,445,0,664,57)
    println(data.filter {
        it%2!=0
    })
    println(data.map { it*it })
    val oddsqr = data.filter { it%2!=0 }.map { it*it }
    println("result: $oddsqr")

    fun ispositive(num:Int)=num>0
    fun isnegative(num:Int)=num<0
    fun myFilter(check:(num:Int)->Boolean){
        println("my filter called")
    }
    myFilter { isnegative(55) }

}




