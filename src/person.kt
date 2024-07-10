class person(
    val name:String,
    val age :Int,
    val hight:Int,
    val weigth:Int,
    val country :String,
    val hair_color :String= "Black",
    val gender :String = "Male" ,

    var language :String="Hindi"){
    fun show(){
        println("$name is $age old")
        println("hight and weight is $hight and $weigth")
        println("Live in $country my hair color is $hair_color \n and I know $language language ")
    }
}
fun main() {
    val  p1=person("Ajay",23,45,55,"India")

    val p2=person("Arti",20,44,50,"India")
    p1.show()
    p2.show()
}