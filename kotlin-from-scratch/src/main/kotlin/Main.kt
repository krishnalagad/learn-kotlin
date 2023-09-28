class User(val name: String, val age: Int, val mobile: String) {
    fun show() {
        println("$name -> $age -> $mobile")
    }
}


fun main() {
    println("Hello Kotlin")

    val name: String = "Krishna Lagad"
    val email = "krishna@gmail.com"
    var age: Int = 22
    var price: Float = 234.98f
    val longitude: Double = 9834.9876
    val arr: Array<String> = arrayOf("Krishna", "Aakanksha", "Lagad", "Yadav")
    val list: List<String> = listOf("Krishna", "Aakanksha", "Lagad", "Yadav")
    println("My name is $name. My email is $email and my age is $age. Price is $price and Longitude value is $longitude")
    println(list)

    age = 23
    price = 456.9807f
    arr[2] = "Lagad"
    println("My name is $name. My email is $email and my age is $age. Price is $price and Longitude value is $longitude")
    for (i in arr) {
        print("$i ")
    }
    println()
    val user1: User = User("Krishna Lagad", 22, "9856788965")
    user1.show()
}