// Lista de Exercícios Opcionais - Exercício 9 (2/4)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Criando a classe Pessoa:

public class Pessoa {

    String Nome;
    String CPF;
    String RG;
    String Email;
    String Endereco;

    // Construtor padrão:

    public Pessoa() {

    }

    // Construtor com parâmetros:

    public Pessoa(String Nome, String CPF, String RG, String Email, String Endereco) {

        this.Nome = Nome;
        this.CPF = CPF;
        this.RG = RG;
        this.Email = Email;
        this.Endereco = Endereco;

    }

}