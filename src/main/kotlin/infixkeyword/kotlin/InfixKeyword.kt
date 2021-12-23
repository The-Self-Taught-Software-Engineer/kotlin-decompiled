package infixkeyword.kotlin

import java.util.*

fun main() {
    val upperBound = 10
    println(Random().nextInt(upperBound * 2) in 0 until upperBound)
}
