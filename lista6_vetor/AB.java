package lista6_vetor;

public class AB{
    public static void main(String[] args){
        int[] a  = {1,2,3,4,5};
        int[] b = new int[5];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            System.out.println(a[i]);
        }
        
        System.out.println("--".repeat(20));

        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);
        }
    }
}