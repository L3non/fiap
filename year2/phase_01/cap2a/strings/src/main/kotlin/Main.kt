fun main() {
    var name = "Bruno"
    println(name)

    name = "Maria"
    println(name)

    println(name.length)

    var city: String = "São Paulo"
    println("City name " + city)
    println("Number of letters: " + city.length)

    var type = 'X'
    println(type)
    type = 'B'

    var (code, description) = Pair(100, "Mouse")
    println(code)
    println(description)

    var product2: Pair<Int, String> = Pair(200, "Keyboard")
    println(product2.first)
    println(product2.second)

}