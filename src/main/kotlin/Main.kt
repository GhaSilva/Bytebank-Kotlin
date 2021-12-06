fun main() {
    println("Bem vindo ao bytebank")
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)


    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)


    println("Depositando na Conta do Alex")
    deposita(contaAlex, 50.0)
    println(contaAlex.saldo)

    println("Depositando na Conta da Fran")
    deposita(contaFran, 500.0)
    println(contaFran.saldo)

    }
    class Conta {
        var titular = "";
        var numero = 0;
        var saldo = 0.0;

    }
fun deposita(conta:Conta, valor:Double){
    conta.saldo += valor
}

fun testaCondicoes(saldo: Double) {

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}
fun testaLaco(){
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
