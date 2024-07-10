fun main() {
    val movies = listOf("suryavansi","gadar","avanger")
    for (name in movies){
        println("I love $name")

    }
    for (idx in movies.indices){
        println("$idx is ${movies[idx]}")

    }
    for (i in 1..10){
        println("$i 👌🤑")
    }
    val num =2542455
    var temp = num
    var total=0
    while (temp>0){
        println("$temp => $total")
        total+= temp%10
        temp/=10
    }
    println(total)

    var aboutme=""
    do{
        val line = readln()
        aboutme+=line+"\n"
    }while (line.isNotBlank())
    println("About me \n $aboutme")

    val x=20
for (x in 20 downTo 0 step 2)
println(x)
}
