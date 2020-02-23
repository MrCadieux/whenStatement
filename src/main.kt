fun main() {
    var number: Int = 0
    var spanishNum: String = ""

    print("What number would you like to know in Spanish? ")
    number = readLine()!!.toInt()

    when (number) {
        1 -> spanishNum = "Uno"
        2 -> spanishNum = "Dos"
        3 -> spanishNum = "Tres"
        4 -> spanishNum = "Quatro"
        5 -> spanishNum = "Cinco"
        6 -> spanishNum = "Seis"
        7 -> spanishNum = "Siete"
        8 -> spanishNum = "Ocho"
        9 -> spanishNum = "Nueve"
        10 -> spanishNum = "Diez"
    }
    println("$number is $spanishNum in Spanish")
}