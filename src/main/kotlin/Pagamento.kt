class Pagamento {
    fun calcularAVista(valorProduto: Float): Float {
        var valorFinal: Float = 0f
        valorFinal = valorProduto - (valorProduto * 0.1f)
        return valorFinal
    }

    fun calcularAPrazo(valorProduto: Float): Float {
        var valorFinal: Float = 0f
        valorFinal = valorProduto + (valorProduto * 0.03f)
        return valorFinal
    }

    fun calcularParcelado(valorProduto: Float, numeroDeMeses: Int): Float {
        var valorFinal: Float = 0f
        valorFinal = valorProduto + (numeroDeMeses * (valorProduto * 0.015f))
        return valorFinal
    }
}
