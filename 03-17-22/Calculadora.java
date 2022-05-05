public class Calculadora
{
    double a;
    double b;
    double result;
    
    public void lerA(double a) {
        this. a = a;
    }
    
    public void lerB(double b) {
        this. b = b;
    }
    
    public void somar() {
    result = a + b;
    }
    
    public void subtrair() {
    result = a - b;
    }
    
    public void dividir() {
    result = a / b;
    }
    
    public void multiplicar() {
    result = a * b;
    }
    
    public double mostrarResultado() {
    return result;
    }
}