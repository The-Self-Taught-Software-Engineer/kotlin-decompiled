package tailreckeyword.kotlin

fun main() {
    println(fibonacci(1000))
}

tailrec fun fibonacci(n: Long, a: Long = 0L, b: Long = 1L): Long {
    return if (n < 1) a else fibonacci(n - 1, b, a + b)
}
