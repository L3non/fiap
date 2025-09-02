fun main() {
    val accountType = AccountType.CHECKING
    val accountType2 = AccountType.SAVINGS

    println(accountType.accountName)
    println(accountType2.accountName)
    println(accountType2.name)
}

enum class AccountType (var accountName: String) {
    CHECKING("Checking"),
    SAVINGS("Savings"),
    SALARY("Salary"),

}