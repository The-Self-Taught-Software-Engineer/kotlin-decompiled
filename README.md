# Kotlin: Decompiled

(Almost) every single language construct of the Kotlin programming language compiled to JVM bytecode and then decompiled
to Java again for better readability

**Find my explanation of this below in video form**!

## Idea

The point of this repository is to see quickly how Kotlin language features that seem to have no clear equivalent in
Java are compiled to run on the JVM in the end. The Kotlin core developers came up with some interesting ways to
overcome this. Some are more straight forward, some less so. In any case, they used to major methodologies:
Resolve and enforce the language feature at hand in the front-end of the Kotlin compiler or do the conversion to
bytecode solely in the back-end to "emulate" the feature. Of course, for most features, a combination of both is used
although at the same time, most features either rely more on front-end or back-end functionality respectively.

## Language Features

In the following table, you'll find all the analyzed lanuage features:

| Feature                            |
|------------------------------------|
| Companion object                   |
| `const` keyword                    |
| Data class                         |
| Default argument                   |
| Delegation                         |
| Destructuring declaration          |
| Elvis operator (`?:`)              |
| Extension function                 |
| Extension property                 |
| `if` expression                    |
| `infix` keyword                    |
| `init` block                       |
| `in` keyword                       |
| `inline` keyword                   |
| Iterate over range                 |
| Lambda labeling                    |
| `this` labeling                    |
| `lateinit` keyword                 |
| Local function                     |
| Named argument                     |
| Nullability ignore operator (`!!`) |
| Nullability operator (`?.`)        |
| Singleton object                   |
| Value object                       |
| Operator overloading               |
| Read-only collection               |
| `reified` keyword                  |
| Sealed interface                   |
| Secondary `constructor`            |
| String interpolation               |
| `suspend` keyword                  |
| `synchronized` keyword             |
| Top-level function                 |
| `tailrec` keyword                  |
| Try-Catch expression               |
| `typealias` keyword                |
| Safe typecasting                   |
| Unsafe typecasting                 |
| Value class                        |

## Most interesting examples

In a video on my channel, I looked at the most interesting of the above features to discuss how they were achieved in
compiled code:

- Top-level function
- `inline` keyword
- Local function
- Operator overloading
- Named argument
- Iterate over range
- Sealed interface
- `reified` keyword

Over here, you'll find the **[video](https://youtu.be/6pWXre4gDyM)**.
