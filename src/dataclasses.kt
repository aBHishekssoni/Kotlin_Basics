data class Actor(
    val name: String,
    val gender:String="M"
)
//{
//    init {
//        println("Actor created")
//    }
//
//    override fun toString(): String {
//        return "$name is $gender"
//    }
//}
data class Massage(
    val dp:String,
    val name: String,
    val lastmassage:String,
    val time:String,
    val Status:String,
    val isNotification:String

)
fun main() {
    val actor=Actor("tom cruse")
    val actor2= Actor("Priyanka Chopera","F")
    val mess = Massage("Kachra","Kachra seth","150 rupya dega","22:22","vooo","Nothig")
    println(mess)
    println(actor)
    println(actor2)
}