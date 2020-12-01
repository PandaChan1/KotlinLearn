package learnKt

import kotlin.math.max

fun largerNumber(param1: Int, param2: Int): Int {
    return max(param1, param2);
}

//当一个函数只有一行代码的时候可以不必写函数体，直接将唯一的一行代码写在函数尾部
//用  =  连接即可，并且kotlin会自动推到max的返回值
fun largerNum(param1: Int, param2: Int) = max(param1, param2)

//kt中的if和java基本一样，不同之处就是if是有返回值的
//因此可以直接使用函数表达式来
fun largeNum2(param1: Int, param2: Int) = if (param1 > param2) param1 else param2

/**
 * java中的switch只能传入整型或短于整型的变量作为条件，
 * 而kt的when可以传入任意类型参数，并且when有返回值
 */

fun getScore(name: String) = when (name) {
    "Tom" -> 86
    "li" -> 55
    "jack" -> 20
    else -> 0
}
// when 也可以不用传入参数
fun getScore2(name:String) = when{
    name == "Tom" -> 86
    name.startsWith("Tom") -> 88   //表示name由Tom开头的所有人
                                         // name.endsWith()  方法同理
    name == "li" -> 55
    name == "wang" -> 30
    else -> 0
}

//另外kt的when还可以判断参数类型，使用关键字 is
//is 关键字相当于java中的 instanceof
fun checkNumType(param: Number) {
    when(param) {
        is Int -> println("是Int类型")
        is Double -> println("是Double类型")
        else -> println("无法确定类型")
    }
}

/**
 * kt的while和java一样
 *
 * for-in 循环除了遍历区间外还可以用来遍历数组集合等
 */

fun forTest() {
    val range = 0..10;   // .. 是用来创建两端闭区间的关键字[0,10]
    val range1 = 0 until 10  // util  是创建左闭右开区间的关键字[0,10)  一般用于表示数组下标之类
    for (i in 0..10) {     //for循环中会自动++
        println(i)
    }

    for (i in range) {
        println(i)
    }

    for (i in 0 until 10) {
        println(i)
    }

    for (i in 0 until  10 step 2) {  //step关键字，表示步长，类似于i += 2，一次走两步
        println(i)
    }

    /**
     * 注意 .. 和 until 都是创建升序区间，降序区间要使用关键字downTo
     */

    for (i in 10 downTo  0 step 2 ) {
        println(i)
    }
}


fun main() {
    val a = 47
    val b = 36
    val value = largerNumber(a, b)
    println(value)

    val p = Person("jack",20)
    p.eat()
}
