package synchronizedkeyword.kotlin

import kotlin.math.PI

fun main() {
    val radius = 5.5
    println("A circle with radius $radius has a circumference of ${circumference(radius)}")
}

var mutableState: Double = 0.0

@Synchronized
fun circumference(radius: Double): Double {
    val circumference: Double = 2 * PI * radius
    mutableState = circumference
    return circumference
}
