public class Calculadora
{
    double a;
    double b;
    double result;
    
    public void setA(double a) {
        this.a = a;
    }
    
    public void setB(double b) {
        this.b = b;
    }
    
    public Calculadora (int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public Calculadora (){}
    
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
    
    public double getResult() {
    return this.result;
    }
}