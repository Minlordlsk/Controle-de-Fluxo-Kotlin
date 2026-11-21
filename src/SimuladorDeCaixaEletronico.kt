fun main() {
    var saldo = 1000
    val saque = 150

    while (true) {
        // Verifica se há dinheiro para o próximo saque.
        if (saldo < saque) {
            println("Saldo Insuficiente")
            break
        }

        saldo = saldo - saque
    }
}
