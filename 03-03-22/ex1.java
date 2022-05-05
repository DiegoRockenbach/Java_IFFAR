/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_03;

import java.util.Scanner;

public class ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, n3, p1, p2, p3;
        float media;
        Scanner read = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        n1 = read.nextInt();
        System.out.println("Digite a nota 2: ");
        n2 = read.nextInt();
        System.out.println("Digite a nota 3: ");
        n3 = read.nextInt();
        System.out.println("Digite o peso da nota 1: ");
        p1 = read.nextInt();
        System.out.println("Digite o peso da nota 2: ");
        p2 = read.nextInt();
        System.out.println("Digite o peso da nota 3: ");
        p3 = read.nextInt();
        media = ((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3);
        System.out.println("A média ponderada das 3 notas é: "+media);
    }
}
