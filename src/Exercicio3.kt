import java.util.*

fun dif(A: Int, B: Int, C: Int, D: Int): Int{
    return ((A * B) - (C * D))
}

fun main(args: Array<String>){
    println("Programa para calcular a diferença de A e B com C e D")
    val sc = Scanner(System.`in`)
    print("Digite o valor de A: ")
    val A = sc.nextInt()
    print("Digite o valor de B: ")
    val B = sc.nextInt()
    print("Digite o valor de C: ")
    val C = sc.nextInt()
    print("Digite o valor de D: ")
    val D = sc.nextInt()

    println("A diferença do produto de A e B para C e D é: ${dif(A, B, C, D)}")

}