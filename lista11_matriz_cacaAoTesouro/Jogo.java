package lista11_matriz_cacaAoTesouro;
import java.util.Random;

public class Jogo {

    private ElementoTabuleiro[][] mapa;
    private Jogador jogador;
    private int tesouros_restantes;

    public Jogo() {
        this.mapa = new ElementoTabuleiro[6][6];
        this.jogador = new Jogador();
        this.tesouros_restantes = 0;

        preencherMapa();
    }

    private void preencherMapa() {
        colocarTesouros(3);
        colocarArmadilhas(3);
        preencherVazios();
    }

    private void colocarTesouros(int quantidade) {
        Random r = new Random();
        int colocados = 0;

        while (colocados < quantidade) {
            int x = r.nextInt(6);
            int y = r.nextInt(6);

            if (mapa[x][y] == null && !(x == 0 && y == 0)) {
                mapa[x][y] = new Tesouro();
                colocados++;
            }
        }

        tesouros_restantes += quantidade;
    }

    private void colocarArmadilhas(int quantidade) {
        Random r = new Random();
        int colocados = 0;

        while (colocados < quantidade) {
            int x = r.nextInt(6);
            int y = r.nextInt(6);

            if (mapa[x][y] == null && !(x == 0 && y == 0)) {
                mapa[x][y] = new Armadilha();
                colocados++;
            }
        }
    }

    private void preencherVazios() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (mapa[i][j] == null) {
                    mapa[i][j] = new Vazio();
                }
            }
        }
    }

    public void realizarJogada(char comando) {

        int antesX = jogador.getX();
        int antesY = jogador.getY();

        jogador.mover(comando);

        // se não saiu do lugar, não interage
        if (antesX == jogador.getX() && antesY == jogador.getY()) {
            return;
        }

        int x = jogador.getX();
        int y = jogador.getY();

        ElementoTabuleiro elem = mapa[x][y];
        int pontos = elem.interagir();
        jogador.adicionarPontos(pontos);

        if (elem instanceof Tesouro) {
            tesouros_restantes--;
            mapa[x][y] = new Vazio(); // remove o tesouro depois de pegar
            System.out.println("Você encontrou um tesouro! +3 pontos!");
        }

        if (elem instanceof Armadilha) {
            System.out.println("Você caiu em uma armadilha! -2 pontos!");
        }
    }

    public void exibirMapa() {
        System.out.println("\n===== MAPA =====");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                if (jogador.getX() == i && jogador.getY() == j) {
                    System.out.print("🤠 ");
                } else {
                    System.out.print(mapa[i][j].simbolo() + " ");
                }
            }
            System.out.println();
        }
        System.out.println("================\n");
    }

    public boolean acabou() {
        return tesouros_restantes == 0;
    }

    public void statusJogador() {
        System.out.println("Pontos: " + jogador.getPontos());
        System.out.println("Movimentos: " + jogador.getMovimentos());
        System.out.println("Tesouros restantes: " + tesouros_restantes);
    }
}
