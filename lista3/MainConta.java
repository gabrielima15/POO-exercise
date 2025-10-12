public class MainConta {
    
    public static void main(String[]args){

        Conta c1 = new Conta(35678539, "Carlos");
        Conta c2 = new Conta(56792314, "Julia");
        Conta c3 = new Conta(44470982, "Mariana");

        System.out.println("---".repeat(20));
        c1.exibir();
        c1.Depositar(300);
        c1.exibir();
        c1.setnome("Julius");
        c1.Sacar(100);
        c1.exibir();
        c1.Desativar();
        c1.exibir();
        
        System.out.println("---".repeat(20));
        c2.exibir();
        c2.Depositar(500);
        c2.exibir();
        c2.setnome("Maria");
        c2.Sacar(250);
        c2.exibir();
        c2.Desativar();
        c2.exibir();

        System.out.println("---".repeat(20));
        c3.exibir();
        c3.Depositar(800);
        c3.exibir();
        c3.setnome("Luiza");
        c3.Sacar(400);
        c3.exibir();
    }
}
