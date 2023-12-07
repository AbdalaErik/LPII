// Lista de Exercícios Opcionais - Exercício 15
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

class Animal {

    public void fazerSom() {

        System.out.println("O animal faz vários sons.\n");

    }

}

class Passaro extends Animal {

    @Override
    public void fazerSom() {

        System.out.println("O pássaro faz vários sons.\n");

    }

}

class Mamifero extends Animal {

    @Override
    public void fazerSom() {

        System.out.println("O mamífero faz vários sons.\n");

    }

}

class BemTeVi extends Passaro {

    @Override
    public void fazerSom() {

        System.out.println("O Bem-te-vi pia.\n");

    }

}

class Papagaio extends Passaro {

    @Override
    public void fazerSom() {

        System.out.println("O papagaio fala.\n");

    }

}

class Cachorro extends Mamifero {

    @Override
    public void fazerSom() {

        System.out.println("O cachorro late.\n");

    }

}

class Vaca extends Mamifero {

    @Override
    public void fazerSom() {

        System.out.println("A vaca muge.\n");

    }

}

public class Exercicio15 {

    public static void main(String[] args) {

        Animal animal = new Animal(); animal.fazerSom();

        Passaro passaro = new Passaro(); passaro.fazerSom();

        Mamifero mamifero = new Mamifero(); mamifero.fazerSom();

        BemTeVi bem_te_vi = new BemTeVi(); bem_te_vi.fazerSom();

        Papagaio papagaio = new Papagaio(); papagaio.fazerSom();

        Cachorro cachorro = new Cachorro(); cachorro.fazerSom();

        Vaca vaca = new Vaca(); vaca.fazerSom();

    }

}