public class Endereco {
    String rua;
    int numero;
    String bairro;
    String cidade;
    String cep;
    String uf;
    String complemento;
    
    public void alteraRua(String rua){
        this.rua = rua;
    }
    
    public void alteraNumero(int numero){
        this.numero = numero;
    }
    
    public void alteraBairro(String bairro){
        this.bairro = bairro;
    }
    
    public void alteraCidade(String cidade){
        this.cidade = cidade;
    }
    
    public void alteraCep(String cep){
        this.cep = cep;
    }
    
    public void alteraUf(String uf){
        this.uf = uf;
    }
    
    public void alteraComplemento(String complemento){
        this.complemento = complemento;
    }
    
    public void mostraEndereco(){
        System.out.println("Rua: "+this.rua+" N°: "+this.numero);
        System.out.println("Bairro: "+this.bairro);
        System.out.println("Cidade: "+this.cidade+"/"+this.uf);
        System.out.println("CEP: "+this.cep);
        System.out.println("Complemento: "+this.complemento);
    }
}