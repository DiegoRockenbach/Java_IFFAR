import java.util.Date;

public class PessoaTeste
{
    String nome;
    String rg;
    Date nasc;
    double salario;
    
    public void alteraNome(String novoNome) {
        nome = novoNome;
    }
    
    public String mostraNome() {
        return nome;
    }
}
