// Atividade 1 - Exercício 4 (2/5)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Criando a classe Empresa:

public class Empresa {

    String nome;
    String endereco;
    String cidade;
    String estado;
    String cep;
    String telefone;

    // Método construtor padrão:

    public Empresa() {

    }

    // Método construtor com parâmetros:

    public Empresa(String nome, String endereco, String cidade, String estado,
                   String cep, String telefone) {

        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;

    }

    // Métodos setters:

    public void setNome(String nome) {

        this.nome = nome;

    }

    public void setEndereco(String endereco) {

        this.endereco = endereco;

    }

    public void setCidade(String cidade) {

        this.cidade = cidade;

    }

    public void setEstado(String estado) {

        this.estado = estado;

    }

    public void setCEP(String cep) {

        this.cep = cep;

    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;

    }

    // Métodos getters:

    public String getNome() {

        return this.nome;

    }

    public String getEndereco() {

        return this.endereco;

    }

    public String getCidade() {

        return this.cidade;

    }

    public String getEstado() {

        return this.estado;

    }

    public String getCEP() {

        return this.cep;

    }

    public String getTelefone() {

        return this.telefone;

    }

    // Método para imprimir os atributos da empresa:

    public void Imprimir() {

        System.out.println("\n + Empresa: ");
        System.out.println(" > Nome: " + this.nome);
        System.out.println(" > Endereço: " + this.endereco);
        System.out.println(" > Cidade: " + this.cidade);
        System.out.println(" > Estado: " + this.estado);
        System.out.println(" > CEP: " + this.cep);
        System.out.println(" > Telefone: " + this.telefone);

    }
    
}
