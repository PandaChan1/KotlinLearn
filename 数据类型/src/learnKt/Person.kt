package learnKt

//open 关键字，表示该类可以被继承
open class Person(val name :String,val age : Int) {
    var pname = name
    var page = age

    fun eat(){
        println(pname + " is eating,his age is " + page)
    }
}

