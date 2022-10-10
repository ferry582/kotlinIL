fun main() {
    // erry dwianta p
    // kotlin control flow
    // when expression :
    val day = 1

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Day"
    }

    println(result)
    println()

    when (day) {
        1,2,3,4,5 -> println("Weekday")
        else -> println("Weekend")
    }
    println()

    when (day) {
        1 -> {
            println("First day of the week")
            println("Monday")
        }
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid Day")
    }
    println()

    //range :
    val rangeInt = 1..10 step 2
    println("Step : ${rangeInt.step}")
    println(rangeInt.toList())
    println()

    var i = 4
    if (i in 1.rangeTo(10)) {
        println("Value 4 avaiable in range")
    }

    if (i !in 10.downTo(1)) {
        println("Value 4 is not avaiable in range")
    }
    println()


    //for loop
    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    for (day in days){
        println(day)
    }
    println()

    for ((index, day) in days.withIndex()){
        println("value $day with index $index")
    }
    println()

    days.forEach {
        println("day is $it")
    }
    println()

    days.forEachIndexed { index, s ->
        println("value $s with index $index")
    }
    println()

    //while loop
    var j = 0
    while (j<10){
        println("Loop to : $j")
        j++
    }
    println()

    //break :
    var z = 0
    while (true){
        println("break $z")
        z++
        if (z > 500){
            break
        }
    }
    println()

    //continue
    println("Print odd numbers")
    for (i in 1..20){
        if (i % 2 == 0) {
            continue
        }
        println("$i is an odd number")
    }
}