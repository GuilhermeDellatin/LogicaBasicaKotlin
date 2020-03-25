//Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
Faça um programa para ler o valor do raio de um círculo,
e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
*/
import java.util.*

fun areaCirculo(raio: Double, pi: Double): Double{
    return pi * (raio * raio)
}

fun main(args: Array<String>){
    Locale.setDefault(Locale.US)

    val sc = Scanner(System.`in`)
    val pi = 3.14159
    print("Digite o valor do raio para calcular a area do Circulo:")
    val raio = sc.nextDouble()
    println("A area do circulo é: ${"%.4f".format(areaCirculo(raio,pi))}")

    sc.close()
}