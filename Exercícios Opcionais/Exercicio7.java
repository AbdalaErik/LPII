// Lista de Exercícios Opcionais - Exercício 7
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Criar uma calculadora de áreas de figuras planas (triângulo, círculo, trapézio, quadrado e retângulo).

import java.util.Scanner;

public class Exercicio7 {

    static Scanner sc = new Scanner(System.in);
    
    public static void Menu () {
        
        System.out.println("|================ Calculadora de Áreas ================|");
        System.out.println("|                                                      |");
        System.out.println("| + Operações disponíveis:                             |");
        System.out.println("|                                                      |");
        System.out.println("| 1 - Triângulo                                        |");
        System.out.println("|                                                      |");
        System.out.println("| 2 - Círculo                                          |");
        System.out.println("|                                                      |");
        System.out.println("| 3 - Trapézio                                         |");
        System.out.println("|                                                      |");
        System.out.println("| 4 - Quadrado                                         |");
        System.out.println("|                                                      |");
        System.out.println("| 5 - Retângulo                                        |");
        System.out.println("|                                                      |");
        System.out.println("| 6 - Sair                                             |");
        System.out.println("|                                                      |");
        System.out.println("|======================================================|\n");
        System.out.println("  - Escolha uma operação a ser realizada:");
        System.out.print("\n  > ");
        
    }
    
    public static double Triangulo() {
        
        double A, C;
        
        System.out.println("\n # Triângulo\n");
        
        System.out.print(" > Informe o valor da base (A): ");
        
        A = sc.nextDouble(); System.out.println();
        
        System.out.print(" > Informe o valor da altura (C): ");
        
        C = sc.nextDouble(); System.out.println();
        
        return (A * C) / 2;
        
    }
    
    public static double Circulo() {
        
        double C, pi = 3.14159;
        
        System.out.println("\n # Círculo\n");
        
        System.out.print(" > Informe o valor do raio (C): ");
        
        C = sc.nextDouble(); System.out.println();
        
        return pi * C * C;
        
    }
    
    public static double Trapezio() {
        
        double A, B, C;
        
        System.out.println("\n # Trapézio\n");
        
        System.out.print(" > Informe o valor da base 1 (A): ");
        
        A = sc.nextDouble(); System.out.println();
        
        System.out.print(" > Informe o valor da base 2 (B): ");
        
        B = sc.nextDouble(); System.out.println();
        
        System.out.print(" > Informe o valor da altura (C): ");
        
        C = sc.nextDouble(); System.out.println();
        
        return ((A + B) * C) / 2;
        
    }
    
    public static double Quadrado() {
        
        double B;
        
        System.out.println("\n # Quadrado\n");
        
        System.out.print(" > Informe o valor do lado (B): ");
        
        B = sc.nextDouble(); System.out.println();
        
        return B * B;
        
    }
    
    public static double Retangulo() {
        
        double A, B;
        
        System.out.println("\n # Retângulo\n");
        
        System.out.print(" > Informe o valor do lado 1 (A): ");
        
        A = sc.nextDouble(); System.out.println();
        
        System.out.print(" > Informe o valor do lado 2 (B): ");
        
        B = sc.nextDouble(); System.out.println();
        
        return A * B;
        
    }
    
    public static void main(String[] args) {
        
        int x; double Area;
        
        do {
            
            Menu();
            
            x = sc.nextInt(); System.out.println();
        
            switch(x) {
                
                case 1:
                    
                    System.out.print("\033[H\033[2J");
                    
                    Area = Triangulo(); sc.nextLine();
                    
                    System.out.println(" - Área do Triângulo: " + String.format("%.3f", Area) + "\n");
                    
                    System.out.print(" Pressione ENTER para continuar."); sc.nextLine();
                    
                    System.out.print("\033[H\033[2J");
                    
                break;
                
                case 2:
                    
                    System.out.print("\033[H\033[2J");
                    
                   Area = Circulo(); sc.nextLine();
                    
                    System.out.println(" - Área do Círculo: " + String.format("%.3f", Area) + "\n");
                    
                    System.out.print(" Pressione ENTER para continuar."); sc.nextLine();
                    
                    System.out.print("\033[H\033[2J");
                    
                break;
                
                case 3:
                    
                    System.out.print("\033[H\033[2J");  
                    
                    Area = Trapezio(); sc.nextLine();
                    
                    System.out.println(" - Área do Trapézio: " + String.format("%.3f", Area) + "\n");
                    
                    System.out.print(" Pressione ENTER para continuar."); sc.nextLine();
                    
                    System.out.print("\033[H\033[2J");
                    
                break;
                
                case 4:
                    
                    System.out.print("\033[H\033[2J");  
                    
                    Area = Quadrado(); sc.nextLine();
                    
                    System.out.println(" - Área do Quadrado: " + String.format("%.3f", Area) + "\n");
                    
                    System.out.print(" Pressione ENTER para continuar."); sc.nextLine();
                    
                    System.out.print("\033[H\033[2J");
                    
                break;
                
                case 5:
                    
                    System.out.print("\033[H\033[2J");  
                    
                    Area = Retangulo(); sc.nextLine();
                    
                    System.out.println(" - Área do Retângulo: " + String.format("%.3f", Area) + "\n");
                    
                    System.out.print(" Pressione ENTER para continuar."); sc.nextLine();
                    
                    System.out.print("\033[H\033[2J");
                    
                break;
                
                case 6:
                    
                break;
                
                default:
                
                    System.out.println("  Opção inválida! Escolha novamente.\n"); sc.nextLine();
                
                    System.out.print("  Pressione ENTER para continuar."); sc.nextLine();
                    
                    System.out.print("\033[H\033[2J");
                    
                break;
            
            }
            
        } while(x != 6);

        sc.close();
        
    }
    
}