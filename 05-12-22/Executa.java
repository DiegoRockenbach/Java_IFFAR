package aula12_05;

public class Executa {
    public static void main(String[] args) {
        Fisica fisi1;
        Matematica matm1;
        Materia mater1;
        fisi1 = new Fisica(30, "Manhã", 33, "Thiago");//instanciar
        matm1 = new Matematica(50, "Tarde", 25, "Alan");
        mater1 = new Materia(123321, "Exatas");
        fisi1.mostraMateria();
        matm1.mostraMateria();
        mater1.mostraMateria();
    }
}
