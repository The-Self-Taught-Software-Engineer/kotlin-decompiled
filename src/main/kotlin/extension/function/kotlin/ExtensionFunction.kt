package extension.function.kotlin

fun main() {
    println(2.isEven())
    println(2.isOdd())
}

fun Int.isEven(): Boolean = this % 2 == 0

fun Int.isOdd(): Boolean = !isEven()
