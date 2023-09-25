// Lista de Exercícios Opcionais - Exercício 5 (2/2)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/02)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

public class Funcionario {
    
    int idFuncionario;
    double HorasTrabalhadas;
    double ValorPorHora;
    double Salario;
    
    public Funcionario() {
        
    }
    
    public Funcionario(int a, double b, double c) {
        
        this.idFuncionario = a;
        this.HorasTrabalhadas = b;
        this.ValorPorHora = c;
        this.Salario = Calculo(b, c);
        
    }
    
    public int getidFuncionario() {
        
        return idFuncionario;
        
    }
    
    public double getSalario() {
        
        return Salario;
        
    }
    
    public static double Calculo(double x, double y) {
        
        return x * y;
        
    }
    
}
