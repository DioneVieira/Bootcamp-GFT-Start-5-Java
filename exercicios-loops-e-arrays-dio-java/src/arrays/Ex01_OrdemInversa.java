package arrays;
/* Crie um vetor de 6 números inteiros
e mostre ana ordem inversa.
 */
import java.util.Scanner;

public class Ex01_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.println("Vetor: ");
        int count = 0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.print("\nVetor: ");
        for (int i = (vetor.length -1); i >= 0; i --) {
            System.out.print(vetor[i] + " ");
        }

    }
}
