package lista7_vetor;
import java.util.Scanner;

public class Posição {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];
        int x=0;
        boolean xd = false;

        for(int i=0;i < num.length; i++){
            System.out.print("digite um Numero"+(i+1)+": ");
            num[i] = scan.nextInt();
        }
        System.out.println("Digite um numero extra: ");
        x = scan.nextInt();

        for(int i=0; i<num.length; i++){
            if(num[i] == x){
                System.out.printf("valor %d está na posição %d\n",x,i);
                xd = true;
                break;
            }  
        }
        if(!xd){
            System.out.println("valor do vetor nao encontrado");
        }
    }
}
