package lista9_heranca;

public class Main {
    public static void main(String[] args) {
        
        Mercado m = new Mercado();

        m.adicionarCliente(new RegulaCliente("joao",12.5));
        m.adicionarCliente(new VipCliente("Carlos", 150, "4566"));
        m.adicionarCliente(new OutroVipCliente("Ricardão", 5000, "21456", "rua do asfalto"));

        m.inprimirCliente();

        m.calcularTotal();
    }
}
