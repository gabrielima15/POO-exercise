package lista7_vetor;

import java.util.Scanner;

public class RotacaoDireita {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = 5; 
        int[] vetor = new int[N];

        
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            vetor[i] = input.nextInt();
        }

       
        int ultimo = vetor[N-1];

      
        for (int i = N-1; i > 0; i--) {
            vetor[i] = vetor[i-1];
        }

       
        vetor[0] = ultimo;

      
        System.out.println("\nVetor após rotação à direita:");
        for (int i = 0; i < N; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
