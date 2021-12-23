package namedarguments.kotlin

import dataclass.kotlin.Search

fun main() {
    prepareSearch(start = true, query = "Kotlin")
}

fun prepareSearch(query: String, start: Boolean = false): Search {
    return Search(query).also { if (start) it.start() }
}
