package iterateoverrange.kotlin

fun main() {
    // Range
    for (x: Int in 0..100) {
        println(x)
    }

    // Progression
    for (x: Int in 100 downTo 0 step 5) {
        println(x)
    }
}
