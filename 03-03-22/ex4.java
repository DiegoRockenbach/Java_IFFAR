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
public class ex4 {
    public static void main(String[] args) {
        float raio, area;
        Scanner read = new Scanner(System.in);
        System.out.println("Informe o raio do círculo");
        raio = read.nextFloat ();
        area = (float) 3.1415 *(raio*raio);
        System.out.println("A área do círculo é de "+area);
    }
}
