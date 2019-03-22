/**
 * 功能:
 * 描述:
 * @author Lin Zongfu
 * @date   2019/3/21
 * @email  jouney90@163.com
 */
class Chapter2 {
}

fun max(a: Int, b: Int): Int = if (a > b) a else b
// 返回值类型可省略
//fun max(a: Int, b: Int) = if (a > b) a else b

fun main(args: Array<String>) {
    println("max(2,6) is ${max(2, 6)}")

    val message: String = "Failed"

//    val 变量自身是不可变的，但是它指的对象可能是可变的
    val languages = arrayListOf("Java")
    languages.add("Kotlin")
    println(languages.toString())

    if (args.size > 0) {
        println("Hello,${args[0]}")
    }

    for (i in 1..100) {
        print("${fizzBuzz(i)} ")
    }
    println()
    println()
    for (i in 0 until 100) {
        print("${fizzBuzz(i)} ")
    }
    println()
    println()
    for (i in 100 downTo 1 step 2) {
        print("${fizzBuzz(i)} ")
    }
    println()
    println()

//    判断是否首字母属于该范围
    println("Kotlin" in "Java".."Scala")
//    判断元素是否属于集合
    println("Kotlin" in setOf("Java", "Scala"))

}

class Rectangle(val height: Int, val width: Int) {
    var isSquare: Boolean = false
        //        get() {
//            return height == width
//        }
//        两种写法
        get() = height == width
}

//重构，用 when 代替 if

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}



