package lista8_vetor;

public class MainPacote {
    public static void main(String[] args){
        Transportadora transporte = new Transportadora();

        // Encomenda pacote1 = new Encomenda();
        transporte.adicionarEncomenda(new Encomenda(143, "Jão", "rua da goiaba", "Em andamento"));
        Encomenda pacote2 = new Encomenda(447, "Maria", "rua do zé", "saindo da exportadora");
        transporte.adicionarEncomenda(pacote2);
        Encomenda pacote3 = new Encomenda(652, "Mariana", "rua da cana", "saindo da exportadora");
        transporte.adicionarEncomenda(pacote3);
        Encomenda pacote4 = new Encomenda(333, "Julia", "rua da Maria", "chegou");
        transporte.adicionarEncomenda(pacote4);
        Encomenda pacote5 = new Encomenda(500, "Carlos", "rua do Mario", "En andamento");
        transporte.adicionarEncomenda(pacote5);

        transporte.listarEncomendas();

    }
}
