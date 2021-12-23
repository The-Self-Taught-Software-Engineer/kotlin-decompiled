package sealedinterface.kotlin

import java.util.*

fun main() {
    val log: String = when (getRandom()) {
        is A -> "A"
        is B -> "B"
        is C -> "C"
    }
    println(log)
}

private fun getRandom(): Sealed = listOf(A, B, C)[Random().nextInt(3)]
