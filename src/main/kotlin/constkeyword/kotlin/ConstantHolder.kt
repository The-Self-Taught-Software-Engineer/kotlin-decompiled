package constkeyword.kotlin

object ConstantHolder {
    private const val CONSTANT = 11

    fun combine(value: Int): Int = value + CONSTANT
}
