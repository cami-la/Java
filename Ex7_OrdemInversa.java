// Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.

package dio.natan;

public class Ex7_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};
        System.out.println("Vetor: ");
        int count = 0;

        while (count <= vetor.length - 1) {    // (count < (vetor.lenght)) opcional
            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor 2: ");

        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }

    }
}
