fun main() {
    var cities = arrayOf<String>("São Paulo", "Rio de Janeiro", "Curitiba")

    println(cities[1])
    println(cities[2])

    cities[2] = "Florianópolis"
    println(cities[2])

    var haveCities = cities.isEmpty()
    println(haveCities)

    var values = arrayOf<Int>()
    var haveValues = cities.isEmpty()
    println(haveValues)

    println(cities.size)
    println(values.size)

    var fruits = ArrayList<String>()
    println("Fruits " + fruits.size)

    fruits.add("Banana")
    fruits.add("Watermelon")
    fruits.add("Mango")
    fruits.add("Strawberry")
    fruits.add("Watermelon")

    println("Fruits " + fruits.size)

    println(fruits.contains("Grape"))
    println(fruits.contains("Mango"))

    // View all list items
    println(fruits)

    fruits.remove("Banana")

    println(fruits)

//Criando um List de Strings
    var movies = ArrayList<String> ()
    movies.addAll(listOf(
        "Matrix",
        "Vingadores",
        "Jurassic Park",
        "De Volta para o Futuro"
    ))
//Criando um list vazio
    var movies2 = ArrayList<String> ()
//Inserindo elementos
    movies.add("Homem-Aranha: De Volta ao Lar")
    println(movies.count()) //5
    println("\n")
//Perceba que o código abaixo vai alterar a quantidade
//de itens do List pois ele aceita itens repetidos.
    movies.add("Homem-Aranha: De Volta ao Lar")
    println(movies)   //[Matrix, Vingadores, Jurassic Park, De Volta ao Futuro, Homem-Aranha: De Volta ao Lar, Homem-Aranha: De Volta ao Lar]
    println(movies.count()) //6 (2 elementos repetidos)
    println("\n")
//Removendo 2 elementos repetidos
    movies.remove("Homem-Aranha: De Volta ao Lar")
    movies.remove("Homem-Aranha: De Volta ao Lar")
    println(movies)   //["Vingadores", "De Volta para o Futuro", "Matrix", "Jurassic Park"]
    println("\n")
//Percorrendo um List
    for (movie in movies) {
        println(movie)
    }
    println("\n")
//Verificando se determinado elemento está contido no List
    if (movies.contains("Matrix")) {
        println("Matrix está na minha lista de filmes favoritos!!")
    }
    println("\n")
//Vamos criar um novo List para realizarmos algumas operações
//No exemplo abaixo, usaremos um formato mais simplificado de criação de List
    var myWifeMovies  = listOf(
        "De Repente 30",
        "Mensagem para você",
        "Sintonia de Amor",
        "De Volta para o Futuro",
        "Jurassic Park"
    )
//Criando um List com todos os filmes
    var allMovies = movies + myWifeMovies
    println(allMovies)
//[Matrix, Vingadores, Jurassic Park, De Volta para o Futuro, De Repente 30, Mensagem para você, Sintonia de Amor, De Volta para o Futuro, Jurassic Park]
    println("\n")
}