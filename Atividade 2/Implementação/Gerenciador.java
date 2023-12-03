// Atividade Avaliativa 2 - Classe Gerenciador
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Criando a classe Gerenciador:

import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciador {

    public static void Menu() {

        System.out.println("|================== Gerenciador ==================|");
        System.out.println("|                                                 |");
        System.out.println("| + Operações disponíveis:                        |");
        System.out.println("|                                                 |");
        System.out.println("| 1 - Gerenciar ALUNOS                            |");
        System.out.println("|                                                 |");
        System.out.println("| 2 - Gerenciar PROFESSORES                       |");
        System.out.println("|                                                 |");
        System.out.println("| 3 - Gerenciar DISCIPLINAS                       |");
        System.out.println("|                                                 |");
        System.out.println("| 4 - Gerenciar CURSOS                            |");
        System.out.println("|                                                 |");
        System.out.println("| 5 - SAIR                                        |");
        System.out.println("|                                                 |");
        System.out.println("|=================================================|\n");
        System.out.println("  - Escolha uma operação a ser realizada:");
        System.out.print("\n  > ");

    }

    public static void main(String[] args) {

        // Criando ArrayLists para armazenar os objetos:
        
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        ArrayList<Aluno> alunos1 = new ArrayList<Aluno>();
        ArrayList<Aluno> alunos2 = new ArrayList<Aluno>();

        ArrayList<Professor> professores = new ArrayList<Professor>();
        ArrayList<Professor> professores1 = new ArrayList<Professor>();
        ArrayList<Professor> professores2 = new ArrayList<Professor>();

        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
        ArrayList<Disciplina> disciplinas1 = new ArrayList<Disciplina>();
        ArrayList<Disciplina> disciplinas2 = new ArrayList<Disciplina>();

        ArrayList<Curso> cursos = new ArrayList<Curso>();

        Scanner scanner = new Scanner(System.in);

        int opcao;

        // Instanciando os objetos da classe Aluno:

        Aluno aluno1 = new Aluno("Ana Silva", 20, "05/08/2002", "123.456.789-00", "Rua das Flores, 123", "2023001", 9.5);
        Aluno aluno2 = new Aluno("Pedro Oliveira", 22, "15/12/2000", "987.654.321-00", "Avenida Central, 567", "2023002", 7.34);
        Aluno aluno3 = new Aluno("Marina Santos", 19, "10/04/2003", "333.333.333-00", "Travessa dos Pássaros, 45", "2023003", 8.54);
        Aluno aluno4 = new Aluno("João Oliveira", 21, "20/09/2001", "444.444.444-00", "Rua das Palmeiras, 78", "2023004", 8.71);

        alunos1.add(aluno1); alunos1.add(aluno2); alunos1.add(aluno3); alunos1.add(aluno4);
        
        Aluno aluno5 = new Aluno("Maria Ferreira", 23, "25/06/1999", "555.555.555-00", "Avenida Principal, 321", "2023005", 9.28);
        Aluno aluno6 = new Aluno("Mariana Oliveira", 21, "08/06/2000", "789.123.456-00", "Rua das Árvores, 50", "2023006", 8.5);
        Aluno aluno7 = new Aluno("Pedro Henrique", 24, "17/09/1998", "987.654.777-00", "Avenida dos Girassóis, 25", "2023007", 9.0);
        Aluno aluno8 = new Aluno("Luana Rodrigues", 20, "30/03/2002", "654.987.321-00", "Rua das Pedras, 15", "2023008", 7.2);

        alunos2.add(aluno5); alunos2.add(aluno6); alunos2.add(aluno7); alunos2.add(aluno8);

        alunos.add(aluno1); alunos.add(aluno2); alunos.add(aluno3); alunos.add(aluno4);
        alunos.add(aluno5); alunos.add(aluno6); alunos.add(aluno7); alunos.add(aluno8);

        // Instanciando os objetos da classe Professor:

        Professor professor1 = new Professor("Lúcia Andrade", 45, "05/08/1977", "123.456.111-00", "Rua da Informática, 123", "Tecnologia da Informação", 8500.00);
        Professor professor2 = new Professor("Rafael Santos", 37, "15/12/1985", "987.654.222-00", "Avenida dos Bits, 567", "Tecnologia da Informação", 9000.00);
        Professor professor3 = new Professor("Carolina Mendes", 39, "10/04/1983", "333.333.000-00", "Travessa da Programação, 45", "Tecnologia da Informação", 8200.00);

        professores1.add(professor1); professores1.add(professor2); professores1.add(professor3);

        Professor professor4 = new Professor("Fernanda Silva", 42, "12/12/1979", "111.222.333-00", "Rua das Palavras, 100", "Ciências Naturais", 8000.00);
        Professor professor5 = new Professor("Ricardo Martins", 35, "25/05/1987", "444.555.666-00", "Avenida das Ciências, 30", "Ciências Naturais", 7500.00);
        Professor professor6 = new Professor("Camila Ferreira", 38, "18/08/1984", "777.888.999-00", "Travessa das Artes, 20", "Ciências Naturais", 8200.00);
        
        professores2.add(professor4); professores2.add(professor5); professores2.add(professor6);

        professores.add(professor1); professores.add(professor2); professores.add(professor3);
        professores.add(professor4); professores.add(professor5); professores.add(professor6);

        // Instanciando os objetos da classe Disciplina:

        Disciplina disciplina1 = new Disciplina("Linguagens de Programação II", 72, "66:00:00", professor1);
        Disciplina disciplina2 = new Disciplina("Teoria dos Grafos", 54, "49:30:00", professor2);
        Disciplina disciplina3 = new Disciplina("Banco de Dados I", 54, "49:30:00", professor3);

        disciplinas1.add(disciplina1); disciplinas1.add(disciplina2); disciplinas1.add(disciplina3);

        Disciplina disciplina4 = new Disciplina("Parasitologia", 36, "36:40:00", professor4);
        Disciplina disciplina5 = new Disciplina("Embriologia", 82, "73:20:00", professor5);
        Disciplina disciplina6 = new Disciplina("Fisiologia Humana", 82, "73:20:00", professor6);

        disciplinas2.add(disciplina4); disciplinas2.add(disciplina5); disciplinas2.add(disciplina6);

        disciplinas.add(disciplina1); disciplinas.add(disciplina2); disciplinas.add(disciplina3);
        disciplinas.add(disciplina4); disciplinas.add(disciplina5); disciplinas.add(disciplina6);

        // Instanciando os objetos da classe Curso:

        Curso curso1 = new Curso("Ciência da Computação", 8, disciplinas1, alunos1);
        Curso curso2 = new Curso("Ciências Biológicas", 8, disciplinas2, alunos2);

        cursos.add(curso1); cursos.add(curso2);

        do {

            Menu();

            opcao = scanner.nextInt();

            switch(opcao) {

                case 1: // Gerenciar ALUNOS

                    Scanner caso1 = new Scanner(System.in);

                    System.out.print("\033[H\033[2J");

                    System.out.println("=================================================\n");

                    System.out.println("> Gerenciamento de Alunos\n");
                    
                    System.out.println("=================================================\n");

                    for(int i = 0; i < alunos.size(); i++) {

                        System.out.println("# " + alunos.get(i).exibirTipoPessoa() + "\n");

                        alunos.get(i).obterInformacoes();

                        System.out.println();

                        if (i < alunos.size() - 1) {

                            System.out.println("-------------------------------------------------\n");

                        }

                    }

                    System.out.println("=================================================\n");

                    System.out.print("Pressione Enter para continuar.");
                    
                    caso1.nextLine();
                    
                    break;

                case 2: // Gerenciar PROFESSORES

                    Scanner caso2 = new Scanner(System.in);

                    System.out.print("\033[H\033[2J");

                    System.out.println("=================================================\n");

                    System.out.println("> Gerenciamento de Professores\n");
                    
                    System.out.println("=================================================\n");

                    for(int i = 0; i < professores.size(); i++) {

                        System.out.println("# " + professores.get(i).exibirTipoPessoa() + "\n");

                        professores.get(i).obterInformacoes();

                        System.out.println();

                        if (i < professores.size() - 1) {

                            System.out.println("-------------------------------------------------\n");

                        }

                    }

                    System.out.println("=================================================\n");

                    System.out.print("Pressione Enter para continuar.");
                    
                    caso2.nextLine();

                    break;

                case 3: // Gerenciar DISCIPLINAS

                    Scanner caso3 = new Scanner(System.in);

                    System.out.print("\033[H\033[2J");

                    System.out.println("=================================================\n");

                    System.out.println("> Gerenciamento de Disciplinas\n");
                    
                    System.out.println("=================================================\n");

                    for(int i = 0; i < disciplinas.size(); i++) {

                        disciplinas.get(i).obterInformacoes();

                        System.out.println();

                        if (i < disciplinas.size() - 1) {

                            System.out.println("-------------------------------------------------\n");

                        }

                    }

                    System.out.println("=================================================\n");

                    System.out.print("Pressione Enter para continuar.");
                    
                    caso3.nextLine();

                    break;
            
                case 4: // Gerenciar CURSOS

                    Scanner caso4 = new Scanner(System.in);

                    System.out.print("\033[H\033[2J");

                    System.out.println("=================================================\n");

                    System.out.println("> Gerenciamento de Cursos\n");
                    
                    System.out.println("=================================================\n");

                    for(int i = 0; i < cursos.size(); i++) {

                        cursos.get(i).obterInformacoes();

                        System.out.println();

                        if (i < cursos.size() - 1) {

                            System.out.println("-------------------------------------------------\n");

                        }

                    }

                    System.out.println("=================================================\n");

                    System.out.print("Pressione Enter para continuar.");
            
                    caso4.nextLine();

                    break;

                case 5:

                    break;

                default:

                    Scanner erro = new Scanner(System.in);

                    System.out.println("\n  Opção inválida! Escolha novamente.\n");

                    System.out.print("  Pressione ENTER para continuar.");

                    erro.nextLine();

                    break;

            }

            System.out.print("\033[H\033[2J");

        } while(opcao != 5);

        scanner.close();

    }

}
