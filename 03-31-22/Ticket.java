import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ticket {
    GregorianCalendar gc;
    SimpleDateFormat sdf;
    SimpleDateFormat formatoData;
    String zona;
    String veiculo;
    String saida;
    double valor;
    double troco;
    double moeda = 0;
    
    public void alteraMoeda(double novaMoeda){
        for(int i = 0; i < 1; i++){
            moeda = novaMoeda+moeda;
        }
    }
    
    public double calculaValor(){
        valor = moeda;
        if (valor < 0.5){
            System.out.println("Valor insuficiente!");
        }
        else if ((valor >= 0.5) && (valor < 1)){
            valor = 0.50;
        }
        else if ((valor >= 1) && (valor < 1.5)){
            valor = 1.00;
        }
        else if ((valor >= 1.5) && (valor < 2)){
            valor = 1.50;
        }
        else if (valor >= 2){
            valor = 2.00;
        }
        return valor;
    }
    
    public double calculaTroco(){
        valor = moeda;
        if ((valor >= 0.5) && (valor < 1)){
            troco = valor - 0.5;
        }else if ((valor >= 1) && (valor < 1.5)){
            troco = valor - 1;
        }else if ((valor >= 1.5) && (valor < 2)){
            troco = valor - 1.5;
        }else if (valor >= 2){
            troco = valor - 2;
        }else if (valor > 0.5){
            System.out.println("Valor insuficiente!");
        }
        return troco;
    }
    
    public void setZona(String zona){
        this.zona = zona;
    }
    
    public void setVeiculo(String veiculo){
        this.veiculo = veiculo;
    }
    
    public void zerarValores(){
        valor = 0;
        troco = 0;
        moeda = 0;
    }
    
    public void mostraTicket(){
        System.out.println("𝕄𝕦𝕟𝕚𝕔í𝕡𝕚𝕠 𝕕𝕖 𝔹𝕠𝕒 𝕍𝕚𝕤𝕥𝕒 𝕕𝕠 𝔹𝕦𝕣𝕚𝕔á");
        System.out.println("---𝕊𝕚𝕤𝕥𝕖𝕞𝕒 𝕄𝕦𝕟. 𝕕𝕖 𝕋𝕣â𝕟𝕤𝕚𝕥𝕠---\n");
        System.out.println("𝕋𝕚𝕔𝕜𝕖𝕥 𝕕𝕖 𝕖𝕤𝕥𝕒𝕔𝕚𝕠𝕟𝕒𝕞𝕖𝕟𝕥𝕠\n");
        System.out.println("Zona: "+zona);
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(new Date());
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data: "+formatoData.format(gc.getTime()));
        System.out.println("Veículo: "+veiculo);
        if (valor == 0.5){
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            System.out.println("Entrada: "+sdf.format(gc.getTime()));
            gc.add(Calendar.MINUTE, 30);
            System.out.println("Saída: "+sdf.format(gc.getTime()));
        }else if (valor == 1){
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            System.out.println("Entrada: "+sdf.format(gc.getTime()));
            gc.add(Calendar.HOUR, 1);
            System.out.println("Saída: "+sdf.format(gc.getTime()));
        }else if (valor == 1.5){
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            System.out.println("Entrada: "+sdf.format(gc.getTime()));
            gc.add(Calendar.HOUR, 1);
            gc.add(Calendar.MINUTE, 30);
            System.out.println("Saída: "+sdf.format(gc.getTime()));
        }else if (valor == 2){
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            System.out.println("Entrada: "+sdf.format(gc.getTime()));
            gc.add(Calendar.HOUR, 2);
            System.out.println("Saída: "+sdf.format(gc.getTime()));
        }
        if (valor >= 0.5){
            System.out.println("Valor: "+valor);
            System.out.println("Troco: "+troco);
        }else if (valor < 0.5){
            System.out.println("Valor não inserido ou insuficiente!");
        }
    }
}