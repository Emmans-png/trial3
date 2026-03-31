package com.emobilis.easter

// Student profile variables (camelCase consistent)
var studentName = "Alex Morgan"
val studentId = 2024001
var gpa = 3.75
val isEnrolled = true
var middleInitial = 'J'

fun displayMenu() {
    println("1. View Profile")
    println("2. Edit Settings")
    println("3. Logout")
}

fun calculateDiscount(price: Double, discountPercent: Double): Double {
    return price * (1 - discountPercent / 100)
}

fun getGrade(score: Int): String {
    return when {
        score >= 80 -> "A"
        score >= 65 -> "B"
        score >= 50 -> "C"
        score >= 35 -> "D"
        else -> "F"
    }
}

fun isEven(number: Int): Boolean = number % 2 == 0

fun printEvenOdd(numbers: List<Int>) {
    for (num in numbers) {
        if (isEven(num)) {
            println("$num is even")
        } else {
            println("$num is odd")
        }
    }
}

val students = listOf(
    Pair("Alice", 85),
    Pair("Bob", 42),
    Pair("Charlie", 67),
    Pair("Diana", 91),
    Pair("Ethan", 38)
)

fun displayAllStudents() {
    for ((name, score) in students) {
        println("$name: $score")
    }
}

fun getAverageScore(): Double {
    var total = 0
    for ((_, score) in students) {
        total += score
    }
    return total.toDouble() / students.size
}

fun findTopStudent(): String {
    var topName = "No students"
    var maxScore = -1
    for ((name, score) in students) {
        if (score > maxScore) {
            maxScore = score
            topName = name
        }
    }
    return topName
}

fun classifyStudents() {
    println("Student classifications:")
    for ((name, score) in students) {
        val grade = getGrade(score)
        println("Name: $name, Score: $score, Grade: $grade")
    }
}

fun main() {
    println("=== Fixed Assignment.kt - Student Demo ===\n")

    // Student list demos
    displayAllStudents()
    println("\nAverage score: %.2f".format(getAverageScore()))
    println("Top student: ${findTopStudent()}")
    println()
    classifyStudents()

    // Profile
    println("==========================")
    println("Student: $studentName $middleInitial. ($studentId) has GPA %.2f, Enrolled: $isEnrolled".format(gpa))
    val phoneNumber: String? = null
    println("Phone: $phoneNumber")

    // Menu
    println("=========================")
    displayMenu()

    // Discount and grade
    val discount = calculateDiscount(323.23, 12.33)
    println("Discounted price: %.2f".format(discount))
    println("Grade for 75: ${getGrade(75)}")

    // Even/Odd check
    println("\nEven/Odd check:")
    val numbers = listOf(12, 15, 30, 50, 47, 578, 6734, 24, 500)
    printEvenOdd(numbers)

    // Temperature
    println("\nTemperature check (20°C):")
    val temperature = 20
    when {
        temperature > 30 -> println("Hot day")
        temperature > 20 -> println("Perfect weather")
        else -> println("Cool day")
    }
    println("Temperature: $temperature°C")

    // Day of week
    println("\nDay of week:")
    val dayOfWeek = "thursday"
    val lowerDay = dayOfWeek.toLowerCase()
    when (lowerDay) {
        "saturday", "sunday" -> println("Weekend! Time to relax")
        "monday" -> println("Back to work")
        "friday" -> println("Beginning of weekend")
        else -> println("Regular weekday")
    }

    // Traffic light
    println("\nTraffic light:")
    val trafficLight = "Yellow"
    val trafficAction = when (trafficLight) {
        "Red" -> "Stop!"
        "Yellow" -> "Caution"
        "Green" -> "Go"
        else -> "Invalid"
    }
    println(trafficAction)

    // Countdown loop
    println("\nCountdown:")
    var count = 5
    do {
        println(count)
        count--
    } while (count >= 1)
    println("Blast off!")

    // Shopping list
    println("\nShopping list:")
    val shoppingList = listOf("Milk", "Eggs", "Bread", "Butter", "Coffee")
    for ((index, item) in shoppingList.withIndex()) {
        println("[${index + 1}]. $item")
    }

    // Ranges examples
    println("\n1 to 5:")
    for (i in 1..5) println(i)

    println("\n1 until 5:")
    for (i in 1 until 5) println(i)

    println("\nEven 2 to 10:")
    for (i in 2..10 step 2) println(i)

    println("\nA to E:")
    for (ch in 'A'..'E') println(ch)

    // Statement vs Expression
    println("\nStatement vs Expression:")
    val age = 13
    val status = if (age >= 18) "Adult" else "Minor"
    println("User $age is $status")

    val x = 10
    val y = 25
    val maxNumber = if (x > y) x else y
    println("Max of $x and $y is $maxNumber")

    println("\n=== Demo complete ===")
}

