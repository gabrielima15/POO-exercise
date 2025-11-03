package lista7_vetor;
import java.util.Scanner;

public class RemoverDuplicados {
    public static void main(String[] args) {
        int[] num = new int[5];
        int[] notdouble = new int[5];
        int quant = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            num[i] = input.nextInt();

            boolean encontrar = false;

            for (int j = 0; j < quant; j++) {
                if (num[i] == notdouble[j]) {
                    encontrar = true;
                    break;
                }
            }

            if (!encontrar) {
                notdouble[quant] = num[i];
                quant++;
            }
        }

        System.out.println("\nVetor original:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println("\n\nVetor sem duplicados:");
        for (int i = 0; i < quant; i++) {
            System.out.print(notdouble[i] + " ");
        }
    }
}
