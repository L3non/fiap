package model

class Employee: Person() {
    var position: String = ""
    var salary: Double = 0.0

    override fun displayData() {
        println("Name: $name")
        println("Weight: $weight")
        println("Height: $height")
        println("Date Of Birth: $dateOfBirth")
        println("Age: $age")
        println("Salary: $salary")
        println("Position: $position")
        println("***************")
    }
}