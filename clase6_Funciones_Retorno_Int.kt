// Clase #6 | Funciones retorno Int + Condicional

fun retornarMayor(valor1: Int, valor2: Int): Int {
    if (valor1 > valor2) {
        return valor1
    }
    else {
        return valor2
    }
}

fun main() {
    print("Ingrese el primer valor:")
    val valor1 =readLine()!!.toInt()
    print("Ingrese el segundo valor:")
    val valor2 = readLine()!!.toInt()
    println("El número mayor entre $valor1 y $valor2 es: ${retornarMayor(valor1, valor2)}")
}

/*
En este caso, la función retornaMayor() recibe 2 parámetros (valor1 y valor2)
pero retorna, únicamente, el mayor.
 */