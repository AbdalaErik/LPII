// Lista de Exercícios Opcionais - Exercício 8 (2/3)
// IFSULDEMINAS - Câmpus Muzambinho
// Ciência da Computação - 4º Período (2023/2)
// Linguagens de Programação II (LPII)
// Docente: Fernanda Maria Ribeiro
// Discente: Erik Bolonha Abdala

// Ampliando a classe Funcionario:

public class Funcionario {
    
    int idFuncionario;
    String CPF;
    String Nome;
    String NIS;
    String RG;
    String DataNascimento;
    String Email;
    String Endereco;
    String Escolaridade;
    double HorasTrabalhadas;
    double ValorPorHora;
    double Salario;
    String Cargo;
    String EntradaEmpresa;
    String ContaBanco;

    // Método construtor padrão:
    
    public Funcionario() {
        
    }

    // Método construtor com parâmetros:
    
    public Funcionario(int idFuncionario, String CPF, String Nome, String NIS,
                       String RG, String DataNascimento, String Email, String Endereco,
                       String Escolaridade, double HorasTrabalhadas, double ValorPorHora,
                       String Cargo, String EntradaEmpresa, String ContaBanco) {
        
        this.idFuncionario = idFuncionario;
        this.CPF = CPF;
        this.Nome = Nome;
        this.NIS = NIS;
        this.RG = RG;
        this.DataNascimento = DataNascimento;
        this.Email = Email;
        this.Endereco = Endereco;
        this.Escolaridade = Escolaridade;
        this.HorasTrabalhadas = HorasTrabalhadas;
        this.ValorPorHora = ValorPorHora;
        this.Salario = Calculo(HorasTrabalhadas, ValorPorHora);
        this.Cargo = Cargo;
        this.EntradaEmpresa = EntradaEmpresa;
        this.ContaBanco = ContaBanco;
        
    }
    
    // Método para calcular o salário do funcionário (Horas trabalhadas * Valor por hora):

    public static double Calculo(double x, double y) {
        
        return x * y;
        
    }

    // Método para imprimir os atributos do objeto Funcionario instanciado:

    public void Imprimir() {

        System.out.println(" > ID: " + this.idFuncionario + "\n");
        System.out.println(" > CPF: " + this.CPF + "\n");
        System.out.println(" > Nome: " + this.Nome + "\n");
        System.out.println(" > NIS: " + this.NIS + "\n");
        System.out.println(" > RG: " + this.RG + "\n");
        System.out.println(" > Data de nascimento: " + this.DataNascimento + "\n");
        System.out.println(" > Email: " + this.Email + "\n");
        System.out.println(" > Endereço: " + this.Endereco + "\n");
        System.out.println(" > Escolaridade: " + this.Escolaridade + "\n");
        System.out.println(" > Salário: R$ " + String.format("%.2f", this.Salario) + "\n");
        System.out.println(" > Cargo: " + this.Cargo + "\n");
        System.out.println(" > Entrada da empresa: " + this.EntradaEmpresa + "\n");
        System.out.println(" > Conta do banco: " + this.ContaBanco + "\n");

    }
    
}