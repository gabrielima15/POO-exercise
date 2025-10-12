package lista4;

public class MainTV {
    public static void main(String[] args){
        Televisor tv = new Televisor(5, 10, false);
        ControleRemoto controle = new ControleRemoto(tv);

        System.out.println(tv);
        controle.Ligar();

        controle.AumentarVolume();
        controle.AumentarVolume();

        controle.trocarCanal(12);

        System.out.println(tv);
    }
}
