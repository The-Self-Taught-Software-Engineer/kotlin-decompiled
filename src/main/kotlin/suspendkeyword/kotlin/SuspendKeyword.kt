package suspendkeyword.kotlin

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.net.URL

fun main() = runBlocking {
    val url = URL("https://kotlinlang.org")
    val website: Deferred<String> = async { request(url) }
    print("$url: ")
    println(website.await())
}

private suspend fun request(url: URL): String {
    println("Requesting...")
    delay(1000)
    return url.readText()
}
