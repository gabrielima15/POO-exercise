class multiplicar {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5,6,7,8};
        int[] B = new int[8];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i]*2;
            System.out.println(A[i]);
        }
        
        System.out.println("-=".repeat(20));

        for (int i = 0; i < A.length; i++) {
            System.out.println(B[i]);
        }
    }
}
