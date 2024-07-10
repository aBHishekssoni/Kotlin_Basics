// best eg in view model
sealed class Error(val message:String){
    class NetworkError: Error("Network Failer")
    class DatabaseError: Error("Database Failer")
    class UnkonwnError: Error("Unknown Error Failer")

}

fun main() {
    val ne = Error.NetworkError()
    val ue = Error.UnkonwnError()
    println(ne.message)
    println(ue.message)
}