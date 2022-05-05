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
public class ex3 {
    public static void main(String[] args) {
        float base, altura, area;
        Scanner read = new Scanner(System.in);
        System.out.println("Informe a base do triângulo:");
        base = read.nextFloat ();
        System.out.println("Informe a altura do triângulo:");
        altura = read.nextFloat ();
        area = (base*altura) /2;
        System.out.println("A área do triângulo é de "+area);
    }
}
