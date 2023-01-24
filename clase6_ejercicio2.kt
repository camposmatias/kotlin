fun mayor() {

    val num1 = 40
    val num2 = 2
    val num3 = 8

    if (num1 > num2 && num1 > num3) {
        println("El número $num1 es el mayor de los tres.")
    } else if (num2 > num1 && num2 > num3) {
        println("El número $num2 es el mayor de los tres.")
    } else {
        println("El número $num3 es el mayor de los tres.")
    }
}

fun main() {
    mayor()
}