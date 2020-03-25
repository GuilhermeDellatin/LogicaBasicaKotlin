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