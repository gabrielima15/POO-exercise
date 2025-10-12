public class MainHelicoptero {
    public static void main(String[] args) {
        Helicoptero hel1 = new Helicoptero(6);
        Helicoptero hel2 = new Helicoptero(3);

        System.out.println("-------------------------------------------------------------\n");
        System.out.println(hel1.toString());
        hel1.entrar();
        hel1.ligar();
        hel1.Decolar();
        System.out.println(hel1.toString());
        hel1.aterrissar();
        hel1.Desligar();
        hel1.sair();
        System.out.println(hel1.toString());

        System.out.println("--------------------------------------------------------------------------------------------------\n");

        System.out.println(hel2.toString());
        hel2.entrar();
        hel2.ligar();
        hel2.Decolar();
        System.out.println(hel2.toString());
        hel2.aterrissar();
        hel2.Desligar();
        hel2.sair();
        System.out.println(hel2.toString());
    }
}
