import model.Employee
import model.Person

fun main() {
    var person = Person()
    person.name = "Maria"
    person.weight = 58
    person.displayData()

    var employee = Employee()
    employee.name = "José"
    employee.weight = 78
    employee.height = 1.85
    employee.position = "Android developer"
    employee.salary = 15000.0

    employee.displayData()
}