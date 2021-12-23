# Kotlin: Decompiled

(Almost) every single language construct of the Kotlin programming language compiled to JVM bytecode and then decompiled
to Java again for better readability

## Idea

The point of this repository is to see quickly how Kotlin language features that seem to have no clear equivalent in
Java are compiled to run on the JVM in the end. The Kotlin core developers came up with some interesting ways to
overcome this. Some are more straight forward, some less so. In any case, they used to major methodologies:
Resolve and enforce the language feature at hand in the front-end of the Kotlin compiler or do the conversion to
bytecode solely in the back-end to "emulate" the feature. Of course, for most features, a combination of both is used
although at the same time, most features either rely more on front-end or back-end functionality respectively.

## Most interesting examples

TBD

## Explanation

N/A
