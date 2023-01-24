/*
fun registro(): String {

    println("\n********************************")
    println("* Curso Interactivo de Kotlin  *")
    println("********************************")
    println("      | Intensivos 2023 |")
    println("")
    println("Regístrese, ingresando un Usuario: ")
    var usuarioRegistrado = readLine()!!.toString()
    println("Ingrese una clave : ")
    var claveRegistrada = readLine()!!.toString()

    println("Usuario $usuarioRegistrado, registrado exitosamente.")
    return usuarioRegistrado + claveRegistrada
}

fun validacion(usuarioRegistrado: String, claveRegistrada: String) {
    println("... pero antes de operar debe Iniciar Sesión:")
    println("------------------------------------")
    println("por favor, ingrese su usuario y contraseña registrados.")
    println("Usuario:")
    var usuarioIngresado = readLine()!!.toString()
    println("Clave:")
    var claveIngresada = readLine()!!.toString()

    if (usuarioRegistrado == usuarioIngresado && claveRegistrada == claveIngresada) {
        bienvenida2()
    } else {
        println("")
        println(" # Acceso DENEGADO #")
        println(" Contáctese con el programador.")
    }

}

fun bienvenida2() {
    println("\n Accediste exitosamente al programa.")
    println("\n Elige una opción: ")
    var seccion = readLine()!!.toInt()
    when (seccion) {
        1 -> println("Bienvenido a la Sección sobre variables.")
        2 -> println("Bienvenido a la Sección sobre Operadores Aritméticos Básicos.")
        3 -> println("Bienvenido a la Sección sobre Operadores Relacionales.")
        4 -> println("Bienvenido a la Sección sobre Condicionales.")
        5 -> println("Bienvenido a la Sección sobre Operadores Lógicos.")
        6 -> println("Bienvenido a la Sección sobre Operadores When.")
        7 -> println("Bienvenido a la Sección sobre Operadores Bucles.")
    }
}
fun main() {
    registro()
    validacion(usuarioRegistrado = String(), claveRegistrada = String())
}

 */