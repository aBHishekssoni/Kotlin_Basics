fun main() {
    val item= listOf(2,5,1,3,6,7,2)
//    var total=0
//    for (i in item){
//        total+=i
//    }
    var total = item.fold(0){acc,x -> acc + x}
    var mul = item.fold(1){acc,x -> acc * x}
    println("total of $item is $total")
    println("multiplication of $item is $mul")
}