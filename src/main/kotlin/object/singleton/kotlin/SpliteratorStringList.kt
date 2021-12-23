package `object`.singleton.kotlin

import java.util.*

@Suppress("unused")
object SpliteratorStringList : AbstractCollection<String>() {
    private val backing: MutableList<String> = mutableListOf()

    override val size: Int get() = backing.count()

    override fun iterator(): MutableIterator<String> = backing.listIterator()

    fun spliterator(): Spliterator<String> = backing.spliterator()
}
