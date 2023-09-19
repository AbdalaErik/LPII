// Lista de Exercícios Opcionais - Exercício 1
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/02)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int x, y, soma;

		Scanner sc = new Scanner(System.in);

		System.out.println(" ===== Somatório de Valores =====\n");

		System.out.print(" > Insira o primeiro valor: ");

		x = sc.nextInt(); System.out.println();

		System.out.print(" > Insira o segundo valor: ");

		y = sc.nextInt(); System.out.println();

		soma = x + y;

		System.out.println(" O valor da soma é: " + soma);

		sc.close();

	}

}