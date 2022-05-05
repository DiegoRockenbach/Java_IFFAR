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
public class ex5 {
    public static void main(String[] args) {
        double valfinal, valfabrica, valdistribuidor, imposto;
        String modelo;
        Scanner read = new Scanner(System.in);
        System.out.println("Informe o modelo de seu carro:");
        modelo = read.nextLine ();
        System.out.println("Informe o seu custo de fábrica:");
        valfabrica = read.nextDouble ();
        imposto = valfabrica * 0.45;
        valdistribuidor = valfabrica * 0.28;
        valfinal = valfabrica + imposto + valdistribuidor;
        System.out.println("O modelo de seu carro é "+modelo+", com um valor de fábrica de "+valfabrica+", um valor de impostos de "+imposto+", um valor de distribuidor de "+valdistribuidor+", e um custo final de "+valfinal);
    }
}
