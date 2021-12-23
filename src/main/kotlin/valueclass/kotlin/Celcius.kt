package valueclass.kotlin

@JvmInline
value class Celcius(
    val value: Double
) {
    init {
        require(value >= -273.15) { "$value is not a possible Celcius temperature" }
    }
}
