// Atividade 1 - Exercício 3 (3/5)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Criando a classe Livro como uma especialização da classe Produto:

public class Livro extends Produto {

    String autor;

    // Método construtor padrão:

    public Livro() {

    }

    // Método construtor com parâmetros:

    public Livro(String nome, double preco, String autor) {

        super(nome, preco);

        this.autor = autor;

    }

    // Método para imprimir os atributos do livro:

    public void Imprimir() {

        System.out.println("\n > Nome: " + this.nome + " | Preço: R$ " + this.preco
                           + " | Autor: " + this.autor);

    }
    
}
