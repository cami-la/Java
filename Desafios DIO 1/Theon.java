import java.util.Scanner;

public class Theon {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();
        int T;
        int menor = 0;
        int posMenor = 0;
        int i;

        for (i = 1; i <= N; i++) {
            T = leitor.nextInt();

            if (i == 1) {
                posMenor = 1;
                menor = T;
            }else if (T < menor) {
                posMenor = i;
                menor = 1;
            }
        }

        System.out.println(posMenor);

    }

}