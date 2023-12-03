// Atividade Avaliativa 2 - Classe Pessoa
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Criando a classe abstrata Pessoa:

abstract class Pessoa {

    // Atributos:

    String nome;
    int idade;
    String data_nasc;
    String CPF;
    String endereco;

    // Método construtor padrão:

    public Pessoa(String nome, int idade, String data_nasc,
                  String CPF, String endereco) {

        this.nome = nome;
        this.idade = idade;
        this.data_nasc = data_nasc;
        this.CPF = CPF;
        this.endereco = endereco;

    }

    // Métodos abstratos:

    public abstract String exibirTipoPessoa();

    public abstract void obterInformacoes();

}
