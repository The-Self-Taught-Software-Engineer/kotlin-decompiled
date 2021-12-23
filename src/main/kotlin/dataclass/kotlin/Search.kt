package dataclass.kotlin

import java.util.concurrent.atomic.AtomicInteger

// Default data class
data class Search(
    val query: String,
    val hits: AtomicInteger = AtomicInteger(0),
) {
    fun start() {
        println("Search for query $query started")
    }
}
