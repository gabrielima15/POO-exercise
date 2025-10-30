import java.lang.Math;
public class RaizQuadrada {
     public static void main(String[] args) {
        double[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        double[] b = new double[15];

        for (int i = 0; i < a.length; i++) {
            b[i] = Math.sqrt(a[i]);

            System.out.println(a[i]);
        }

        System.out.println("-=".repeat(50));

        for(int i = 0; i < a.length; i++){
            System.out.printf("%.2f\n",b[i]);
        }
    }
}
