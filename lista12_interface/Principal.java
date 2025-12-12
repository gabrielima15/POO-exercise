package lista12_interface;

public class Principal {
    public static void main(String[] args) {
        CadastroFrete frete = new CadastroFrete();

        frete.adicionarFrete(new FretePadrao(12, 20));
        frete.adicionarFrete(new FreteExpresso(15, 19, 22));
        frete.adicionarFrete(new FreteSuperExpresso(30, 40, 10, 100));
        
        frete.valorTotalFrete();

    }
}
