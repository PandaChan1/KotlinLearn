/**
 * ===比较对象是否相等，==比较值是否相等
 */
fun main(args : Array<String>) {
    val a : Int = 1000
    print(a === a)
    val boxeda : Int? = a
    val anotherboxed : Int ? = a

    println(boxeda == anotherboxed)  //值相等
    println(boxeda === anotherboxed) //对象不相等

}
/*
类型转换，kotlin中较小的类型并不是较大类型的子类，较小的类型不能隐式转换为较大的类型
kotlin提供的类型转换方法：
toByte()
toInt()
toShort()
toLong()
toFloat()
toDouble()
toChar()
 */
fun change(){
    val b : Byte = 1
//    val a : Int = b  //报错
    //类型转换可以使用其它方法
    val a : Int = b.toInt()  //可以

}

/*
位操作符,kotlin中的位运算符只对Int和Long起作用
shl(bits)   --->  <<  左移
shr(bits)   --->  >>  右移
ushr(bits)  --->  >>> 无符号右移
and(bits)   --->   &  与
or(bits)    --->   |  或
xor(bits)   --->   ^  异或
inv(bits)       --->  反向  无参数
*/

