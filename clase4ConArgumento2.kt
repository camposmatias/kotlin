fun main() {

    print("Ingrese un número entre 1 y 5: ")
    val valor = readLine()!!.toInt() as Int

    when (valor) {
        1 -> println("Presionaste el número: uno.")
        2 -> println("Presionaste el número: dos.")
        3 -> println("Presionaste el número: tres.")
        4 -> println("Presionaste el número: cuatro.")
        5 -> println("Presionaste el número: cinco.")
        else -> println("El valor del número ingresado está fuera de rango.")
    }
}