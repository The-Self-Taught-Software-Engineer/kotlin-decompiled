package labeling.kotlin

fun main() {
    val numbers: List<Number> = listOf(1, 2, 3).flatMap { number ->
        listOf(number, 0).filter { innerNumber ->
            if (innerNumber == 0) return@flatMap listOf(number)
            return@filter false
        }
    }
    println(numbers)
}
