package lista1;

public class MainFitaVideo {
    public static void main(String[] args){

        FitadeVideo fita1 = new FitadeVideo("A Múmia", 12.5);
        FitadeVideo fita2 = new FitadeVideo("Piratas do caribre", 10.7);

        
        System.out.println(fita1.toString());
        System.out.println("o valor do dia é: "+ fita1.getValorAluguel(5));

        System.out.println(fita2.toString());
        System.out.println("o valor do dia é: "+ fita2.getValorAluguel(10));
    }
}
