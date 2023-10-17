// Atividade 1 - Exercício 2 (2/2)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Importando a biblioteca java.text.DecimalFormat para arredondar
// o valor calculado do IMC de cada pessoa (1 casa após a vírgula):

import java.text.DecimalFormat;

// Criando a classe Pessoa:

public class Pessoa {

    int ID;
    String Nome;
    double Peso;
    double Altura;
    double IMC;
    String Condicao;

    // Método construtor padrão:

    public Pessoa() {

    }

    // Método construtor com parâmetros:

    public Pessoa(int ID, String Nome, double Peso, double Altura) {

        this.ID = ID;
        this.Nome = Nome;
        this.Peso = Peso;
        this.Altura = Altura;
        this.IMC = CalculoIMC(Peso, Altura);
        this.Condicao = CondicaoIMC(this.IMC);

    }

    // Método para calcular o IMC da pessoa:

    public double CalculoIMC(double Peso, double Altura) {

        double IMC = Peso / (Altura * Altura);

        DecimalFormat df = new DecimalFormat("#.0");

        String Conversao = df.format(IMC);

        double IMCArredondado = Double.parseDouble(Conversao.replaceAll(",","."));
        
        return IMCArredondado;

    }

    // Método para definir a condição da pessoa com base no valor do IMC:

    public String CondicaoIMC(double IMC) {

        String Condicao = "";

        if (IMC < 18.5) Condicao = "Magreza";

        else if (IMC >= 18.5 && IMC <= 24.9) Condicao = "Saudável";

        else if (IMC >= 25.0 && IMC <= 29.9) Condicao = "Sobrepeso";

        else if (IMC >= 30.0 && IMC <= 34.9) Condicao = "Obesidade Grau I";

        else if (IMC >= 35.0 && IMC <= 39.9) Condicao = "Obesidade Grau II (severa)";

        else if (IMC >= 40) Condicao = "Obesidade Grau III (morbida)";

        return Condicao;

    }

    // Método para imprimir os atributos da pessoa:

    public void Imprimir() {

        System.out.println("\n > ID: " + this.ID + " | Nome: " + this.Nome + " | IMC: "
                           + this.IMC + " | Condição: " + this.Condicao);

    }
    
}
