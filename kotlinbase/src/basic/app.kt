package basic


fun main() {
    println("1+3")
    sum(1,3)
    println("2+2")
    sum1(2,2)
    println("3+3")
    sum2(3,3)
    println("6+6")
    printsum(6,6)
    println("10+10")
    printsum1(10,10)
    //字符串模板
    stringEX(6)
    //条件表达式
    println("0和42的最大值是${maxof(0,42)}")
    println("0和42的最大值是${maxof1(0,42)}")
    //空值和null检测
    printProduct("a","7")
    printProduct("6","7")
    //类型检测与自动类型转换
    printLength("pandachan")
    printLength(744631199)
    printLength(listOf(Any()))
    //for循环
    forEx()
    //when表达式
    println("when表达式")
    println(whenEx(1))
    //使用区间
    rangeEx()
    //lambda表达式过滤,映射
    lambdaEx()
    var a:Int = 0;
    var b:Int = 2
    a = b.also { b = a };
}
fun sum(x:Int,y:Int):Int{
    return x+y
}
//表达式作为函数体，返回类型自动判断
fun sum1(x:Int,y:Int) = x+y
//public方法必须明确给出返回类型
public fun sum2(i:Int,j:Int):Int=i+j

//无返回值的函数，类似于java的void
//void等同于Unit
fun printsum(a:Int,b:Int):Unit{
    println(a+b)
}

//如果返回类型是Unit类型，则可以省略（public方法同理）
public fun printsum1(a:Int,b:Int){
    println(a+b)
}

fun stringEX(a:Int){
    //定义只读局部变量 val
    //可重新赋值的变量使用 var关键字
    /*
    var s:Int=2 //立即赋值
    var s=6 //自动推断出 Int 类型
    val c:Int //没有明确初始值类型不能省略
    c=3 //明确赋值
    */
    var i=a;
    val s1="i is $i"

    i=2
    val s2="${s1.replace("is","was")},but now is $i"
            println(s2)
}

//条件表达式
fun maxof(a:Int,b:Int):Int{
    if (a>b){
        return a
    }else{
        return b
    }
}
//if也可做表达式
fun maxof1(a:Int,b:Int)=if (a>b)a else b

//空值与null检测
fun parseInt(str:String):Int ?{
    return str.toIntOrNull()
}
fun printProduct(str1:String,str2:String){
    val x= parseInt(str1)
    val y= parseInt(str2)
    if (x!=null&&y!=null){
        println(x*y)
    }else{
        println("'$str1' or '$str2' is not a number")
    }
}
//类型检测与自动类型转换
/**
 * is运算符检测一个表达式是否某类型的一个实例。
 * 如果一个不可变的局部变量或者属性已经判断出为某类型，
 * 那么检测后的分支中可以直接当作该类型使用，无需显式转换
 */
fun getStringLength(obj:Any):Int?{
    if (obj is String){
        //obj 在该条件分支中自动转换成 String
        return obj.length
    }
    return null
}

/**
 * ?: 复合符号
 * 例： foo ？：bar
 * foo！=null  返回foo
 * foo==null  返回bar
 * --------------------------
 * 其他的复合符号例如： ？ ？. !! !!.
 *   ?    声明变量可空，即可赋null
 *   !!   当前对象为空时执行
 *
 *   "?"加在变量名后，系统在任何情况不会报它的空指针异常。
 *   "!!"加在变量名后，如果对象为null，那么系统一定会报异常。
 *-----------------------------------------------------
 *   ?.   当？.左边不为空时，调用.后面的方法；为空时返回null
 *   例：var str:String? =null
 *   直接调用 str.length 肯定报错
 *   传统方法需要  if 判空
 *   而使用  str?.length  可以更简单
 *   !!.  与 ?. 类似 !!.在左边为空时直接报 NPE错误；不为空时调用  .  后的方法
 */
fun printLength(obj:Any){
    println("'$obj' string length is ${getStringLength(obj) ?:"...err,not a string"}")
}


//-------------------------------------------------------------

//for循环
fun forEx(){
    val items= listOf("banana","apple","charry","peach")
    println("直接访问元素")
    for (item in items){
        print(item+",")
    }
    println()
    println("下标访问")
    for (index in items.indices){
        println("index at $index is ${items[index]}")
    }
    //while循环
    println()
    println("while循环")
    var index=0
    while (index<items.size){
        println("index at $index is ${items[index]}")
        index++
    }

}

//-----------------------------------------------------

//when表达式，类似于java的switch
fun whenEx(obj:Any):String=
    when(obj){
        1 -> "one"
        "hello" -> "String"
        is Long -> "Long"
        !is Long -> "not is Long"
        else -> "unknown"
    }

//--------------------------------------------------
//使用区间range
fun rangeEx(){
    val items= listOf("a","b","c","h","k")
    for (item in items){
        print(item+" ,")
    }
//检测数字是否在指定区间
    val x=10
    val y=9
    println()
    if (x in 1..y+1){
        println("fits in range")
    }
    //检测数字书否在区间外
    if (-1 !in 0..items.lastIndex){
        println("-1 is out of range")
    }
    if (items.size !in items.indices){
        println("list size is out of list indices,too")
    }
    //区间迭代
    println("区间迭代")
    for (i in 1..5){
        println(i)
    }
    println("数列迭代")
    //数列迭代
    for (i in 1..10 step 2){
            print(i)
    }
    println()
    for (i in 9 downTo 0 step 3){
        println(i)
    }

}
//使用lambda表达式过滤（filter）和映射（map）集合
fun lambdaEx(){
    var fruits= listOf("apple","pear","peach","charry","av0cado")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}



