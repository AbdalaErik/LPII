// Lista de Exercícios Opcionais - Exercício 13
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

class Data {

    int dia, mes, ano;

    public Data(int dia, int mes, int ano) {

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public void setDia(int dia) {

        this.dia = dia;

    }

    public void setMes(int mes) {

        this.mes = mes;
        
    }

    public void setAno(int ano) {

        this.ano = ano;

    }

    public int getDia() {

        return dia;

    }

    public int getMes() {

        return mes;

    }

    public int getAno() {

        return ano;

    }

    public void Imprimir() {

        System.out.println("Data: " + dia + "/" + mes + "/" + ano + "\n");

    }

}

public class Exercicio13 {

    public static void main(String[] args) {

        Data data = new Data(7, 12, 2023);

        data.Imprimir();

    }

}