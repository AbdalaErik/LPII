// Lista de Exercícios Opcionais - Exercício 3
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Lendo informações de 2 funcionários e calculando seus respectivos salários por meio de variáveis comuns (sem a criação de uma classe Funcionario).

import java.util.Scanner;

public class Exercicio3 {

    // Método para calcular o salário do funcionário (Horas trabalhadas * Valor por hora):
    
    public static double Calculo(double x, double y) {
        
        return x * y;
        
    }
    
    public static void main(String[] args) {

        // n -> Número de funcionários a terem seus respectivos salários calculados.

        int n = 2;
        
        int idFuncionario;
        double HorasTrabalhadas;
        double ValorPorHora;
        double Salario;
        
        Scanner sc = new Scanner(System.in); System.out.println();

        for (int i = 0; i < n; i++) {
            
            System.out.println(" # Inserção de informações para o " + (i + 1) + "º funcionário\n");
        
            System.out.print(" > Insira o número de identificação do funcionário (ID): ");
        
            idFuncionario = sc.nextInt(); System.out.println();
        
            System.out.print(" > Insira o número de horas trabalhadas: ");
        
            HorasTrabalhadas = sc.nextDouble(); System.out.println();
        
            System.out.print(" > Insira o valor recebido por hora (R$): ");
        
            ValorPorHora = sc.nextDouble(); System.out.println();
        
            Salario = Calculo(HorasTrabalhadas, ValorPorHora);
            
            System.out.println("----------------------------------------------------------------\n");
            
            System.out.println(" # Resultados para o " + (i + 1) + "º funcionário\n");
        
            System.out.println(" O número de identificação do funcionário é: " + idFuncionario + "\n");
        
            System.out.println(" O salário do funcionário é: R$ " + String.format("%.2f", Salario) + "\n");
            
            if (i != n - 1) System.out.println("================================================================\n");
            
        }
        
        sc.close();
        
    }
    
}
