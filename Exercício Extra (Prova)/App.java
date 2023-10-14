// Exercício Extra (Prova) (1/5)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

public class App {
    
    public static void main(String[] args) throws Exception {
        
        // Crie o objeto motoHonda da classe moto:
        
        moto motoHonda = new moto(150, "Honda CBR 1000RR", 2022, "Vermelha", 45000.00, 17, "Michelin Pilot Road 4");
        
        // Crie o objeto carroFiat da classe carro:
        
        carro carroFiat = new carro(180, "Fiat Palio", 2022, "Azul",  50000.00, 15, "Pirelli Cinturato P1");
        
        // Imprima os atributos do objeto motoHonda:
        
        motoHonda.Imprimir();
        
        // Imprima os atributos do objeto carroFiat:
        
        carroFiat.Imprimir();
        
    }
    
}
