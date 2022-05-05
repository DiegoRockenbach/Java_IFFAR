public class Pessoa
{
    String nome;
    String rg;
    int idade;
    Endereco endereco;
    
    public void alteraNome(String nome){
        this.nome = nome;
    }
    
    public void alteraRg(String rg){
        this.rg = rg;
    }

    
    public void alteraIdade(int idade){
        this.idade = idade;
    }
    
    public void alteraEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public void mostraPessoa(){
        System.out.println("Nome: "+this.nome);
        System.out.println("RG: "+this.rg);
        System.out.println("Idade: "+this.idade);
        System.out.println("Endereço: ");
        this.endereco.mostraEndereco();
    }
}
