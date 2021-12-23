package typecasting.unsafe.kotlin

fun main() {
    val number: Number = 6
    println((number as Int).digitToChar())
}
