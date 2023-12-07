// Lista de Exercícios Opcionais - Exercício 5 (2/2)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Criando a classe Funcionario:

package Exercicio5;

public class Funcionario {
    
    int idFuncionario;
    double HorasTrabalhadas;
    double ValorPorHora;
    double Salario;

    // Método construtor padrão:
    
    public Funcionario() {
        
    }

    // Método construtor com parâmetros:
    
    public Funcionario(int idFuncionario, double HorasTrabalhadas, double ValorPorHora) {
        
        this.idFuncionario = idFuncionario;
        this.HorasTrabalhadas = HorasTrabalhadas;
        this.ValorPorHora = ValorPorHora;
        this.Salario = Calculo(HorasTrabalhadas, ValorPorHora);
        
    }

    // Método Getters:
    
    public int getidFuncionario() { // (1/2)
        
        return idFuncionario;
        
    }
    
    public double getSalario() { // (2/2)
        
        return Salario;
        
    }

    // Método para calcular o salário do funcionário (Horas trabalhadas * Valor por hora):
    
    public double Calculo(double x, double y) {
        
        return x * y;
        
    }
    
}
