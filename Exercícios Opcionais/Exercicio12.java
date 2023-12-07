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

}

class Quadrado extends FormaBidimensional {

}

class Triangulo extends FormaBidimensional {

}

class Cubo extends FormaTridimensional {

}

public class Exercicio12 {
    
}