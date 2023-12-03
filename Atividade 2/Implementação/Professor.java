// Atividade Avaliativa 2 - Classe Professor
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Criando a classe Professor como extensão da classe abstrata Pessoa:

public class Professor extends Pessoa {

    // Atributos:

    String area_ensino;
    double salario;

    // Método construtor:

    public Professor(String nome, int idade, String data_nasc, String CPF,
                     String endereco, String area_ensino, double salario) {

        super(nome, idade, data_nasc, CPF, endereco);

        this.area_ensino = area_ensino;
        this.salario = salario;

    }

    // Aplicando o conceito de polimorfismo por meio da sobrescrita
    // de métodos (Override) da classe abstrata Pessoa:

    @Override
    public String exibirTipoPessoa() {

        return "Professor(a)";

    }

    @Override
    public void obterInformacoes() {

        System.out.println("- Nome: " + this.nome);
        System.out.println("- Idade: " + this.idade);
        System.out.println("- Data de nascimento: " + this.data_nasc);
        System.out.println("- CPF: " + this.CPF);
        System.out.println("- Endereço: " + this.endereco);
        System.out.println("- Área de ensino: " + this.area_ensino);
        System.out.println("- Salário: R$ " + String.format("%.2f", this.salario));

    }    
    
}
