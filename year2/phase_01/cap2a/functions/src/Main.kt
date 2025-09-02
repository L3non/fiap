fun main() {
    var a = 10
    var b = 20

    sum(a, b)
    sum(a = 5, b = 10)
    sum(10, 20)

    salute()

    var x = subtract(5, 6)
    var y = subtract(50, 20)

    println(x)
    println(y)

    var z = subtract(100, 25)
    println(z)

}

fun salute() {
    println("Hello FIAP guys!")
}

fun sum(a: Int, b: Int) {
    println("The sum is ${a + b}")
}

fun subtract(a: Int, b: Int): Int {
    var result = a - b
    return result
}

fun divide(a: Int, b: Int) = a / b
