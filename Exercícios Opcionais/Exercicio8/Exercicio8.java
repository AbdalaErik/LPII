// Lista de Exercícios Opcionais - Exercício 8 (1/3)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Adaptando o código do Exercício 5 com a criação da classe Cliente e a ampliação da classe Funcionario.

// Com o objetivo de adaptar as entradas e saídas em relação ao que se pede no Exercício 5, o programa agora realiza a leitura
// de 2 objetos da classe Funcionario e 2 objetos da classe Cliente. E, além de ainda calcular o salário do funcionário, imprime
// todos os atributos das classes por meio de métodos próprios.

import java.util.*;

public class Exercicio8 {

    public static void main(String[] args) {
        
        // n -> Número de objetos a serem criados para cada classe.

        int n = 2;

        int ID;
        
        double Horas, Valor;

        String CPF, Nome, NIS, RG, DataNascimento, Email, Endereco, Escolaridade,
               Cargo, EntradaEmpresa, ContaBanco, Login, DataPrimeiraCompra;

        // Criando ArrayLists para armazenar os objetos das classes Funcionario e Cliente:
        
        ArrayList<Funcionario> ListaFuncionario = new ArrayList<Funcionario>();

        ArrayList<Cliente> ListaCliente =  new ArrayList<Cliente>();

        // Declarando 2 variáveis de instância para receberem os valores lidos e instanciarem novos objetos:

        Funcionario myObj1; Cliente myObj2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("====================== Inserção de Informações para Funcionários ======================\n");
        
        for (int i = 0; i < n; i++) {

            System.out.println(" # Inserção de informações para o " + (i + 1) + "º funcionário\n");

            System.out.print(" > Insira o número de identificação (ID): "); ID = sc.nextInt(); System.out.println(); sc.nextLine();

            System.out.print(" > Insira o CPF: "); CPF = sc.nextLine(); System.out.println();

            System.out.print(" > Insira o nome: "); Nome = sc.nextLine(); System.out.println();

            System.out.print(" > Insira o NIS: "); NIS = sc.nextLine(); System.out.println();

            System.out.print(" > Insira o RG: "); RG = sc.nextLine(); System.out.println();

            System.out.print(" > Insira a data de nascimento: "); DataNascimento = sc.nextLine(); System.out.println();

            System.out.print(" > Insira o email: "); Email = sc.nextLine(); System.out.println();

            System.out.print(" > Insira o endereço: "); Endereco = sc.nextLine(); System.out.println();

            System.out.print(" > Insira a escolaridade: "); Escolaridade = sc.nextLine(); System.out.println();

            System.out.print(" > Insira o número de horas trabalhadas: "); Horas = sc.nextDouble(); System.out.println(); sc.nextLine();
        
            System.out.print(" > Insira o valor recebido por hora (R$): "); Valor = sc.nextDouble(); System.out.println(); sc.nextLine();

            System.out.print(" > Insira o cargo: "); Cargo = sc.nextLine(); System.out.println();

            System.out.print(" > Insira a entrada da empresa utilizada: "); EntradaEmpresa = sc.nextLine(); System.out.println();

            System.out.print(" > Insira a conta do banco: "); ContaBanco = sc.nextLine(); System.out.println();

            // Instanciando um novo objeto da classe Funcionario:
        
            myObj1 = new Funcionario(ID, CPF, Nome, NIS, RG, DataNascimento, Email, Endereco, Escolaridade,
                                     Horas, Valor, Cargo, EntradaEmpresa, ContaBanco);

            // Armazenando o novo objeto no ArrayList ListaFuncionario:
            
            ListaFuncionario.add(myObj1);
            
            if (i != n - 1) System.out.println("---------------------------------------------------------------------------------------\n");
            
        }

        System.out.println("======================== Inserção de Informações para Clientes ========================\n");

        for (int i = 0; i < n; i++) {

            System.out.println(" # Inserção de informações para o " + (i + 1) + "º cliente\n");

            System.out.print(" > Insira o CPF: "); CPF = sc.nextLine(); System.out.println();

            System.out.print(" > Insira o nome: "); Nome = sc.nextLine(); System.out.println();

            System.out.print(" > Insira o login: "); Login = sc.nextLine(); System.out.println();

            System.out.print(" > Insira o email: "); Email = sc.nextLine(); System.out.println();

            System.out.print(" > Insira o RG: "); RG = sc.nextLine(); System.out.println();

            System.out.print(" > Insira o endereço: "); Endereco = sc.nextLine(); System.out.println();

            System.out.print(" > Insira a data da primeira compra: "); DataPrimeiraCompra = sc.nextLine(); System.out.println();

            // Instanciando um novo objeto da classe Cliente:
        
            myObj2 = new Cliente(CPF, Nome, Login, Email, RG, Endereco, DataPrimeiraCompra);

            // Armazenando o novo objeto no ArrayList ListaCliente:
            
            ListaCliente.add(myObj2);
            
            if (i != n - 1) System.out.println("---------------------------------------------------------------------------------------\n");
            
        }

        System.out.println("============================= Resultados para Funcionários ============================\n");
        
        for (int i = 0; i < n; i++) {
            
            System.out.println(" # Resultados para o " + (i + 1) + "º funcionário\n");

            // Percorrendo e imprimindo todos os objetos armazenados em ArrayList ListaFuncionario:
        
            ListaFuncionario.get(i).Imprimir();
            
            if (i != n - 1) System.out.println("---------------------------------------------------------------------------------------\n");
            
        }

        System.out.println("=============================== Resultados para Clientes ==============================\n");

        for (int i = 0; i < n; i++) {
            
            System.out.println(" # Resultados para o " + (i + 1) + "º cliente\n");

            // Percorrendo e imprimindo todos os objetos armazenados em ArrayList ListaCliente:
        
            ListaCliente.get(i).Imprimir();
            
            if (i != n - 1) System.out.println("---------------------------------------------------------------------------------------\n");
            
        }
        
        sc.close();
        
    }
    
}
