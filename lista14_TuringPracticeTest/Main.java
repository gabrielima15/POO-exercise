package lista14_TuringPracticeTest;

import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Solucao s = new Solucao();
        Scanner input = new Scanner(System.in);

        int i =0;
        while (true) {
            
            System.out.print("Digite o "+(i+1)+"° caractere: ");
            String valor = input.nextLine().toUpperCase();
            i++;
            s.adicionar(valor);
            s.verificar(valor);
            System.out.print("deseja continuar? [S/N]: ");
            String v = input.nextLine().toUpperCase();

            if(v.equals("N")){
                break;
            }

            
        }
        s.listar();
        input.close();
    }
}
