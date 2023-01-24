// Clase #6 | Funciones - Integración: while + función simple.

fun validacion() {

    var clave = 3399

    println("\nIngrese su clave de 4 dígitos: ")

    var claveIngresada = readLine()!!.toInt()

    while (clave != claveIngresada) {
        println("Clave incorrecta. Reintente, por favor.")
        println("Clave: ")
        claveIngresada = readLine()!!.toInt()
    }
    println("* Accediste exitosamente al sistema *")
}
fun bienvenida2() {

    println("\nBienvenidos al curso de programación Kotlin " +
            "\npara aplicaciones móviles")
}

fun main() {

    validacion()
    bienvenida2()
}

/*
Nota:
En este ejemplo, se copia y pega el código de la clase #5: "clase5_While_User_Pass" para validar usauario
y contraseña adentro de una función propia creada llamada validación(), se añade otra función con un println()
de saludo y finalmente se llama a ambas funciones desde la función principal main().
 */