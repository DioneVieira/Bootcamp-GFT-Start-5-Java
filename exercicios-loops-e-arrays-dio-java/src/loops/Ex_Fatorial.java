package loops;
/* Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuario.
Ex.: 5!= 120 (5 x 4 x 3 x 2 x 1)
 */
import java.util.Scanner;

public class Ex_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicao = 1;

        System.out.print(fatorial +" ! = ");
        for(int i = fatorial ; i >= 1 ; i --) {
            multiplicao = multiplicao * i;
        }

        System.out.println(multiplicao);


    }
}
