package lista7_vetor;
import java.util.Scanner;

public class IntercalarVetores {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite o Numero para o A" + (i+1) + ": ");
            a[i] = input.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print("Digite o Numero para o B" + (i+1) + ": ");
            b[i] = input.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            c[2*i] = a[i];
            c[2*i + 1] = b[i];
        }

        System.out.println("\nVetor intercalado:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
