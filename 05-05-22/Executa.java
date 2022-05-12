/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_05;

/**
 *
 * @author iffar
 */
public class Executa {
    public static void main(String[] args) {
        Aluno alun1;
        Professor prof1;
        Pessoa pess1;
        alun1 = new Aluno(54354354, "ADM", "Ana");//instanciar
        prof1 = new Professor(58409689, "História", "Órson");
        pess1 = new Pessoa("Cleitom");
        alun1.mostraPessoa();
        pess1.mostraPessoa();
        prof1.mostraPessoa();
        
    }
}
