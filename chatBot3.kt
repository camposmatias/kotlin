// 3° parte: if + When

fun main(){
    println("********************************")
    println("* Curso Interactivo de Kotlin  *")
    println("********************************")
    println("      | Intensivos 2023 |\n")
    println("Regístrese, ingresando un Usuario: ")
    var usuarioRegistrado = readLine()!!.toString()
    println("Ingrese una clave : ")
    var claveRegistrada = readLine()!!.toString()

    println("Usuario $usuarioRegistrado, registrado exitosamente.")
    println("")
    println("... pero antes de operar debe Iniciar Sesión:")
    println("------------------------------------")
    println("por favor, ingrese su usuario y contraseña registrados.")
    println("Usuario:")
    var usuarioIngresado = readLine()!!.toString()
    println("Clave:")
    var claveIngresada = readLine()!!.toString()

    // fun contraseña

    if (usuarioRegistrado == usuarioIngresado && claveRegistrada == claveIngresada) {
        println("\n ** Accediste al sistema, exitosamente. **")
        println("")
        println("Elige una opción: \n")
        println("[1] Aprende sobre instalación del IDE.")
        println("[2] Aprende sobre Variables y Operadores aritméticos básicos.")
        println("[3] Aprende sobre Operadores Relacionales, lógicos y condicionales.")
        println("[4] Aprende sobre When.")
        println("[5] Aprende sobre Bucles.")
        println("[6] Aprende sobre Funciones.")
        println("[7] Aprende sobre Arreglos.")
        println("[8] Aprende sobre Listas.")
        println("[9] Aprende sobre POO.")
        println("[10] Aprende sobre .xml.")

    } else {
        println("")
        println(" # Acceso DENEGADO #")
        println(" Contáctese con el programador.")
    }

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