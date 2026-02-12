package lista13_batalha_naval;

public class BatalhaNaval {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Jogador 1");
        Jogador jogador2 = new Jogador("Jogador 2");

        jogador1.posicionarArmas();
        jogador2.posicionarArmas();

        while (true) {

            jogador1.mostrarTabuleiroAdversario();

            jogador1.atirar(jogador2); 
            if (jogador2.todasArmasAfundadas()) {
                System.out.println("JOGADOR 1 VENCEU!");
                break;
            }

            jogador1.atirar(jogador2);
            if (jogador2.todasArmasAfundadas()) {
                System.out.println("JOGADOR 1 VENCEU!");
                break;
            }

            jogador2.mostrarTabuleiroAdversario();

            jogador2.atirar(jogador1);
            if (jogador1.todasArmasAfundadas()) {
                System.out.println("JOGADOR 2 VENCEU!");
                break;
            }

            jogador2.atirar(jogador1);
            if (jogador1.todasArmasAfundadas()) {
                System.out.println("JOGADOR 2 VENCEU!");
                break;
            }
        }
    }
}
