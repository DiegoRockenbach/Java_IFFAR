public class Lampada
{
    boolean estado;
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    
    public boolean getEstado(){
        return this.estado;
    }
    
    public Lampada (){}
    
    public Lampada (boolean estado) {
        this.estado = estado;
    }
    public void mostraEstado() {
        if (estado == true) {
            System.out.println ("Lâmpada ligada! :D");
        }
        else {
            System.out.println ("Lâmpada desligada!:(");
        }
    }
}
