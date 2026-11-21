fun main() {
    val palavra = "Universidade"

    for (letra in palavra) {
        // Pula as vogais, incluindo o U maiúsculo da palavra.
        if (letra == 'a' || letra == 'e' || letra == 'i' ||
            letra == 'o' || letra == 'u' || letra == 'U'
        ) {
            continue
        }
        println(letra)
    }
}
