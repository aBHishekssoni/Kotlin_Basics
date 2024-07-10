//interfaces
interface Vehical{
    fun start()
    fun stop()

}
class car:Vehical{
    override fun start() {
        println("Car is started")

    }

    override fun stop() {
//
        println("Car stopped")
    }

}
class truck : Vehical{
    override fun start() {

        println("Truck is start")
    }

    override fun stop() {
//        TODO("Not yet implemented")
        println("truck stopped")
    }

}
    abstract class Smartphone{
        open fun picture(){
            println("take a picture")
        }
        fun takecall(){
            println("take a call")
        }
    }
class Iphone:Smartphone(){
    override fun picture(){
        println("function taking picture to Iphone")
    }
}

fun main() {
    val p1= Iphone()
    val c1=car()
    val t1= truck()
    c1.start()
    c1.stop()
    t1.start()
    t1.stop()
    p1.picture()

}