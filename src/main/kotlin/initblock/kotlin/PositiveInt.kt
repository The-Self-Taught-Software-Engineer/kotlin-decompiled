package initblock.kotlin

class PositiveInt(private val number: Int) {
    init {
        require(number >= 0) { "$number is not positive" }
    }
}
