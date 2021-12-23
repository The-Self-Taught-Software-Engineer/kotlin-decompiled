package operatoroverloading.kotlin

data class Velocity(
    val x: Int,
    val y: Int,
) {
    operator fun times(i: Int): Velocity {
        return Velocity(x * i, y * i)
    }
}
