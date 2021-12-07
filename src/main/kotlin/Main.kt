fun main() {
    println("Bem vindo ao bytebank")
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.setSaldo(200.0)
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.getSaldo())


    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.setSaldo(300.0)
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.getSaldo())


//    println("Depositando na Conta do Alex")
//    contaAlex.deposita(50.0)
//    println(contaAlex.saldo)
//
//    println("Depositando na Conta da Fran")
//    contaFran.deposita(500.0)
//    println(contaFran.saldo)
//
//
//    println("Sacando na Conta do Alex")
//    contaAlex.saca(50.0)
//    println(contaAlex.saldo)


    contaFran.transfere(1.0, contaAlex)
    println(contaAlex.getSaldo())
    println(contaFran.getSaldo())


}

class Conta {
    var titular = "";
    var numero = 0;
    private var saldo = 0.0;

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

    fun getSaldo(): Double{
        return saldo
    }

    fun setSaldo(valor: Double){
        saldo = valor
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
