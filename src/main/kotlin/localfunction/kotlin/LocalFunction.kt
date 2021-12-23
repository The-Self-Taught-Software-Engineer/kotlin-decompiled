package localfunction.kotlin

fun main() {
    println("main")
    fun main2() {
        println("main2")
        fun main3() {
            println("main3")
        }
        main3()
    }
    main2()
}
