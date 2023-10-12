// Lista de Exercícios Opcionais - Exercício 5 (1/2)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Adaptando o código dos Exercícios 3 e 4 para que seja criada uma classe Funcionario.

import java.util.*;

class Exercicio5 {

    public static void main(String[] args) {

        // n -> Número de objetos a serem criados para a classe Funcionario.

        int n = 2;
        
        int id; double horas, valor;

        // Criando um ArrayList para armazenar os objetos da classe Funcionario:
        
        ArrayList<Funcionario> Lista = new ArrayList<Funcionario>();

        // Declarando uma variável de instância para receber os valores lidos e instanciar novos objetos:

        Funcionario myObj;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("================== Informações do Funcionário ==================\n");
        
        for (int i = 0; i < n; i++) {

            System.out.println(" # Inserção de informações para o " + (i + 1) + "º funcionário\n");

            System.out.print(" > Insira o número de identificação do funcionário (ID): ");
       
            id = sc.nextInt(); System.out.println();
        
            System.out.print(" > Insira o número de horas trabalhadas: ");
        
            horas = sc.nextDouble(); System.out.println();
        
            System.out.print(" > Insira o valor recebido por hora (R$): ");
        
            valor = sc.nextDouble(); System.out.println();

            // Instanciando um novo objeto da classe Funcionario:
        
            myObj = new Funcionario(id, horas, valor);

            // Armazenando o novo objeto no ArrayList ListaFuncionario:
            
            Lista.add(myObj);
            
            if (i != n - 1) System.out.println("----------------------------------------------------------------\n");
            
        }
        
        System.out.println("================= Resultados para Funcionários =================\n");
        
        for (int i = 0; i < n; i++) {
            
            System.out.println(" # Resultados para o " + (i + 1) + "º funcionário\n");
        
            System.out.println(" O número de identificação do funcionário é: " + Lista.get(i).getidFuncionario() + "\n");
        
            System.out.println(" O salário do funcionário é: R$ " + String.format("%.2f", Lista.get(i).getSalario()));
            
            if (i == 0 || i == n - 1) System.out.println();
            
            if (i != n - 1) System.out.println("----------------------------------------------------------------\n");
            
        }
        
        sc.close();
        
    }
    
}