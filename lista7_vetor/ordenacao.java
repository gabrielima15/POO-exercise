package lista7_vetor;
import java.util.Scanner;

public class ordenacao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];

        for(int i=0;i<a.length;i++){
            System.out.print("Numero"+(i+1)+":");
            a[i] = scan.nextInt();
             
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
    }
}
