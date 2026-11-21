fun main() {
    val senhaCorreta = "1234"

    for (tentativa in 1..5) {
        println("Digite a senha:")
        val senha = readln()

        if (senha == senhaCorreta) {
            println("Acesso concedido")
            break
        }

        println("Senha incorreta")
        // O terceiro erro encerra o laço antes das duas últimas tentativas.
        if (tentativa == 3) {
            println("Cofre travado administrativamente")
            break
        }
    }
}
