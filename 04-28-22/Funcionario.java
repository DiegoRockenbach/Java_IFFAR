public class Funcionario
{
    String nome;
    String cpf;
    String cargo;
    double salarioBase;
    double salarioNovo;
    double inss;
    double fgts;
    double insal;
    int tempoServico;
    double aumentoAnos;
    boolean insalubridade;
    double aumentoInsal;
    String insalTXT;
    
    public Funcionario(String nome, String cpf, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
    }
    
    public Funcionario(double salarioBase, int tempoServico, boolean insalubridade) {
        this.salarioBase = salarioBase;
        this.tempoServico = tempoServico;
        this.insalubridade = insalubridade;
    }
    
    public void setInsalubridade(boolean insalubridade) {
        this.insalubridade = insalubridade;
    }
    
    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public String getCargo() {
        return this.cargo;
    }
    
    public boolean getInsalubridade() {
        return this.insalubridade;
    }
    
    public void calculaFolhaPagamento() {
        aumentoAnos = salarioBase * (0.05 * tempoServico);
        inss = salarioBase * 0.11;
        fgts = salarioBase* 0.08;
        if (insalubridade == true) {
            aumentoInsal = salarioBase * 0.14;
            salarioNovo = salarioBase + aumentoInsal + aumentoAnos - fgts - inss;
            insalTXT = "possui";
        }
        else {
            salarioNovo = salarioBase + aumentoAnos - fgts - inss;
            insalTXT = "não possui";
        }
        System.out.println ("O seu salário inicial era de R$ "+salarioBase+", e seu novo salário é de R$ "+salarioNovo);
        System.out.println ("O seu tempo de serviço é de "+tempoServico+" anos");
        System.out.println ("Você "+insalTXT+" bônus de insalubridade");
        System.out.println ("INSS = R$ "+inss);
        System.out.println ("FGTS = R$ "+fgts);
    }
}