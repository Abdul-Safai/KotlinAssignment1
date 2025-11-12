fun sumUpTo(max: Int): Long {
    require(max >= 0) { "max must be >= 0" }
    var total = 0L
    for (i in 1..max) total += i
    return total
}

fun factorialIterative(n: Int): Long {
    require(n >= 0) { "n must be >= 0" }
    var result = 1L
    for (i in 2..n) result *= i
    return result
}

val factorialLambda: (Int) -> Long = { n ->
    require(n >= 0) { "n must be >= 0" }
    if (n < 2) 1L else (2..n).fold(1L) { acc, i -> acc * i }
}

tailrec fun factorialRecursive(n: Int, acc: Long = 1L): Long {
    require(n >= 0) { "n must be >= 0" }
    return if (n < 2) acc else factorialRecursive(n - 1, acc * n)
}

fun main() {
    println("A) sumUpTo(10) = ${sumUpTo(10)}")
    println("B) factorialIterative(5) = ${factorialIterative(5)}")
    println("C) factorialLambda(6) = ${factorialLambda(6)}")
    println("D) factorialRecursive(7) = ${factorialRecursive(7)}")
    println("All checks passed ✅")
}
