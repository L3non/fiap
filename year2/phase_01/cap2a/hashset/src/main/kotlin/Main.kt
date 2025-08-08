fun main() {
    var movies = HashSet<String>()
    println(movies.size)

    movies.add("Spiderman")
    movies.add("Lord of the Rings")
    movies.add("Super Mario World")

    println(movies.size)
    println(movies)

    movies.add("Spiderman")
    println(movies)

    movies.add("Spiderman 2")
    println(movies)

    println(movies.contains("Super Mario World"))
    println(movies.contains("Super Mario World 2"))

    movies.remove("Spiderman 2")
    println(movies)

    var prices = setOf(45.9, 78.7, 54.9, 41.9)
    println(prices)

    var products = HashMap<String, Double>()
    products.put("Mouse", 149.9)
    products.put("Keyboard", 219.99)
    products.put("Laser poiter", 56.99)

    println(products)
    println(products.size)

    products.remove("Mouse")
    println(products)

    println(products.get("Keyboard"))

}