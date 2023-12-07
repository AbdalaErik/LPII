// Lista de Exercícios Opcionais - Exercício 12
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

abstract class Forma {

    abstract void getArea();

}

class FormaBidimensional extends Forma {

    @Override
    public void getArea() {

    }

}

class FormaTridimensional extends Forma {

    @Override
    public void getArea() {

    }

    public void getVolume() {

    }

}

class Circulo extends FormaBidimensional {

    double raio, pi = 3.14, area;

    public Circulo(double raio) {

        this.raio = raio;

    }

    @Override
    public void getArea() {

        area = pi * raio * raio;

        System.out.println("A área do círculo é " + String.format("%.2f", area) + ".\n");

    }

}

class Quadrado extends FormaBidimensional {

    double lado, area;

    public Quadrado(double lado) {

        this.lado = lado;

    }

    @Override
    public void getArea() {

        area = lado * lado;

        System.out.println("A área do quadrado é " + String.format("%.2f", area) + ".\n");

    }

}

class Triangulo extends FormaBidimensional {

    double base, altura, area;

    public Triangulo(double base, double altura) {

        this.base = base;
        this.altura = altura;

    }

    @Override
    public void getArea() {

        area = (base * altura) / 2;

        System.out.println("A área do triângulo é " + String.format("%.2f", area) + ".\n");

    }

}

class Cubo extends FormaTridimensional {

    double lado, area, volume;

    public Cubo(double lado) {

        this.lado = lado;

    }

    @Override
    public void getArea() {

        area = lado * lado;

        System.out.println("A área do cubo é " + String.format("%.2f", area) + ".\n");

    }

    @Override
    public void getVolume() {

        volume = lado * lado * lado;

        System.out.println("O volume do cubo é " + String.format("%.2f", volume) + ".\n");

    }

}

public class Exercicio12 {

    public static void main(String[] arg) {

        Circulo circulo = new Circulo(2); circulo.getArea();

        Quadrado quadrado = new Quadrado(4); quadrado.getArea();

        Triangulo triangulo = new Triangulo(4, 5); triangulo.getArea();

        Cubo cubo = new Cubo(3); cubo.getArea(); cubo.getVolume();

    }

}