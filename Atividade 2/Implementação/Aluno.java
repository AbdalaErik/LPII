// Atividade Avaliativa 2 - Classe Aluno
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Criando a classe Aluno como extensão da classe abstrata Pessoa:

public class Aluno extends Pessoa {

    // Atributos:
    
    String matricula;
    double IRA;

    // Método construtor padrão:

    public Aluno(String nome, int idade, String data_nasc, String CPF,
                 String endereco, String matricula, double IRA) {

        super(nome, idade, data_nasc, CPF, endereco);

        this.matricula = matricula;
        this.IRA = IRA;

    }

    // Aplicando o conceito de polimorfismo por meio da sobrescrita
    // de métodos (Override) da classe abstrata Pessoa:

    @Override
    public String exibirTipoPessoa() {
        
        return "Aluno(a)";

    }

    @Override
    public void obterInformacoes() {

        System.out.println("- Nome: " + this.nome);
        System.out.println("- Idade: " + this.idade);
        System.out.println("- Data de nascimento: " + this.data_nasc);
        System.out.println("- CPF: " + this.CPF);
        System.out.println("- Endereço: " + this.endereco);
        System.out.println("- Matrícula: " + this.matricula);
        System.out.println("- IRA: " + String.format("%.2f", this.IRA));

    }

}
