public class MainPorta {
    public static void main(String[] args){
        Porta porta = new Porta("Vermelho", 5.7, "aberta", 8.3);
        System.out.printf(porta.toString());

        System.out.println("------------------------------------------------------------------");

        porta.setCor("Azul");
        porta.setAltura(12.5);
        porta.setlargura(3.7);
        porta.setEstaAberta("Não Aberta");
        System.out.printf(porta.toString());
    }
}
