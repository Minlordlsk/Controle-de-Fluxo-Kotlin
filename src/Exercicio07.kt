fun main() {
    for (numero in 1..50) {
        // O resto da divisão por 10 é o último dígito.
        if (numero % 10 == 7) {
            continue
        }
        println(numero)
    }
}
