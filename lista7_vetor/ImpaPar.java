package lista7_vetor;

public class ImpaPar {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] impar = new int[10];
        int[] par = new int[10];
        int contPar=0,contImpar=0;

        for(int i=0; i < a.length; i++){
            if(a[i]%2 == 0){
                par[contPar] = a[i];
                contPar++;
            }
            if(a[i]%2 ==1){
                impar[contImpar] = a[i];
                contImpar++;
            }
        }
        System.out.println("numeros pares");
        for (int i = 0; i < a.length; i++) {
            System.out.println(par[i]+" ");
        }
        System.out.println("numeros pares");
        for (int i = 0; i < a.length; i++) {
            System.out.println(par[i]+" ");
        }
    }
}
