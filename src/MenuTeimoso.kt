fun main() {
    while (true) {
        println("1 - Opção 1")
        println("2 - Opção 2")
        println("3 - Módulo em manutenção")
        println("0 - Sair")
        val opcao = readln()

        // A opção em manutenção volta direto para o menu.
        if (opcao == "3") {
            println("Módulo em manutenção")
            continue
        }

        if (opcao == "0") {
            break
        }

        if (opcao == "1" || opcao == "2") {
            println("Processando...")
        }
    }
}
