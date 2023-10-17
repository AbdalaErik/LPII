// Atividade 1 - Exercício 2 (1/2)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

public class Exercicio2 {

    public static void main(String[] args) {

        // Pessoas:

        Pessoa pessoaMagreza = new Pessoa(1, "Ana Silva", 45, 1.65);

        Pessoa pessoaSaudavel = new Pessoa(2, "Carlos Santos", 70, 1.75);

        Pessoa pessoaSobrepeso = new Pessoa(3, "Maria Pereira", 80, 1.70);

        Pessoa pessoaObesidadeGrauI = new Pessoa(4, "Luís Oliveira", 90, 1.68);

        Pessoa pessoaObesidadeGrauII = new Pessoa(5, "Sofia Alves", 110, 1.75);

        Pessoa pessoaObesidadeGrauIII = new Pessoa(6, "Pedro Rodrigues", 130, 1.80);

        System.out.println("\n # Pessoas:");

        pessoaMagreza.Imprimir();
        
        pessoaSaudavel.Imprimir();
        
        pessoaSobrepeso.Imprimir();

        pessoaObesidadeGrauI.Imprimir();
        
        pessoaObesidadeGrauII.Imprimir(); 
        
        pessoaObesidadeGrauIII.Imprimir();

        System.out.println();

    }

}