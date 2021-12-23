package lambdaexpression.kotlin

import java.util.*

fun main() {
    val number: Int = Random().nextInt()
    val closure: (Int) -> Int = { other: Int -> number.compareTo(other) }
    println("$number: " + closure(1000))
}
