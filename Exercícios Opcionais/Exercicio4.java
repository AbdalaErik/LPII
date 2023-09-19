// Lista de Exercícios Opcionais - Exercício 4
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/02)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

import java.util.*;

public class Exercicio4 {
    
    public static double Calculo(double x, double y) {
        
        return x * y;
        
    }
    
	public static void main(String[] args) {
	    
	    Vector<Integer> idFuncionario = new Vector<Integer>(2);
	    Vector<Double> HorasTrabalhadas = new Vector<Double>(2);
	    Vector<Double> ValorPorHora = new Vector<Double>(2);
	    Vector<Double> Salario = new Vector<Double>(2);
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println(" ================== Informações do Funcionário ==================\n");
	    
        for (int i = 0; i < 2; i++) {
            
            System.out.println(" # Inserção de informações para o " + (i + 1) + "º funcionário\n");

	        System.out.print(" > Insira o número de identificação do funcionário (ID): ");
	    
	        idFuncionario.add(sc.nextInt()); System.out.println();
	    
	        System.out.print(" > Insira o número de horas trabalhadas: ");
	    
	        HorasTrabalhadas.add(sc.nextDouble()); System.out.println();
	    
	        System.out.print(" > Insira o valor recebido por hora (R$): ");
	    
	        ValorPorHora.add(sc.nextDouble()); System.out.println();
	    
	        Salario.add(Calculo(HorasTrabalhadas.get(i), ValorPorHora.get(i)));
	        
	        System.out.println("-----------------------------------------------------------------\n");

			System.out.println(" # Resultados para o " + (i + 1) + "º funcionário\n");
	    
	        System.out.println(" O número de identificação do funcionário é: " + idFuncionario.get(i) + "\n");
	    
	        System.out.println(" O salário do funcionário é: R$ " + String.format("%.2f", Salario.get(i)));
	        
	        if (i == 0) System.out.println();
	        
	        if (i != 1) System.out.println("_________________________________________________________________\n");
	        
        }
	    
        sc.close();
		
	}
	
}
