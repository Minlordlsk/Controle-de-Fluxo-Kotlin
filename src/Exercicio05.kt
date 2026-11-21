fun main() {
    val alvo = 29
    // Apenas números a partir de 2 podem ser primos.
    var ehPrimo = alvo >= 2

    for (divisor in 2..(alvo - 1)) {
        // Um divisor encontrado já é suficiente para encerrar a busca.
        if (alvo % divisor == 0) {
            ehPrimo = false
            break
        }
    }

    if (ehPrimo) {
        println("$alvo é primo.")
    } else {
        println("$alvo não é primo.")
    }
}
