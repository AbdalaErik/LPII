// Atividade 1 - Exercício 3 (1/5)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

public class Loja {

    public static void main(String[] args) {

        // Produtos:

        // Livros:

        Livro livro1 = new Livro("O Senhor dos Anéis", 39.99, "J.R.R Tolkien");

        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", 29.99, "J.K Rowling");

        // CDs:

        CD cd1 = new CD("Dark Side of the Moon", 19.99, 10);

        CD cd2 = new CD("Thriller", 18.99, 9);

        // DVDs:

        DVD dvd1 = new DVD("Interestelar", 24.99, 169.5);

        System.out.println("\n # Produtos:");

        livro1.Imprimir(); livro2.Imprimir(); cd1.Imprimir(); cd2.Imprimir(); dvd1.Imprimir();

        System.out.println();

    }

}