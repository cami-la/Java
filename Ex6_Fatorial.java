// Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
// Ex.: 5! = 120.

package dio.natan;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int multiplicacao = 1;
        System.out.println(fatorial + "! = ");

        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * 1;
        }

        System.out.println(multiplicacao);

    }
}
