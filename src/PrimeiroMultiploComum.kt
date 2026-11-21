fun main() {
    var numero = 1

    while (true) {
        // O primeiro número com os dois restos iguais a zero encerra a busca.
        if (numero % 7 == 0 && numero % 13 == 0) {
            println(numero)
            break
        }
        numero = numero + 1
    }
}
