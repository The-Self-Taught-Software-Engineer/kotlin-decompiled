package extension.property.kotlin

fun main() {
    println(2.isEven)
    println(2.isOdd)
}

val Int.isEven: Boolean get() = this % 2 == 0

val Int.isOdd: Boolean get() = !isEven
