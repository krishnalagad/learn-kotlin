fun main() {
    println(checkLengthOfString("Krishna"))
    println(checkVowelsInString("KrishnaAakanksha"))
    defaultMessage()
}

fun checkVowelsInString(s: String): Any {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var count = 0
    for (char in s){
        if (char in vowels){
            count += 1
        }
    }
    return count
}

fun checkLengthOfString(s: String): Int {
    return s.length
}

fun defaultMessage(msg: String = "Hello") {
    println(msg)
}