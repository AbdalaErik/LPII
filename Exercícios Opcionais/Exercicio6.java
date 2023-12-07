// Lista de Exercícios Opcionais - Exercício 6
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Criar uma calculadora com operações básicas (soma, subtração, multiplicação e divisão).

import java.util.Scanner;

public class Exercicio6 {

    static Scanner sc = new Scanner(System.in);
    
    public static void Menu () {
        
        System.out.println("|=============== Calculadora Básica ===============|");
        System.out.println("|                                                  |");
        System.out.println("| + Operações disponíveis:                         |");
        System.out.println("|                                                  |");
        System.out.println("| 1 - Soma                                         |");
        System.out.println("|                                                  |");
        System.out.println("| 2 - Subtração                                    |");
        System.out.println("|                                                  |");
        System.out.println("| 3 - Multiplicação                                |");
        System.out.println("|                                                  |");
        System.out.println("| 4 - Divisão                                      |");
        System.out.println("|                                                  |");
        System.out.println("| 5 - Sair                                         |");
        System.out.println("|                                                  |");
        System.out.println("|==================================================|\n");
        System.out.println("  - Escolha uma operação a ser realizada:");
        System.out.print("\n  > ");
        
    }
    
    public static double Soma() {
        
        double x, y;
        
        System.out.println("\n # Soma\n");
        
        System.out.print(" > Informe o primeiro valor (x): ");
        
        x = sc.nextDouble(); System.out.println();
        
        System.out.print(" > Informe o segundo valor (y): ");
        
        y = sc.nextDouble(); System.out.println();
        
        return x + y;
        
    }
    
    public static double Subtracao() {
        
        double x, y;
        
        System.out.println("\n # Subtração\n");
        
        System.out.print(" > Informe o valor do minuendo (x): ");
        
        x = sc.nextDouble(); System.out.println();
        
        System.out.print(" > Informe o valor do subtraendo (y): ");
        
        y = sc.nextDouble(); System.out.println();
        
        return x - y;
        
    }
    
    public static double Multiplicacao() {
        
        double x, y;
        
        System.out.println("\n # Multiplicação\n");
        
        System.out.print(" > Informe o valor do multiplicando (x): ");
        
        x = sc.nextDouble(); System.out.println();
        
        System.out.print(" > Informe o valor do multiplicador (y): ");
        
        y = sc.nextDouble(); System.out.println();
        
        return x * y;
        
    }
    
    public static double Divisao() {
        
        double x, y;
        
        System.out.println("\n # Divisão\n");
        
        System.out.print(" > Informe o valor do dividendo (x): ");
        
        x = sc.nextDouble(); System.out.println();
        
        System.out.print(" > Informe o valor do divisor (y): ");
        
        y = sc.nextDouble(); System.out.println();
        
        return x / y;
        
    }
    
    public static void main(String[] args) {
        
        int x; double resultado;
        
        do {
            
            Menu();
            
            x = sc.nextInt(); System.out.println();
        
            switch(x) {
                
                case 1:
                    
                    System.out.print("\033[H\033[2J");
                    
                    resultado = Soma(); sc.nextLine();
                    
                    System.out.println(" - O resultado da soma é " + String.format("%.2f", resultado) + ".\n");
                    
                    System.out.print(" Pressione ENTER para continuar."); sc.nextLine();
                    
                    System.out.print("\033[H\033[2J");
                    
                break;
                
                case 2:
                    
                    System.out.print("\033[H\033[2J");
                    
                    resultado = Subtracao(); sc.nextLine();
                    
                    System.out.println(" - O resultado da subtração é " + String.format("%.2f", resultado) + ".\n");
                    
                    System.out.print(" Pressione ENTER para continuar."); sc.nextLine();
                    
                    System.out.print("\033[H\033[2J");
                    
                break;
                
                case 3:
                    
                    System.out.print("\033[H\033[2J");  
                    
                    resultado = Multiplicacao(); sc.nextLine();
                    
                    System.out.println(" - O resultado da multiplicação é " + String.format("%.2f", resultado) + ".\n");
                    
                    System.out.print(" Pressione ENTER para continuar."); sc.nextLine();
                    
                    System.out.print("\033[H\033[2J");
                    
                break;
                
                case 4:
                    
                    System.out.print("\033[H\033[2J");  
                    
                    resultado = Divisao(); sc.nextLine();
                    
                    System.out.println(" - O resultado da divisão é " + String.format("%.2f", resultado) + ".\n");
                    
                    System.out.print(" Pressione ENTER para continuar."); sc.nextLine();
                    
                    System.out.print("\033[H\033[2J");
                    
                break;
                
                case 5:
                    
                break;
                
                default:
                
                    System.out.println("  Opção inválida! Escolha novamente.\n"); sc.nextLine();
                
                    System.out.print("  Pressione ENTER para continuar."); sc.nextLine();
                    
                    System.out.print("\033[H\033[2J");
                    
                break;
            
            }
            
        } while(x != 5);

        sc.close();
        
    }
    
}