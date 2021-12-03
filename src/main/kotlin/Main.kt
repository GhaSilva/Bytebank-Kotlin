fun main() {
    println("Bem vindo ao bytebank")
    val titular: String = "Alex"
    val numeroConta: Int = 1000
    var saldo: Double = 0.0
//    saldo = 100 + 2.0

    println("Titular: $titular")
    println("Número da conta: $numeroConta")
    println("Saldo: $saldo")

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")

    }
}