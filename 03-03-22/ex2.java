/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_03;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        String nome;
        float salario, percent, novsal, valau;
        Scanner read = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nome = read.nextLine ();
        System.out.println("Informe seu salário: ");
        salario = read.nextFloat ();
        System.out.println("Informe seu percentual de aumento: ");
        percent = read.nextFloat ();
        novsal = salario * (1 + (percent / 100));
        valau = novsal - salario; // valor do aumento
        System.out.println("O seu nome é "+nome+", o seu antigo salário era de "+salario+"R$, e após passar pelo percentual de aumento de "+percent+"%, ele aumentou para "+novsal+", sofrendo assim um aumento de "+valau+"R$");
    }
}
