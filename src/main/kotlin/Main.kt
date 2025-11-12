fun sumUpTo(max: Int): Long {
    require(max >= 0) { "max must be >= 0" }
    var total = 0L
    for (i in 1..max) total += i
    return total
}

fun factorialIterative(n: Int): Long {
    require(n >= 0) { "n must be >= 0" }
    var res = 1L
    for (i in 2..n) res *= i
    return res
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
    println("A) sumUpTo(10) = ${sumUpTo(10)}")                 // 55
    println("B) factorialIterative(5) = ${factorialIterative(5)}") // 120
    println("C) factorialLambda(6) = ${factorialLambda(6)}")       // 720
    println("D) factorialRecursive(7) = ${factorialRecursive(7)}") // 5040

    check(sumUpTo(0) == 0L); check(sumUpTo(5) == 15L)
    check(factorialIterative(0) == 1L); check(factorialIterative(5) == 120L)
    check(factorialLambda(0) == 1L); check(factorialLambda(6) == 720L)
    check(factorialRecursive(0) == 1L); check(factorialRecursive(7) == 5040L)
    println("All checks passed ✅")
}
