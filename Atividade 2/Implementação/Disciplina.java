// Atividade Avaliativa 2 - Classe Disciplina
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Criando a classe Disciplina:

public class Disciplina {

    // Atributos:

    String nome;
    int numero_aulas;
    String carga_horaria;
    Professor professor; // Aplicando o conceito de composição.

    // Método construtor padrão:
    
    public Disciplina(String nome, int numero_aulas, String carga_horaria,
                      Professor professor) {

        this.nome = nome;
        this.numero_aulas = numero_aulas;
        this.carga_horaria = carga_horaria;
        this.professor = professor;

    }

    // Método para apresentar as informações da disciplina:

    public void obterInformacoes() {

        System.out.println("# " + this.nome + "\n");
        System.out.println("- Número de aulas: " + this.numero_aulas);
        System.out.println("- Carga horária: " + this.carga_horaria);
        System.out.println("- Professor(a): " + this.professor.nome);

    }
    
}
