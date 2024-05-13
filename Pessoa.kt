class Pessoa(var nome: String, var idade: Int, var altura: Double) {
    fun apresentar(): String {
        return "Nome: $nome\nIdade: $idade anos\nAltura: $altura"
    }
}

fun main() {
    val pessoa = Pessoa("Clara", 19,1.63)
    println(pessoa.apresentar())
    
}
