package `object`.value.kotlin

import java.util.*

fun main() {
    val occurrenceCollection = object : AbstractCollection<String>() {
        private val backing: MutableList<String> = mutableListOf()

        override val size: Int get() = backing.count()

        override fun iterator(): MutableIterator<String> = backing.listIterator()

        fun spliterator(): Spliterator<String> {
            return this.backing.spliterator()
        }
    }.apply {
        add("Kotlin")
        add("Java")
        add("Scala")
        add("Clojure")
    }
    println(occurrenceCollection.spliterator())
}
