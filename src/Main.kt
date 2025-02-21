import java.sql.SQLOutput
import java.text.DecimalFormat

fun main() {
    /*
        println("Hola Mundo")

        // comentarios

        /*
            comentarios multilinea


        // VARIABLES IMPLICITAS
        // var
        // val

        println("VARIABLES IMPLICITAS")
        var numero = 65
        var decimal = 3.5

        val fecha = "20-12-2022"
        val pi = 3.1415

        numero = 15

        println("EL PRIMER VALOR ES: ${numero} Y EL VALOR DECIMAL ES ${decimal}")

        println("LA FECHA ES: ${fecha}")

        // VARIABLES EXPLICITAS
        println("VARIABLES EXPLICITAS")

        var n1: Int = 0
        var decimal1: Double = 15.5
        var texto: String = "Hola Mundo"
        var estado: Boolean = true
        var caracter: Char = 'B'

        println("EL ENTERO ES: ${n1}")
        println("EL DECIMAL ES: ${decimal1}")
        println("EL STRING ES: ${texto}")
        println("EL BOOLEAN ES: ${estado}")
        println("EL CARACTER ES: ${caracter}")


        // operadores +-*/


        var num1 = 5
        var num2 = 15

        var suma = num1 + num2
        var resta = num1 - num2
        var multi = num1 * num2
        var div = num1 / num2

        println("LA SUMA DE ${num1} CON ${num2} ES: ${suma}")
        println("LA RESTA ES: ${resta}")
        println("LA MULTIPLICACION ES: ${multi}")
        println("LA DIVISION ES: ${div}")

        // Conversiones entre tipos de datos

        var a: String = "10"
        var b = 20

        var s = a.toInt() + b

        println("LA SUMA ES: ${s}")

        println("SALIDA MULTILINEA\nQUE CONTENGA VARIOS\nRENGLONES")

        println(
            """
            ESTO ES OTRA
            SALIDA POR CONSOLA
            DE VARIOS
            RENGLONES
        """.trimIndent()
        )

        // COMO PEDIR DATOS POR TECLADO

        println("INGRESE UN VALOR NUMERICO")
        var z = readln().toDouble()

        println("EL VALOR INGRESADO ES: ${z}")

        // BIBLIOTECA MATEMATICA

        var raiz: Double = Math.sqrt(z)

        println("LA RAIZ DE: ${z} ES: ${DecimalFormat("#.###").format(raiz)} ")

        // CONDICIONALES IF -ELSE

        println("INGRESE LA EDAD")
        var edad = readln().toInt()

        if (edad >= 18) {
            println("ES MAYOR DE EDAD")
        } else {
            println("ES MENOR DE EDAD")
        }

        if (edad < 18) {
            println("ES MENOR DE EDAD")
        } else if (edad < 29) {
            println("ES ADULTO")
        } else if (edad < 60) {
            println("ES ADULTO MAYOR")
        } else {
            println("YA NO ESTA")
        }

        // WHEN
        println(
            """
            INGRESE UNA OCPION
            1. LUNES
            2. MARTES
            3. MIERCOLES
            4. JUEVES
            5. VIERNES
        """.trimIndent())
        var dia = readln().toInt()

        when(dia) {
            1 -> {
                println("DIA LUNES")
                println("ESTE ES EL PRRIMER DIA DE LA SEMANA")
            }
            2 -> println("DIA MARTES")
            3 -> println("DIA MIERCOLES")
            4 -> println("DIA JUEVES")
            5 -> println("DIA VIERNES")

            else -> println("DIA NO EXISTE")


    // CICLOS for

    for (i in 1..10) {
        println("tabla del ${i}")
        for (j in 1..10) {
            println("${i} * ${j} = ${(i * j)}")
        }

    }
    */

    // While
    /*

    var num = 1

    while(num<11){
        println(num)
        num++
    }


    while(est){

        if(num<11){
            println(num)
            num+=1

        }else{
            est = false
        }

    }


// do while

    var b = 100

    do{
        println(b)
        b-=3

    }while(b>0)

}













