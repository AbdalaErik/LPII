public class carro extends automovel {
    
    int ano;
    String cor;
    double preco;
    pneu p;
    
    // Construtor:
    
    public carro(int velocidade, String modelos, int ano, String cor, double preco, int aro, String modelo) {
        
        super(velocidade, modelos);
        
        p = new pneu(aro, modelo);
        
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        
    }
    
    // Método Imprimir:
    
    public void Imprimir() {
        
        System.out.println("\n + Objeto Carro");
        System.out.println(" > Velocidade: " + this.velocidade + " km/h");
        System.out.println(" > Modelo: " + this.modelos);
        System.out.println(" > Ano: " + this.ano);
        System.out.println(" > Cor: " + this.cor);
        System.out.println(" > Preço: R$ " + String.format("%.2f", this.preco));
        System.out.println(" > Características do pneu:");
        System.out.println(" - Aro: " + p.aro + " polegadas");
        System.out.println(" - Modelo: " + p.modelo);
        
    }
    
}
