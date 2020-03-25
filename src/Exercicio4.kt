//Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse funcionário.
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 */

import java.util.*

fun salarioFuncionario(horasTrabalhadas: Int, valor: Double): Double {
    return valor * horasTrabalhadas
}

fun main(args: Array<String>){
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)

    println("Calculo de salário funcionario")
    print("Digite o número do funcionário: ")
    val numero =sc.nextInt()
    print("Digite o número de horas que o funcionário trabalha: ")
    val horasTrabalhadas = sc.nextInt()
    print("Digite quanto o funcionario recebe por hora trabalhada: ")
    val valor = sc.nextDouble()
    println("Numero = ${numero}")
    println("Salario = U$ ${"%.2f".format(salarioFuncionario(horasTrabalhadas, valor))}")

    sc.close()
}

//Fazendo sem função
/*
fun main(args: Array<String>){
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)

    val numero: Int
    val horas: Int
    val valorHora: Double
    val salario: Double
    numero = sc.nextInt()
    horas = sc.nextInt()
    valorHora = sc.nextDouble()
    salario = valorHora * horas
    println("NUMBER = " + numero)
    System.out.printf("SALARY = U$ %.2f%n", salario)

    sc.close()
}*/