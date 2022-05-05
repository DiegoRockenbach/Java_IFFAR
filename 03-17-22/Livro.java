public class Livro
{
    String titulo;
    String autor;
    String editora;
    String situacao;
    double preco;
    int ano;
    
    public void mostraLivro() {
    System.out.println ("O título do livro é "+titulo);
    System.out.println ("O autor do livro é "+autor);
    System.out.println ("A editora do livro é "+editora);
    System.out.println ("A situação do livro é "+situacao);
    System.out.println ("O preço do livro é R$ "+preco);
    System.out.println ("O ano de lançamento do livro é "+ano);
    }
    
    public void alteraTitulo(String novoTitulo) {
        titulo = novoTitulo;
    }
    
    public void alteraAutor(String novoAutor) {
        autor = novoAutor;
    }
    
    public void alteraAno(int novoAno) {
        ano = novoAno;
    }
    
    public void alteraEditora(String novoEditora) {
        editora = novoEditora;
    }
    
    public void alteraPreco(double novoPreco) {
        preco = novoPreco;
    }
    
    public void alteraSituacao(String novoSituacao) {
        situacao = novoSituacao;
    }
    
    public String mostraTitulo() {
        return titulo;
    }
    
    public String mostraAutor() {
        return autor;
    }
    
    public double mostraPreco() {
        return preco;
    }
    
    public int mostraAno() {
        return ano;
    }
    
    public String mostraEditora() {
        return editora;
    }
}