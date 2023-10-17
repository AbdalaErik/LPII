// Atividade 1 - Exercício 4 (4/5)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Criando a classe Restaurante como uma especialização da classe Empresa:

public class Restaurante extends Empresa {

    String avaliacaoMediaClientes;
    boolean reservasOnline;

    // Método construtor padrão:

    public Restaurante() {

    }

    // Método construtor com parâmetros:

    public Restaurante(String nome, String endereco, String cidade, String estado,
                   String cep, String telefone, String avaliacaoMediaClientes,
                   boolean reservasOnline) {

        super(nome, endereco, cidade, estado, cep, telefone);

        this.avaliacaoMediaClientes = avaliacaoMediaClientes;
        this.reservasOnline = reservasOnline;

    }

    // Métodos setters:

    public void setAvaliacaoMediaClientes(String avaliacaoMediaClientes) {

        this.avaliacaoMediaClientes = avaliacaoMediaClientes;

    }

    public void setReservasOnline(boolean reservasOnline) {

        this.reservasOnline = reservasOnline;

    }

    // Métodos getters:

    public String getAvaliacaoMediaClientes() {

        return this.avaliacaoMediaClientes;

    }

    public boolean getReservasOnline() {

        return this.reservasOnline;

    }

    // Método para imprimir os atributos do Restaurante:

    @Override
    public void Imprimir() {

        System.out.println("\n + Restaurante: ");
        System.out.println(" > Nome: " + this.nome);
        System.out.println(" > Endereço: " + this.endereco);
        System.out.println(" > Cidade: " + this.cidade);
        System.out.println(" > Estado: " + this.estado);
        System.out.println(" > CEP: " + this.cep);
        System.out.println(" > Telefone: " + this.telefone);
        System.out.println(" > Avaliação média dos clientes: " + this.avaliacaoMediaClientes);

        if (this.reservasOnline == true)

        System.out.println(" > Possui suporte para reservas online: Sim");

        else

        System.out.println(" > Possui suporte para reservas online: Não");

    }
    
}
