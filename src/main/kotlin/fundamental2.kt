fun main() {
    //funciton :
    val hasil = setUser("Budi", 21)
    println(hasil)
    println()

    //If Expression
    val timeOpen = 8
    val timeClose = 12
    val timeNow = 7

    val classStatus = if (timeNow >= timeClose) {
        "Class already closed"
    } else if (timeNow >= timeOpen) {
        "Class is Open"
    } else {
        "Class is not Open yet"
    }

    // If Statement
    val condition = true
    if (condition) {
        println("code block to be executed if condition is true")
    } else {
        println("code block to be executed if condition false")
    }

    println(classStatus)

    // safe call
    var dateOut : String? = null
    var status = "booked"
    status = "checkout"
    if (status.equals("checkout")){
        dateOut = "28/10/2022 12:05:00"
    }

    println(dateOut)

    // String Template
    val company = "ifinite learning"
    print("we are studying in $company")
    println("   ")
    val score = 80
    print("Result: ${if (score >= 80) "you win" else "please try again!"}")
}

fun setUser(name: String, age: Int): String {
    return ("Nama kamu adalah $name, dan umur kamu $age tahun.")
}
