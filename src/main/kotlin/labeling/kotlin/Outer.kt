package labeling.kotlin

// Taken from: https://kotlinlang.org/docs/this-expressions.html#qualified-this
class Outer { // implicit label @A
    inner class Inner { // implicit label @B
        fun Int.foo() { // implicit label @foo
            val outer = this@Outer // A's this
            val inner = this@Inner // B's this

            val c = this // foo()'s receiver, an Int
            val c1 = this@foo // foo()'s receiver, an Int

            val funLit = lambda@ fun String.() {
                val d = this // funLit's receiver
            }

            val funLit2 = { s: String ->
                // foo()'s receiver, since enclosing lambda expression
                // doesn't have any receiver
                val d1 = this
            }
        }
    }
}
