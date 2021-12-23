package nullabilityoperator.kotlin

fun main() {
    val letter: Char? = listOf("Kotlin", "Java").getOrNull(1)?.first()
    println(letter)
}
