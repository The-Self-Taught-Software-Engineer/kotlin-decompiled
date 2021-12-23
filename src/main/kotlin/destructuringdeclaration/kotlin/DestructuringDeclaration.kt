package destructuringdeclaration.kotlin

import dataclass.kotlin.Search
import java.util.concurrent.atomic.AtomicInteger

fun main() {
    val (query: String, hits: AtomicInteger) = Search("Kotlin", AtomicInteger(100))
    println("Found $hits hits for query '$query'")
}
