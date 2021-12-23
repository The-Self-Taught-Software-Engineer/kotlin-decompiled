package lateinitkeyword.kotlin

class Lateinit {
    private lateinit var number: Number

    fun init(value: Number) {
        number = value
    }

    override fun toString(): String {
        return "Lateinit(number=$number)"
    }
}
