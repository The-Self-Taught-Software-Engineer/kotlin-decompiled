package stringinterpolation.kotlin

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    val radius = 5.5
    println(
        "A circle with a radius of $radius has a diameter of ${diameter(radius)}, a circumference of ${
            circumference(
                radius
            )
        }, and an area of ${area(radius)}"
    )
}

fun diameter(radius: Double) = 2 * radius

fun circumference(radius: Double) = diameter(radius) * PI

fun area(radius: Double) = PI * radius.pow(2)
