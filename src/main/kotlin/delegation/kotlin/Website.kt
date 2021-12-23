package delegation.kotlin

import java.net.URL

data class Website(
    val url: URL
) {
    constructor(url: String) : this(URL(url))

    val contents: String by lazy { url.readText() }
}
