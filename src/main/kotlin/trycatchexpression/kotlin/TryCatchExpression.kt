package trycatchexpression.kotlin

import java.util.*

fun main() {
    val number: Number = try {
        100 / Random().nextInt(3)
    } catch (exception: ArithmeticException) {
        0
    }
    println(number)
}
