package aula12_05;

public class Matematica extends Materia {
    public int cargahora;
    public String turno;
    public int discentes;
    public String docente;

    public Matematica() {}
    
    public Matematica(int cargahora, String turno, int discentes, String docente) {
        this.cargahora = cargahora;
        this.turno = turno;
        this.discentes = discentes;
        this.docente = docente;
    }
    
    public void setCargahora(int cargahora) {
        this.cargahora = cargahora;
    }
    
    public int getCargahora() {
        return cargahora;
    }
    
    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public String getTurno() {
        return turno;
    }
    
    public void setDiscentes(int discentes) {
        this.discentes = discentes;
    }
    
    public int getDiscentes() {
        return discentes;
    }
    
    public void setDocente(String docente) {
        this.docente = docente;
    }
    
    public String getDocente() {
        return docente;
    }
    
    public void mostraMateria(){
        System.out.println("** Mostrando dados da matéria de Matemática **"); 
        super.mostraMateria();
        System.out.println("Carga horária: "+this.cargahora);
        System.out.println("Turno(manhã/tarde/noite): "+this.turno);
        System.out.println("Número de discentes: "+this.discentes);
        System.out.println("Docente: "+this.docente);
    }
}
