package lista11_matriz_cacaAoTesouro;

public class Jogador {

    private int x, y;
    private int pontos;
    private int movimentos;
    private boolean[][] visitado;

    public Jogador() {
        this.x = 0;
        this.y = 0;
        this.pontos = 0;
        this.movimentos = 0;
        this.visitado = new boolean[6][6];
        visitado[0][0] = true;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getPontos() { return pontos; }
    public int getMovimentos() { return movimentos; }

    public void mover(char direcao) {

        int novoX = x;
        int novoY = y;

        switch (direcao) {
            case 'w': novoX--; break;
            case 's': novoX++; break;
            case 'a': novoY--; break;
            case 'd': novoY++; break;
            default:
                System.out.println("Direção inválida!");
                return;
        }

        if (novoX < 0 || novoX >= 6 || novoY < 0 || novoY >= 6) {
            System.out.println("Movimento inválido! Parede do tabuleiro.");
            return;
        }

        x = novoX;
        y = novoY;

        movimentos++;
        visitado[x][y] = true;
    }

    public void adicionarPontos(int valor) {
        pontos += valor;
    }
}
