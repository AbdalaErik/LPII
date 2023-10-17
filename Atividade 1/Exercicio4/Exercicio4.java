// Atividade 1 - Exercício 4 (1/5)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

public class Exercicio4 {

    public static void main(String[] arg) {

        // Empresas:

        // Exemplo de uma Farmácia:
        
        Farmacia farmacia1 = new Farmacia("Farmácia do Bem", "Rua das Flores, 123", "Cidade A", "Estado X", "12345-678", "123-456-7890", "Segunda a Sexta: 8h às 20h", 5);

        // Exemplo de um Restaurante:

        Restaurante restaurante1 = new Restaurante("Restaurante Sabor do Mar", "Avenida Principal, 456", "Cidade B", "Estado Y", "98765-432", "987-654-3210", "4/5", true);

        // Exemplo de um Banco:

        Banco banco1 = new Banco("Banco do Futuro", "Rua das Finanças, 789", "Cidade C", "Estado Z", "54321-987", "555-123-4567", 10, 5000);

        System.out.println("\n # Empresas: ");
        
        farmacia1.Imprimir(); restaurante1.Imprimir(); banco1.Imprimir();

        System.out.println();

    }
    
}
