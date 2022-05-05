/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_03;

import java.util.Scanner;
/**
 *
 * @author rdieg
 */
public class ex6 {
    public static void main(String[] args) {
        double saldomedio, valcredito, valtotal;
        Scanner read = new Scanner(System.in);
        System.out.println("Informe seu saldo médio: ");
        saldomedio = read.nextDouble();
        if ((saldomedio >= 0) && (saldomedio <= 200)) {
            System.out.println("Você não está apto para receber nenhum crédito");
        }
        if ((saldomedio >= 201) && (saldomedio <= 400)) {
            valcredito = saldomedio * 0.20;
            valtotal = valcredito + saldomedio;
            System.out.println("Você recebeu 40% de crédito, tendo assim R$"+valcredito+", e totalizando "+valtotal);
        }
        if ((saldomedio >= 401) && (saldomedio <= 600)) {
            valcredito = saldomedio * 0.30;
            valtotal = valcredito + saldomedio;
            System.out.println("Você recebeu 40% de crédito, tendo assim R$"+valcredito+", e totalizando "+valtotal);
        }
        if (saldomedio >= 601) {
            valcredito = saldomedio * 0.40;
            valtotal = valcredito + saldomedio;
            System.out.println("Você recebeu 40% de crédito, tendo assim R$"+valcredito+", e totalizando "+valtotal);
        }
    }
}
