fun main() {
    print("\n\nEnter any number: ")
    val number = readln().toInt()
    println("You entered ${if (number % 2 == 0) "Even" else "Odd"} number.")
}