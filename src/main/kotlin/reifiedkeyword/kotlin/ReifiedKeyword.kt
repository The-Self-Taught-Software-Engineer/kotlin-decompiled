package reifiedkeyword.kotlin

import kotlin.reflect.KType

fun main(args: Array<String>) {
    println(args.superTypes())
}

inline fun <reified T> T.superTypes(): List<KType> {
    return T::class.supertypes
}
