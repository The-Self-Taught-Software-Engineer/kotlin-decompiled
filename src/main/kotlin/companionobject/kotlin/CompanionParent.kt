package companionobject.kotlin

@Suppress("MayBeConstant")
class CompanionParent(value: Int) {
    private val number: Int = combine(value)

    override fun toString(): String {
        return "CompanionParent(number=$number)"
    }

    companion object {
        private val CONSTANT = 11

        private fun combine(value: Int): Int = value + CONSTANT
    }
}
