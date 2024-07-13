fun main() {
    val fruits = listOf("aapple","banana","cherry")
    println(fruits)
    val movie = mutableListOf("bagbhan","bahubali","boothnath")
    movie.add("bhagambhag")
    println(movie)
    data class  product(
        val title:String,
        val price:Double=00.0,
        val brand:String=""
    )
   val productList= listOf(
       product("phone 1", brand = "Nothing"),
       product("Ideapad 3",47000.00,"lenvo")
   )
    productList.forEach{
        println(it)
        println(it.title)
    }
}