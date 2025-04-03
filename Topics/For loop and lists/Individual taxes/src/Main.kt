fun main() {
    val numOfCompanies = readln().toInt()
    val companyIncomes = MutableList(numOfCompanies) { readln().toInt() }
    val companyTaxRates = MutableList(numOfCompanies) { readln().toInt() }

    var maxTax = -1F
    var companyIndex = 0

    for (i in 0 until numOfCompanies) {
        val tax = (companyIncomes[i] * companyTaxRates[i]) / 100F
        if (tax > maxTax) {
            maxTax = tax
            companyIndex = i
        }
    }

    println(companyIndex + 1)
}