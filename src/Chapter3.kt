/**
 * 功能:
 * 描述:
 * @author Lin Zongfu
 * @date   2019/3/21
 * @email  jouney90@163.com
 */
class Chapter3 {
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(list)

    println("Kotlin".lastChar())
    val sb = java.lang.StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)

    val numbers = setOf(1,14,2)
    println(numbers.max())
}

/**
 *类的扩展函数，获取字符串的最后一个字符
 */
fun String.lastChar(): Char = this.get(this.length - 1)
//不能重写扩展函数

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }