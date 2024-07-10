fun main() {
    var num= readln().toInt()
    if(num%2==0) {
        println("even")
    }else{
        println("odd")
    }
    //if elseladder
    print("Enter another number")
    num = readln().toInt()
    if (num>0)
        println("positive")
    else if (num<0) println("negative")
    else println("zero")

    //When
    println("Who is the father os botony?")
    println("A: theophrastus")
    println("B: asterol")
    println("C:Darwin")
    println("D: linnaeus")
    println("select an option:")
    val ans = readln()
    when(ans){
        "A"-> println("correct")
        "B"-> println("Wrong")
        "C"-> println("Wrong")
        "D"-> println("Wrong")
        else-> println("invalid option")
    }
    val age = readln().toInt()
    when{
        age <0 -> println("invalid age")
        age <18 -> println("minor age")
        age in 18..60 -> println("audelt age")
        else-> println("sinior age")

    }
    val a= readln().toInt()
    val b= readln().toInt()
    val c= readln().toInt()
    if ((a>b)and(a>c))
        println("a is grater")
    else if ((c>b)&&(c>a))
        println("c is grater")
    else println("b is grater")
}