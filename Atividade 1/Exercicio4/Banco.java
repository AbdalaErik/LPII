// Atividade 1 - Exercício 4 (5/5)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Criando a classe Banco como uma especialização da classe Empresa:

public class Banco extends Empresa {

    int numeroCaixasEletronicos;
    int numeroClientes;

    // Método construtor padrão:

    public Banco() {

    }

    // Método construtor com parâmetros:

    public Banco(String nome, String endereco, String cidade, String estado,
                 String cep, String telefone, int numeroCaixasEletronicos,
                 int numeroClientes) {

        super(nome, endereco, cidade, estado, cep, telefone);

        this.numeroCaixasEletronicos = numeroCaixasEletronicos;
        this.numeroClientes = numeroClientes;

    }

    // Métodos setters:

    public void setNumeroCaixasEletronicos(int numeroCaixasEletronicos) {

        this.numeroCaixasEletronicos = numeroCaixasEletronicos;

    }

    public void setNumeroClientes(int numeroClientes) {

        this.numeroClientes = numeroClientes;

    }

    // Métodos getters:

    public int getNumeroCaixasEletronicos() {

        return this.numeroCaixasEletronicos;

    }

    public int getNumeroClientes() {

        return this.numeroClientes;

    }

    // Método para imprimir os atributos do Banco:

    @Override
    public void Imprimir() {

        System.out.println("\n + Banco: ");
        System.out.println(" > Nome: " + this.nome);
        System.out.println(" > Endereço: " + this.endereco);
        System.out.println(" > Cidade: " + this.cidade);
        System.out.println(" > Estado: " + this.estado);
        System.out.println(" > CEP: " + this.cep);
        System.out.println(" > Telefone: " + this.telefone);
        System.out.println(" > Número de caixas eletrônicos: " + this.numeroCaixasEletronicos);
        System.out.println(" > Número de clientes: " + this.numeroClientes);

    }
    
}
