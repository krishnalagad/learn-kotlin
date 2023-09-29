fun main() {
    cal(89, 43) {
        println("Addition completed")
    }
    add(12, 23, 30, 45, 98)
}

fun cal(a: Int, b: Int, callback: () -> Unit) {
    println("Addition is ${a + b}")
    callback()
}

fun add(vararg nums: Int) {
    var sum = 0
    for (value in nums) {
        sum += value
    }
    println(sum)
}