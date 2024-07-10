open class Animal(
    group:String?=null
) {
    fun eat(){
        println("Animal eat")
    }
    fun sleep(){
        println("Animal sleeps")
    }

}
class Monkey: Animal(group = "mammal"){

}
class Croocodile:Animal(group = "reptile"){

}