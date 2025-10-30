import java.util.Scanner;
public class Somatoria {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int[] a = new int[10];
        int soma = 0;

        System.out.println("Digite 10 numeros inteiros:");

        for(int i=0;i< a.length;i++){
            System.out.println("Numero"+(i+1)+":");
            a[i] = imput.nextInt();
            soma += a[i];

        }
        System.out.println("A soma total do vetor é "+ soma);
        
    }
}
