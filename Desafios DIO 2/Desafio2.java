package dio.exemplos;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0 ; i<n ; i++) {
            int x = sc.nextInt();
            double resultado = (Math.pow(2,x) - 1) / 12000;
            System.out.printf("%d kg\n",(long) resultado);
        }

        sc.close();

    }
}