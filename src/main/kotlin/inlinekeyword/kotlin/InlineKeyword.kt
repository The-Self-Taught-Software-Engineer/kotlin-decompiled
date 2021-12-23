package inlinekeyword.kotlin

import java.util.*
import kotlin.math.PI

fun main() {
    val radius = 5.5
    println("A circle with radius $radius has a circumference of ${circumference(radius)}")
}

val properties = Properties()

fun circumference(radius: Double): Double {
    return (2 * PI * radius).also { c ->
        properties.apply {
            set("previousToLast", get("last"))
            set("last", c)
        }
    }
}
