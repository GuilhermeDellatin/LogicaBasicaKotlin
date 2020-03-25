import java.util.*

/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */

fun main(args: Array<String>){
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)

    val A: Double
    val B: Double
    val C: Double
    val triangulo: Double
    val circulo: Double
    val trapezio: Double
    val quadrado: Double
    val retangulo: Double
    val pi = 3.14159

    print("Digite o valor de A: ")
    A = sc.nextDouble()
    print("Digite o valor de B: ")
    B = sc.nextDouble()
    print("Digite o valor de C: ")
    C = sc.nextDouble()

    triangulo = A * C / 2.0
    circulo = pi * C * C
    trapezio = (A + B) / 2.0 * C
    quadrado = B * B
    retangulo = A * B
    println()
    println("TRIANGULO: ${"%.3f".format(triangulo)}")
    println("CIRCULO: ${"%.3f".format(circulo)}")
    println("TRAPEZIO: ${"%.3f".format(trapezio)}")
    println("QUADRADO: ${"%.3f".format(quadrado)}")
    println("RETANGULO: ${"%.3f".format(retangulo)}")

    sc.close()

}