fun main() {
    println(factorial(4))
    println(factorialTail(99999))
}

// recursive
fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
    }
}

tailrec fun factorialTail(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        n
    } else {
        factorialTail(n - 1, newResult)
    }
}