package lista7_vetor;

import java.util.Scanner;

public class RotacaoDireita {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = 5; // você pode mudar para o tamanho que quiser
        int[] vetor = new int[N];

        // Lendo os números
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            vetor[i] = input.nextInt();
        }

        // Guardando o último elemento
        int ultimo = vetor[N-1];

        // Movendo todos os elementos uma posição para a direita
        for (int i = N-1; i > 0; i--) {
            vetor[i] = vetor[i-1];
        }

        // Colocando o último elemento na primeira posição
        vetor[0] = ultimo;

        // Imprimindo o vetor rotacionado
        System.out.println("\nVetor após rotação à direita:");
        for (int i = 0; i < N; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
