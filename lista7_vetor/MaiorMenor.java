package lista7_vetor;
public class MaiorMenor {
    public static void main(String[] args){
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int max = num[0];
        int min = num[0];

        for(int i=1; i < num.length; i++){
            if(num[i] < min){
                min = num[i];  
            }
            if(num[i] > max){
                max = num[i];
            }
        }

        System.out.printf("maior Número é %d e o menor é %d.\n",max,min);
    }
}
