package lista7_vetor;

import java.util.Scanner;

public class FrequenciaElementos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        boolean[] contado = new boolean[10];
      
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = input.nextInt();
            contado[i] = false; 
        }

        System.out.println("\nFrequência dos elementos:");

       
        for (int i = 0; i < vetor.length; i++) {
            if (!contado[i]) {
                int freq = 1;
                for (int j = i+1; j < vetor.length; j++) {
                    if (vetor[i] == vetor[j]) {
                        freq++;
                        contado[j] = true; 
                    }
                }
                System.out.println(vetor[i] + " aparece " + freq + " vez(es)");
            }
        }
    }
}
