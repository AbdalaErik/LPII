// Atividade 1 - Exercício 3 (5/5)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Criando a classe DVD como uma especialização da classe Produto:

public class DVD extends Produto {

    double duracao;

    // Método construtor padrão:

    public DVD() {

    }

    // Método construtor com parâmetros:

    public DVD(String nome, double preco, double duracao) {

        super(nome, preco);

        this.duracao = duracao;

    }

    // Método para imprimir os atributos do DVD:

    public void Imprimir() {

        System.out.println("\n > Nome: " + this.nome + " | Preço: R$ " + this.preco
                           + " | Duração: " + this.duracao + " minutos");

    }
    
}
