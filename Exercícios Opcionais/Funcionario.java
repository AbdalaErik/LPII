// Lista de Exercícios Opcionais - Exercício 5
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/02)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

import java.util.*;
import java.util.ArrayList;

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
    
	public static void main(String[] args) {
	    
	    int id; double horas, valor;
	    
	    ArrayList<Funcionario> Lista = new ArrayList<Funcionario>();
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println(" ================== Informações do Funcionário ==================\n");
	    
        for (int i = 0; i < 2; i++) {

            System.out.println(" # Inserção de informações para o " + (i + 1) + "º funcionário\n");

	        System.out.print(" > Insira o número de identificação do funcionário (ID): ");
	   
	        id = sc.nextInt(); System.out.println();
	    
	        System.out.print(" > Insira o número de horas trabalhadas: ");
	    
	        horas = sc.nextDouble(); System.out.println();
	    
	        System.out.print(" > Insira o valor recebido por hora (R$): ");
	    
	        valor = sc.nextDouble(); System.out.println();
	    
	        Funcionario myObj = new Funcionario(id, horas, valor);
	        
	        Lista.add(myObj);
	        
	        if (i != 1) System.out.println("-----------------------------------------------------------------\n");
	        
        }
        
        System.out.println("_________________________________________________________________\n");
        
        for (int i = 0; i < 2; i++) {
            
            System.out.println(" # Resultados para o " + (i + 1) + "º funcionário\n");
        
            System.out.println(" O número de identificação do funcionário é: " + Lista.get(i).getidFuncionario() + "\n");
	    
	        System.out.println(" O salário do funcionário é: R$ " + String.format("%.2f", Lista.get(i).getSalario()));
	        
	        if (i == 0) System.out.println();
	        
	        if (i != 1) System.out.println("-----------------------------------------------------------------\n");
	        
        }
	    
	    sc.close();
		
	}
	
}