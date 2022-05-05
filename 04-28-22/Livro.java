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
    
    public Livro (String titulo, String autor, String editora, String situacao, double preco, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.situacao = situacao;
        this.preco = preco;
        this.ano = ano;
    }
    
    public Livro() {}
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public String getAutor() {
        return this.autor;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public int getAno() {
        return this.ano;
    }
    
    public String getEditora() {
        return this.editora;
    }
}