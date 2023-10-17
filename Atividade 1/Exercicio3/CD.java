// Atividade 1 - Exercício 3 (4/5)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Criando a classe CD como uma especialização da classe Produto:

public class CD extends Produto {

    int numFaixas;

    // Método construtor padrão:

    public CD() {

    }

    // Método construtor com parâmetros:

    public CD(String nome, double preco, int numFaixas) {

        super(nome, preco);

        this.numFaixas = numFaixas;

    }

    // Método para imprimir os atributos do CD:

    public void Imprimir() {

        System.out.println("\n > Nome: " + this.nome + " | Preço: R$ " + this.preco
                           + " | Número de faixas: " + this.numFaixas);

    }
    
}
