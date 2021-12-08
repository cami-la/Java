// Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.

package dio.natan;

import java.util.Scanner;

public class Ex8_Consoantes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quantConsoantes = 0;
        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                            letra.equalsIgnoreCase("i") ||
                                    letra.equalsIgnoreCase("o") ||
                                            letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                quantConsoantes++;
            }

            count++;

        } while (count < consoantes.length);

        System.out.println("Consoantes: ");

        for (String consoante : consoantes) {    // Uso do For Each
            if (consoante != null) {
                System.out.println(consoante + " ");
            }
        }

        System.out.println("Quantidade de consoantes: " + quantConsoantes);
        System.out.println(consoantes.length);

    }
}
