class Taxas {
    fun calcularNatalidade(numeroDeHabitantes: Int, numeroDeNascimentos: Int): Int {
        return (numeroDeNascimentos * 1000) / numeroDeHabitantes
    }

    fun calcularMortalidade(numeroDeHabitantes: Int, numeroDeObitos: Int): Int {
        return (numeroDeObitos * 1000) / numeroDeHabitantes
    }
}