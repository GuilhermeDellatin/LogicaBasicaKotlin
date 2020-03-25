//Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
Faça um programa para ler dois valores inteiros,
e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.
*/
import java.util.*

fun soma(A: Int, B: Int): Int{
    return A + B
}

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)
    print("Digite o valor de A:")
    val A = sc.nextInt()
    print("Digite o valor de B:")
    val B = sc.nextInt()

    println("A soma dos numeros ${A} + ${B} é: ${soma(A,B)}")
}