fun main() {
    println("Enter marks:")
    val marks: Int = readln().toInt()
    val degree: String = if (marks in 91..100) {
        "First class distinction with honours"
    } else if (marks in 81..90){
        "First class distinction"
    } else if (marks in 71..80){
        "First class"
    } else {
        "Second class"
    }

    println("Degree is $degree")

    val grade: Char = when(marks) {
        in 91..100 -> 'A'
        in 81..90 -> 'B'
        in 71..80 -> 'C'
        else -> 'D'
    }
    println("Grade is $grade")
}