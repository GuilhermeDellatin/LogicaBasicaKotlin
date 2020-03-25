//Exercícios obtidos do URI Online Judge: www.urionlinejudge.com.br

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */
import java.util.*

fun valorPeca(numP1: Int, valorP1: Double, numP2: Int, valorP2: Double): Double{
    return (numP1 * valorP1) + (numP2 * valorP2)
}

fun main(args: Array<String>){
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)

    print("Digite o código da peça 1: ")
    val codP1 = sc.nextInt()
    print("Digite o numero da peça 1: ")
    val numP1 = sc.nextInt()
    print("Digite o valor da peca 1: ")
    val valorP1 = sc.nextDouble()
    print("Digite o código da peça 2: ")
    val codP2 = sc.nextInt()
    print("Digite o numero da peça 2: ")
    val numP2 = sc.nextInt()
    print("Digite o valor da peca 2: ")
    val valorP2 = sc.nextDouble()

   println("VALOR A PAGAR: R$ ${"%.2f".format(valorPeca(numP1, valorP1, numP2, valorP2))}")

    sc.close()
}