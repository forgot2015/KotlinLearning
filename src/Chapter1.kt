/**
 * 功能:
 * 描述:
 * @author Lin Zongfu
 * @date   2019/3/21
 * @email  jouney90@163.com
 */
class Chapter1 {
}

data class Person(val name: String,
                  val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"),
            Person("Bob", age = 29))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is:$oldest")

}



