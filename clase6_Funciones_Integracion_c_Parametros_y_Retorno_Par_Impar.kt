// Clase #6 | Función con Retorno - Par o Impar

fun suma (numA: Int, numB: Int): Int {
    return numA + numB
}
fun esPar(resultado: Int) {
    if (resultado % 2 == 0) {
        println("El número $resultado es par.")
    } else {
        println("El número $resultado es impar.")
    }
}
fun main() {
    println("\nIngrese un número: ")
    val numA = readLine()!!.toInt()
    println("Ingrese otro número: ")
    val numB = readLine()!!.toInt()

    var resultado = suma(numA, numB)
    println("\n$numA + $numB = $resultado.")

    esPar(resultado)
    println("\n--- Fin del programa ---")
}

/*
Nota:
En este ejemplo se inicia la función principal main(), luego
se pide dos valores con readLine() que se almacenan en 2 variables (val)
numA y numB.

Se crea la variable resultado (var) de la línea 19 y se almacena una función dentro de ella,
llamada suma() y entre sus paréntesis se pasan 2 parámetros: numA y numB; que en su interior
almacenan los datos numéricos del readLine(), a esos valores o datos
que  enviamos de una función a otra, los llamamos Argumentos.
Hasta que no se resuelva el código almacenado en suma(), no continúa la ejecucuón del main().


En la línea 20 se imprime en patalla la operación de la suma. Esa función suma() de la línea 3, tiene
entre sus paréntesis los parámetros de recepción (decimos de receción porque recibe el valor,  dato o resultado
de una operación inicialmente ingresada por teclado.  )
Los toma y lo único que hace es retornar (return) la suma de ellos de la línea 4. ¿a dónde retornan? Al main(),
porque es de donde se llama a la función. De manera que lo almacenado en resultado es la suma. Y recién en la línea 20
imprime la suma y el resultado de la suma.

Luego pasa a la línea 22 y se encuentra con otra función, llamada esPar()
que posee un parámetro entre paréntesis llamado (resultado), es decir que le comunica a la función esPar()
lo almacenado en esa variable.
La función esPar() se ejecuta y analiza  mediante un condicional si, el dato que trae (resultado) es
par o impar. Para lo cual toma el número que trae resultado y con el operador resto (%) divide x 2.
El resto de la división x 2 se compara con 0, si no quedan sobreantes, se imprime un
mensaje indicando que el número es Par, else se imprime un mensaje indicando que el
número es impar.

 */