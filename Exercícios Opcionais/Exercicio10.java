// Lista de Exercícios Opcionais - Exercício 10
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Ler 3 valores (A, B e C) e determinar:

// a) O maior valor;
// b) O menor valor;
// c) A média entre os 3 valores.

import java.util.*;

public class Exercicio10 {

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

        Vector<Integer> Valores = new Vector<Integer>(3);

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.print("> Informe o " + (i + 1) + "º valor: ");

            Valores.add(sc.nextInt());

            System.out.println();

        }

        System.out.println("- O maior valor é " + MaiorValor(Valores) + ".\n");

        System.out.println("- O menor valor é " + MenorValor(Valores) + ".\n");

        System.out.println("- A média entre os valores é " + String.format("%.2f", MediaValor(Valores)) + ".\n");

        sc.close();

    }

}