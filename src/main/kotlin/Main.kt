fun main(args: Array<String>) {
    atividade1()
    atividade2()
}

fun atividade1(): Unit {
    val taxas = Taxas()
    println("Digite o número de habitantes")
    val numeroDeHabitantes = readLine()!!.toInt()
    println("Digite o número de nascimentos")
    val numeroDeNascimentos = readLine()!!.toInt()
    println("Digite o número de óbitos")
    val numeroDeObitos = readLine()!!.toInt()
    println(
        "Digite 1 para calcular a taxa de natalidade\n" +
                "Digite 2 para calcular a taxa de mortalidade"
    )
    val taxa = readLine()!!.toInt()
    when (taxa) {
        1 -> {
            println(taxas.calcularNatalidade(numeroDeHabitantes, numeroDeNascimentos))
        }
        2 -> {
            println(taxas.calcularMortalidade(numeroDeHabitantes, numeroDeObitos))
        }
    }

}

fun atividade2(): Unit {
    val pagamento = Pagamento()
    println("Digite o valor do produto")
    val valorProduto = readLine()!!.toFloat()
    println(
        "Digite a forma de pagamento\n" +
                "1 - À Vista \n" +
                "2 - À Prazo (30 dias) \n" +
                "3 - À Prazo (Parcelado)"
    )
    val tipo = readLine()!!.toInt()
    when (tipo) {
        1 -> {
            println(pagamento.calcularAVista(valorProduto))
        }
        2 -> {
            println(pagamento.calcularAPrazo(valorProduto))
        }
        3 -> {
            println("Digite o número de meses")
            val numeroDeMeses = readLine()!!.toInt()
            println(pagamento.calcularParcelado(valorProduto, numeroDeMeses))
        }
    }
}