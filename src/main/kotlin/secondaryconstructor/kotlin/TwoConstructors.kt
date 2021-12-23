package secondaryconstructor.kotlin

class TwoConstructors(private val number: Number) {
    constructor(number: String) : this(number.toLong())

    override fun toString(): String {
        return "TwoConstructors(number=$number)"
    }
}
