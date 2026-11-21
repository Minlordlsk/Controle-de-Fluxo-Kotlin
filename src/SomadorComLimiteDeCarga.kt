fun main() {
    var total = 0

    for (numero in 1..100) {
        // Pula os múltiplos de 10 antes de somar.
        if (numero % 10 == 0) {
            continue
        }

        total = total + numero
        // Encerra assim que a soma ultrapassa 500.
        if (total > 500) {
            break
        }
    }

    println(total)
}
