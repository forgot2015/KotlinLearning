/**
 * 功能:
 * 描述:
 * @author Lin Zongfu
 * @date   2019/3/21
 * @email  jouney90@163.com
 */
class Chapter4 {
}

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
    Button().click()
}

interface Clickable {
    fun click()
}

class Button : Clickable {
    override fun click() {
        println("I was clicked")
    }
}

//Java 的类和方法默认是open的，而Kotlin中默认都是final的，如果你想允许创建一个类的子类，需要使用open来修饰这个类，
//此外，需要给每一个可以被重写的属性或方法添加open修饰符
open class RichButton : Clickable {
    fun disable() {}
    open fun animate() {
    }

    override fun click() {
    }
}

class SonRichButton : RichButton() {
//    没有open修饰的方法无法重写
//    override fun disable() {}

    override fun animate() {
        super.animate()
    }

    //    接口方法默认是open
    override fun click() {
        super.click()
    }
}