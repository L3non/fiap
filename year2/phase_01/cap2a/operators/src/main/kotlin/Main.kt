fun main() {
    /* var a = 10
    var b = 20

    var c = a + b
    println("Sum $c")

    c = a - b
    println("Subtraction $c")

    c = a * b
    println("Multiplication $c")

    c = a % 4
    println("Rest of the division $c")

    // a = a + 5
    a += 5
    a -= 3
    a /= 2
    a *= 3
    a %= 2

    println("Compound sum $a") */

    /* println(2 > 5)
    println(2 < 5)
    println(2 == 5)
    println(2 == 2)
    println(2 != 2)
    println(2 >= 2)
    println(2 <= 2)
    println(2 <= 3)
    println(2 >= 3) */

    // println(2 < 3 && 5 > 4 && 1 != 10)

    println(2 == 3 || 5 < 5 || 1 != 3)




    println("\nClosed Range ..")
    var numbers = 1..10
    for (number in numbers) {
        println(number)   //Imprime de 1 a 10
    }

    println("\nHalf Closed Range (until)")
    var newNumbers = (1 until 10)
    for (number in newNumbers) {
        println(number)   //Imprime de 1 a 9
    }









}