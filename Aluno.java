package aula05_05;

public class Aluno extends Pessoa {
    int matricula;
    String curso;
    double notas[];
    String rFinal;

    public Aluno() {
    }

    public Aluno(int matricula, String curso, String nome) {
        super(nome);
        this.matricula = matricula;
        this.curso = curso;
    }
    
    @Override
    public void mostraPessoa(){
        System.out.println("**** Mostrando dados do Aluno ****"); 
        super.mostraPessoa();
        System.out.println("Curso: "+this.curso);
        System.out.println("Matricula: "+this.matricula);
    }
    
    
}
