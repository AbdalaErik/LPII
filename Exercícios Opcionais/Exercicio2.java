// Lista de Exercícios Opcionais - Exercício 2
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/02)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

import java.util.Scanner;

public class Exercicio2 {
    
    public static double Triangulo(double a, double c) {
        
        return a * c / 2;
        
    }
    
    public static double Circulo(double c) {
        
        double pi = 3.14159;
        
        return pi * c * c;
        
    }
    
    public static double Trapezio(double a, double b, double c) {
        
        return ((a + b) * c) / 2;
        
    }
    
    public static double Quadrado(double b) {
        
        return b * b;
        
    }
    
    public static double Retangulo(double a, double b) {
        
        return a * b;
        
    }
    
	public static void main(String[] args) {
	    
	    double A, B, C, Area;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println(" ===== Formas Geométricas (Cálculo das Áreas) =====\n");
	    
	    System.out.print(" > Insira o valor de A: ");
	    
	    A = sc.nextDouble(); System.out.println();
	    
	    System.out.print(" > Insira o valor de B: ");
	    
	    B = sc.nextDouble(); System.out.println();
	    
	    System.out.print(" > Insira o valor de C: ");
	    
	    C = sc.nextDouble(); System.out.println();
	    
	    Area = Triangulo(A, C); System.out.println(" TRIÂNGULO: " + String.format("%.3f", Area) + "\n");
	    
	    Area = Circulo(C); System.out.println(" CÍRCULO: " + String.format("%.3f", Area) + "\n");
	    
	    Area = Trapezio(A, B, C); System.out.println(" TRAPÉZIO: " + String.format("%.3f", Area) + "\n");
	    
	    Area = Quadrado(B); System.out.println(" QUADRADO: " + String.format("%.3f", Area) + "\n");
	    
	    Area = Retangulo(A, B); System.out.println(" RETÂNGULO: " + String.format("%.3f", Area));
	    
	    sc.close();
		
	}
	
}