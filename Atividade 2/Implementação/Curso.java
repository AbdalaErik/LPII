// Atividade Avaliativa 2 - Classe Curso
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Criando a classe Curso:

import java.util.ArrayList;

public class Curso {

    // Atributos:

    String nome;
    int numero_periodos;
    ArrayList<Disciplina> disciplinas; // Aplicando o conceito
    ArrayList<Aluno> alunos;           // de composição.

    // Método construtor padrão:

    public Curso(String nome, int numero_periodos, ArrayList<Disciplina> disciplinas,
                 ArrayList<Aluno> alunos) {

        this.nome = nome;
        this.numero_periodos = numero_periodos;
        this.disciplinas = disciplinas;
        this.alunos = alunos;

    }

    // Método para apresentar as informações do curso:

    public void obterInformacoes() {

        System.out.println("# " + this.nome + "\n");
        System.out.println("- Número de períodos: " + this.numero_periodos);

        System.out.println("\n- Disciplinas:\n");
        
        for(int i = 0; i < this.disciplinas.size(); i++) {

            System.out.println("  " + this.disciplinas.get(i).nome + " (" + this.disciplinas.get(i).professor.nome + ")");

        }

        System.out.println("\n- Alunos:\n");

        for(int i = 0; i < this.alunos.size(); i++) {

            System.out.println("  " + this.alunos.get(i).nome);

        }

    }
    
}
