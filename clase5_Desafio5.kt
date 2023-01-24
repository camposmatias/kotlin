/*
Mostrá con un bucle while los valores del 1 al 5 e informá por consola
si cada uno de estos números es par o impar.
Pista: para determinar la condición respecto de si un número es par o impar divídelo por 2.
 */

fun main() {
    var i = 1
    while(i <= 5) {
        if(i % 2 == 0) {
            println("")
            println("El número $i es par")
        } else {
            println("El número $i es impar")
        }
        i++
    }
}