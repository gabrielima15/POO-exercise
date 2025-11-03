package lista7_vetor;

import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] a = new int[8];
        int max=0,soma=0;
        double media;
        
        for(int i=0; i<a.length; i++){
            System.out.print("Numero"+(i+1)+": ");
            a[i] = input.nextInt();
            soma += a[i];
        }
        media = (double)soma/a.length;
        if(a.length > media){
            max = a.length;
        }
        System.out.println("A media é "+ media + " e o maior valor é "+ max);
        
    }
}
