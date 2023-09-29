fun main() {
    cal(89, 43) {
        println("Addition completed")
    }
}

fun cal(a: Int, b: Int, callback: () -> Unit) {
    println("Addition is ${a + b}")
    callback()
}