package lista7_vetor;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoCrescente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];

        // Lendo os números
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            vetor[i] = input.nextInt();
        }

        // Ordenando em ordem crescente
        Arrays.sort(vetor);

        // Imprimindo o vetor ordenado
        System.out.println("\nVetor ordenado em ordem crescente:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}

