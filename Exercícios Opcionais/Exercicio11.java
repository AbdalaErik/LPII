// Lista de Exercícios Opcionais - Exercício 11
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Adaptar a calculadora básica do Exercício 6 de tal forma que seja possível
// relizar a soma e a multiplacação entre 2 ou 3 valores. Além disso, adicionar
// uma função para calcular o maior valor, menor valor e o valor de média entre
// 2 ou 3 valores.

import java.util.Scanner;
import java.util.Vector;

public class Exercicio11 {

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
        System.out.println("| 3 - Maior, Menor e Média                         |");
        System.out.println("|                                                  |");
        System.out.println("| 4 - Multiplicação                                |");
        System.out.println("|                                                  |");
        System.out.println("| 5 - Divisão                                      |");
        System.out.println("|                                                  |");
        System.out.println("| 6 - Sair                                         |");
        System.out.println("|                                                  |");
        System.out.println("|==================================================|\n");
        System.out.println("  - Escolha uma operação a ser realizada:");
        System.out.print("\n  > ");
        
    }
    
    public static double Soma() {
        
        int n = 3;
        
        double soma = 0;
        
        System.out.println("\n # Soma\n");

        for (int i = 0; i < n; i++) {

            System.out.print(" > Informe o " + (i + 1) + "º valor: ");

            soma = sc.nextDouble() + soma; System.out.println();

        }

        return soma;
        
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
        
        int n = 3;
        
        double multiplicacao = 1;
        
        System.out.println("\n # Multiplicação\n");

        for (int i = 0; i < n; i++) {

            System.out.print(" > Informe o " + (i + 1) + "º valor: ");

            multiplicacao = sc.nextDouble() * multiplicacao; System.out.println();

        }

        return multiplicacao;
        
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

    public static int MaiorValor(Vector<Integer> X) {

        int Resultado = X.get(0);

        for (int i = 0; i < X.size(); i++) {

            if (X.get(i) > Resultado) {

                Resultado = X.get(i);

            }

        }

        return Resultado;

    }

    public static int MenorValor(Vector<Integer> X) {

        int Resultado = X.get(0);

        for (int i = 0; i < X.size(); i++) {

            if (X.get(i) < Resultado) {

                Resultado = X.get(i);

            }

        }

        return Resultado;

    }

    public static double MediaValor(Vector<Integer> X) {

        Double Somatorio = 0.0; Double Resultado = 0.0;

        for (int i = 0; i < X.size(); i++) {

            Somatorio = Somatorio + X.get(i);

        }

        Resultado = Somatorio / X.size();

        return Resultado;

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

                    Vector<Integer> Valores = new Vector<Integer>(3);

                    System.out.println("\n # Maior, Menor e Média\n");

                    for (int i = 0; i < 3; i++) {

                        System.out.print(" > Informe o " + (i + 1) + "º valor: ");

                        Valores.add(sc.nextInt());

                        System.out.println();

                    }

                    System.out.println(" - O maior valor é " + MaiorValor(Valores) + ".\n");

                    System.out.println(" - O menor valor é " + MenorValor(Valores) + ".\n");

                    System.out.println(" - A média entre os valores é " + String.format("%.2f", MediaValor(Valores)) + ".\n");

                    System.out.print(" Pressione ENTER para continuar."); sc.nextLine(); sc.nextLine();
                    
                    System.out.print("\033[H\033[2J");

                break;
                
                case 4:
                    
                    System.out.print("\033[H\033[2J");  
                    
                    resultado = Multiplicacao(); sc.nextLine();
                    
                    System.out.println(" - O resultado da multiplicação é " + String.format("%.2f", resultado) + ".\n");
                    
                    System.out.print(" Pressione ENTER para continuar."); sc.nextLine();
                    
                    System.out.print("\033[H\033[2J");
                    
                break;
                
                case 5:
                    
                    System.out.print("\033[H\033[2J");  
                    
                    resultado = Divisao(); sc.nextLine();
                    
                    System.out.println(" - O resultado da divisão é " + String.format("%.2f", resultado) + ".\n");
                    
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