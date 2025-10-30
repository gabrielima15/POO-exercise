public class MultC {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[10];
        int[] c = new int[10];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            c[i] = a[i]*b[i];
            System.out.println(a[i]);
        }
        System.out.println("-=-=".repeat(25));

        for(int i=0;i < a.length;i++){

            System.out.println(b[i]);
        }
        System.out.println("-=-=".repeat(25));

        for (int i = 0; i < a.length; i++) {
            System.out.println(c[i]);
        }
    }
}
