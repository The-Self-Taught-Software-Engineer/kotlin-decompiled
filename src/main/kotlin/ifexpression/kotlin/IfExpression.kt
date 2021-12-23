package ifexpression.kotlin

import java.util.*

@Suppress("ConvertTwoComparisonsToRangeCheck")
fun main() {
    val number: Int = Random().nextInt(10)
    val log: String = if (number < 3 && number > 1) {
        "A"
    } else if (number > 8) {
        "B"
    } else if (number == 1) {
        "C"
    } else {
        "D"
    }
    println(log)
}
