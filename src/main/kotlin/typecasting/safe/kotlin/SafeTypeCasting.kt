package typecasting.safe.kotlin

@Suppress("KotlinConstantConditions", "CAST_NEVER_SUCCEEDS")
fun main() {
    val number: Number = 6
    println((number as? String)?.chars())
}
