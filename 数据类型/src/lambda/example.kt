package lambda

import kotlin.math.max

fun foo(int :Int) = {print(int)}
val sum = {x:Int,y:Int -> x + y}

fun main() {
    sum(2,3)
    foo(2).invoke()
}