package readonlycollection.kotlin

fun main() {
    val readOnlyList: List<Int> = setOf(1, 2, 3, 4, 5).toList()
    println(readOnlyList)
    (readOnlyList as MutableList<Int>).add(6)
    println(readOnlyList)
}
