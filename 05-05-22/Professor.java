package aula05_05;

public class Professor extends Pessoa {
    int codigo;
    String nome;
    String materia;
    
    public Professor(){}
    
    
    public Professor(int codigo, String materia, String nome) {
        super(nome);
        this.codigo = codigo;
        this.materia = materia;
    }
    
    @Override
    public void mostraPessoa(){
        System.out.println("**** Mostrando dados do Professor ****"); 
        super.mostraPessoa();
        System.out.println("Matéria: "+this.materia);
        System.out.println("Código: "+this.codigo);
    }
}
