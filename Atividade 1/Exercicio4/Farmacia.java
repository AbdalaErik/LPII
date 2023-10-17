// Atividade 1 - Exercício 4 (3/5)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Criando a classe Farmacia como uma especialização da classe Empresa:

public class Farmacia extends Empresa {

    String horarioFuncionamento;
    int numeroFuncionarios;

    // Método construtor padrão:

    public Farmacia() {

    }

    // Método construtor com parâmetros:

    public Farmacia(String nome, String endereco, String cidade, String estado,
                    String cep, String telefone, String horarioFuncionamento,
                    int numeroFuncionarios) {

        super(nome, endereco, cidade, estado, cep, telefone);

        this.horarioFuncionamento = horarioFuncionamento;
        this.numeroFuncionarios = numeroFuncionarios;

    }

    // Métodos setters:

    public void setHorarioFuncionamento(String horarioFuncionamento) {

        this.horarioFuncionamento = horarioFuncionamento;

    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {

        this.numeroFuncionarios = numeroFuncionarios;

    }

    // Métodos getters:

    public String getHorarioFuncionamento() {

        return this.horarioFuncionamento;

    }

    public int getNumeroFuncionarios() {

        return this.numeroFuncionarios;

    }

    // Método para imprimir os atributos da farmácia:

    @Override
    public void Imprimir() {

        System.out.println("\n + Farmácia: ");
        System.out.println(" > Nome: " + this.nome);
        System.out.println(" > Endereço: " + this.endereco);
        System.out.println(" > Cidade: " + this.cidade);
        System.out.println(" > Estado: " + this.estado);
        System.out.println(" > CEP: " + this.cep);
        System.out.println(" > Telefone: " + this.telefone);
        System.out.println(" > Horário de funcionamento: " + this.horarioFuncionamento);
        System.out.println(" > Número de funcionários: " + this.numeroFuncionarios);

    }
    
}
