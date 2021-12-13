fun main() {
    println("Bem vindo ao bytebank")
    val contaAlex = Conta("Alex", 1000)
    contaAlex.saldo = 200.0

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)


    val contaFran = Conta(titular = "Fran", numero = 1001)

    contaFran.saldo = 300.0
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)




}

class Conta(var titular: String, val numero: Int) {
    var saldo = 0.0;

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo < 0) {
            println("Não há fundos o suficiente")
        }
        this.saldo -= valor

    }

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (this.saldo < 0) {
            println("Não há fundos o suficiente para realizar a transferência")
            return false
        }
        this.saca(valor)
        contaDestino.deposita(valor)
        return true

    }


}


fun testaCondicoes(saldo: Double) {

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}

fun testaLaco() {
    var i = 0

    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0
        saldo = -100 + 2.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
        i++

    }
}
