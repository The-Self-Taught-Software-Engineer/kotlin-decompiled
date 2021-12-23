package elvisoperator.kotlin

fun main(args: Array<String>) {
    println(args.first().toIntOrNull() ?: error("Invalid input"))
}
