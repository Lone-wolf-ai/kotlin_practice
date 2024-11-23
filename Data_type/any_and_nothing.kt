fun main() {
    val anyValue: Any = "This can be anything"
    println(anyValue)
    try {
        fail("hello")
    } catch (e: IllegalArgumentException) {
        println("Caught an exception: ${e.message}")
    }
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}
