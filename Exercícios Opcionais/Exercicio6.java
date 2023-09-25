// Lista de Exercícios Opcionais - Exercício 6
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/02)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

import java.util.Scanner;

class Exercicio6 {
    
    static void Menu () {
        
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
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("\n # Soma\n");
        
        System.out.print(" > Informe o primeiro valor (x): ");
        
        x = s.nextDouble(); System.out.println();
        
        System.out.print(" > Informe o segundo valor (y): ");
        
        y = s.nextDouble(); System.out.println();
        
        return x + y;
        
    }
    
    public static double Subtracao() {
        
        double x, y;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("\n # Subtração\n");
        
        System.out.print(" > Informe o valor do minuendo (x): ");
        
        x = s.nextDouble(); System.out.println();
        
        System.out.print(" > Informe o valor do subtraendo (y): ");
        
        y = s.nextDouble(); System.out.println();
        
        return x - y;
        
    }
    
    public static double Multiplicacao() {
        
        double x, y;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("\n # Multiplicação\n");
        
        System.out.print(" > Informe o valor do multiplicando (x): ");
        
        x = s.nextDouble(); System.out.println();
        
        System.out.print(" > Informe o valor do multiplicador (y): ");
        
        y = s.nextDouble(); System.out.println();
        
        return x * y;
        
    }
    
    public static double Divisao() {
        
        double x, y;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("\n # Divisão\n");
        
        System.out.print(" > Informe o valor do dividendo (x): ");
        
        x = s.nextDouble(); System.out.println();
        
        System.out.print(" > Informe o valor do divisor (y): ");
        
        y = s.nextDouble(); System.out.println();
        
        return x / y;
        
    }
    
    public static void main(String[] args) {
        
        int x; double resultado;

        Scanner sc = new Scanner(System.in);
        
        do {
            
            Menu();
            
            x = sc.nextInt(); System.out.println();
        
            switch (x) {
                
                case 1:
                    
                    System.out.print("\033[H\033[2J");
                    
                    resultado = Soma();
                    
                    System.out.println(" O resultado da soma é: " + String.format("%.3f", resultado) + "\n");
                    
                    System.out.print(" Pressione ENTER para continuar.");
                    
                    Scanner sc1 = new Scanner(System.in); sc1.nextLine(); 
                    
                    System.out.print("\033[H\033[2J");
                    
                break;
                
                case 2:
                    
                    System.out.print("\033[H\033[2J");
                    
                    resultado = Subtracao();
                    
                    System.out.println(" O resultado da subtração é: " + String.format("%.3f", resultado) + "\n");
                    
                    System.out.print(" Pressione ENTER para continuar.");
                    
                    Scanner sc2 = new Scanner(System.in); sc2.nextLine();
                    
                    System.out.print("\033[H\033[2J");
                    
                break;
                
                case 3:
                    
                    System.out.print("\033[H\033[2J");  
                    
                    resultado = Multiplicacao();
                    
                    System.out.println(" O resultado da multiplicação é: " + String.format("%.3f", resultado) + "\n");
                    
                    System.out.print(" Pressione ENTER para continuar.");
                    
                    Scanner sc3 = new Scanner(System.in); sc3.nextLine();
                    
                    System.out.print("\033[H\033[2J");
                    
                break;
                
                case 4:
                    
                    System.out.print("\033[H\033[2J");  
                    
                    resultado = Divisao();
                    
                    System.out.println(" O resultado da divisão é: " + String.format("%.3f", resultado) + "\n");
                    
                    System.out.print(" Pressione ENTER para continuar.");
                    
                    Scanner sc4 = new Scanner(System.in); sc4.nextLine();
                    
                    System.out.print("\033[H\033[2J");
                    
                break;
                
                case 5:
                    
                break;
                
                default:
                
                    System.out.println("  Opção inválida!\n");
                
                    System.out.print("  Pressione ENTER para continuar.");
                    
                    Scanner sc0 = new Scanner(System.in); sc0.nextLine();
                    
                    System.out.print("\033[H\033[2J");
                    
                break;
            
            }
            
        } while (x != 5);

        sc.close();
        
    }
    
}
