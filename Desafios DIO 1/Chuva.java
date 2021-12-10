import java.io.IOException;
import java.util.Scanner;

public class Chuva {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();
        int casaComprado = 0;
        int casaSobrando = 0;
        int trabComprado = 0;
        int trabSobrando = 0;
        String[] linha;
        String SD, SN;

        leitor.nextLine();

        for (int i = 0; i < N; i++) {

            linha = leitor.nextLine().split(" ");
            SD = linha[0];
            SN = linha[1];

            if (SD.equals("chuva")) {

                if (casaSobrando > 0) {
                    casaSobrando--;
                }
                else {
                    casaComprado++;
                }
                trabSobrando++;
            }

            if (SN.equals("chuva")) {
                if (trabSobrando > 0) {
                    trabSobrando--;
                }
                else {
                    trabComprado++;
                }
                casaSobrando++;
            }
        }

        System.out.println(casaComprado + " " + trabComprado);
    }
}