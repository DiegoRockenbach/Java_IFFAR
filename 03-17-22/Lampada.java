public class Lampada
{
    boolean estado;
    
    public void desliga() {
        estado = false;
    }
    
    public void liga() {
        estado = true;
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
