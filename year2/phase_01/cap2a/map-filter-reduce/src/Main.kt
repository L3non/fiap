import java.util.Locale
import java.util.Locale.getDefault

fun main() {
    var numbers = listOf(1, 2, 3, 4, 5)

    var even = numbers.filter {
        it % 2 == 0
    }

    println(even)

    var fruits = listOf("grape", "mango", "pineapple", "strawberry", "orange")
    println(fruits)

    var fruitsM = fruits.filter {
        it.startsWith("m")
    }

    println(fruitsM)

    println("****** using the map ******")

    var fruitsUpper = fruits.map {
        it.uppercase()
    }

    println(fruitsUpper)

    var sum = numbers.reduce {current, next ->
        current + next
    }

    println(sum)

}