package aula12_05;

public class Materia {
    private int codigo;
    private String area;
    
    public Materia() {}
    
    public Materia(int codigo, String area) {
        this.codigo = codigo;
        this.area = area;
    }
    
    public void setArea(String area) {
        this.area = area;
    }
    
    public String getArea() {
        return area;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void mostraMateria(){
        System.out.println("Código: "+this.codigo);
        System.out.println("Área de estudo: "+this.area);
    }
}
