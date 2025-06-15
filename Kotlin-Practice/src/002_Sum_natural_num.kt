fun main() {
    print("Enter how many number you want to sum for natural number: ")
    val total = readln().toInt()
    var sum = 0
    for (i in 1..total) {
        sum += i
    }

    //OR using formula
    val sumUsingFormula = (total * (total + 1)) / 2

    println("Sum of $total natural number is $sum")
    println("Sum of $total natural number is $sumUsingFormula")
}