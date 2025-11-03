package lista7_vetor;
import java.util.Scanner;

public class ContarOcorrencias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int x, contador = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = input.nextInt();
        }

        System.out.print("Digite o número X: ");
        x = input.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                contador++;
            }
        }

        System.out.println("O número " + x + " aparece " + contador + " vez(es) no vetor.");
    }
}
