package defaultargument.kotlin

import dataclass.kotlin.Search

fun main() {
    val query = "Kotlin"
    println(Search(query))
    println(prepareSearch(query))
}

fun prepareSearch(query: String, start: Boolean = false): Search {
    return Search(query).also { if (start) it.start() }
}
