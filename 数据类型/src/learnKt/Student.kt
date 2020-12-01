package learnKt

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper

//kt中默认所有的类都是不可继承的，要想该类可以被继承，需要加上open关键字
//: 表示继承关系
/**
 * (val sn : Int,val grade : String , name: String, age: Int) 是Student的主构造函数,也可以不写，默认无参
 * 当继承了一个类，那么子类在构造时必须先构造父类
 * 而Person(name,age) 是父类的主构造函数，且Person有两个参数，因此Student中需要额外传入两个参数
 *
 * 注意：额外传入的两个参数不能声明为val，因为主构造函数中声明为var或val的参数会自动变成该类的字段，
 * 而我们这两个额外的参数是传给父类的
 */
class Student(val sn : Int,val grade : String , name: String, age: Int) : Person(name, age) {

}