package List.Exercicios_Propostos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class EP_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Float> temp_6meses = new ArrayList<Float>();
        float soma = 0F;

        for (int i = 1; i <= 6; i++) {

            System.out.println("Temperatura do Mês " + i + ": ");
            float temp = scanner.nextFloat();
            temp_6meses.add(temp);
            soma += temp;

        }

        float media_6meses = soma / temp_6meses.size();
        System.out.printf("Média Semestral das Temperaturas: %.2f\n", media_6meses + "°C");

        for (float temp : temp_6meses) {

            if (temp > media_6meses) {

                int indice = temp_6meses.indexOf(temp);

                switch (indice) {
                    case 0:
                        System.out.println((indice + 1) + " - Janeiro: " + temp + "°C");
                        break;
                    case 1:
                        System.out.println((indice + 1) + " - Fevereiro: " + temp + "°C");
                        break;
                    case 2:
                        System.out.println((indice + 1) + " - Março: " + temp + "°C");
                        break;
                    case 3:
                        System.out.println((indice + 1) + " - Abril: " + temp + "°C");
                        break;
                    case 4:
                        System.out.println((indice + 1) + " - Maio: " + temp + "°C");
                        break;
                    case 5:
                        System.out.println((indice + 1) + " - Junho: " + temp + "°C");
                        break;

                }

            }

        }

    }
}

/*
public class ExercicioProposto01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturasSemestral = new ArrayList<Double>();
        double soma = 0.0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("Qual a temperatura do mês " + i + ": ");
            double temp = scan.nextDouble();
            temperaturasSemestral.add(temp);
            soma += temp;
        }
        double mediaTemperaturasSemenstral = soma/temperaturasSemestral.size();
        System.out.println("Temperaturas Semestral: " + temperaturasSemestral);
        System.out.println("Média temperaturas Semestral: " + mediaTemperaturasSemenstral + "oC");
        System.out.println("----------");
        for (Double temp : temperaturasSemestral) {
            if(temp > mediaTemperaturasSemenstral) {
                int index = temperaturasSemestral.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println((index + 1) + " - JANEIRO: " + temp + " oC");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp+ " oC");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp+ " oC");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp+ " oC");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp+ " oC");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp+ " oC");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
*/