// Lista de Exercícios Opcionais - Exercício 9 (4/4)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Adaptando a classe Cliente para ser uma extensão/especialização da classe Pessoa:

package Exercicio9;

public class Cliente extends Pessoa {
    
    String Login;
    String DataPrimeiraCompra;

    // Método construtor padrão:
    
    public Cliente() {
        
    }

    // Método construtor com parâmetros:
    
    public Cliente(String CPF, String Nome, String Login, String Email,
                   String RG, String Endereco, String DataPrimeiraCompra) {

        // Chamando o método construtor da classe Pessoa por meio do super():

        super(Nome, CPF, RG, Email, Endereco);
        
        this.Login = Login;
        this.DataPrimeiraCompra = DataPrimeiraCompra;
        
    }

    // Método para imprimir os atributos do objeto Cliente instanciado:
    
    public void Imprimir() {

        System.out.println(" > CPF: " + this.CPF + "\n");
        System.out.println(" > Nome: " + this.Nome + "\n");
        System.out.println(" > Login: " + this.Login + "\n");
        System.out.println(" > Email: " + this.Email + "\n");
        System.out.println(" > RG: " + this.RG + "\n");
        System.out.println(" > Endereço: " + this.Endereco + "\n");
        System.out.println(" > Data da primeira compra: " + this.DataPrimeiraCompra + "\n");

    }
    
}
