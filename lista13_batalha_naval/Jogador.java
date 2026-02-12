package lista13_batalha_naval;

import java.util.Scanner;

public class Jogador {

    private String nome;
    private char[][] meuJogo;
    private char[][] jogoDoAdversario;
    private static final int tam = 8;

    public Jogador(String nome) {
        this.nome = nome;
        meuJogo = new char[tam][tam];
        jogoDoAdversario = new char[tam][tam];
        inicializarTabuleiros();
    }

    private void inicializarTabuleiros() {
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                meuJogo[i][j] = '~';          
                jogoDoAdversario[i][j] = '~';  
            }
        }
    }

    public String getNome() {
        return nome;
    }

   
    public void posicionarArmas() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n" + nome + " - Posicione suas armas:");

        posicionarTipoArma(sc, 's', 3);
        posicionarTipoArma(sc, 'c', 2);
        posicionarTipoArma(sc, 'p', 1);
    }

    private void posicionarTipoArma(Scanner sc, char tipo, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe linha e coluna da arma (" + tipo + "): ");
            int linha = sc.nextInt();
            int coluna = sc.nextInt();
            meuJogo[linha][coluna] = tipo;
        }
    }

    public void atirar(Jogador adversario) {
        Scanner sc = new Scanner(System.in);

        System.out.println(nome + " - Informe linha e coluna do tiro:");
        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        boolean acertou = adversario.verificarSeAcertou(linha, coluna);
        registrarTiro(linha, coluna, acertou);

        if (acertou) {
            System.out.println(">>> ACERTOU UMA ARMA!");
        } else {
            System.out.println(">>> Acertou apenas ÁGUA!");
        }
    }

    public boolean verificarSeAcertou(int linha, int coluna) {
        if (meuJogo[linha][coluna] == 's' ||
            meuJogo[linha][coluna] == 'c' ||
            meuJogo[linha][coluna] == 'p') {

            meuJogo[linha][coluna] = 'X'; 
            return true;
        }
        return false;
    }

    public void registrarTiro(int linha, int coluna, boolean acertou) {
        if (acertou) {
            jogoDoAdversario[linha][coluna] = 'X';
        } else {
            jogoDoAdversario[linha][coluna] = 'O';
        }
    }

    public boolean todasArmasAfundadas() {
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (meuJogo[i][j] == 's' ||
                    meuJogo[i][j] == 'c' ||
                    meuJogo[i][j] == 'p') {
                    return false;
                }
            }
        }
        return true;
    }

    public void mostrarTabuleiroAdversario() {
        System.out.println("\nTabuleiro de tiros de " + nome);
        System.out.print("  ");
        for (int i = 0; i < tam; i++)
            System.out.print((i+1) + " ");
        System.out.println();

        for (int i = 0; i < tam; i++) {
            System.out.print(" "+"A B C D E F G H"+" ");
            for (int j = 0; j < tam; j++) {
                System.out.print(jogoDoAdversario[i][j] + " ");
            }
            System.out.println();
        }
    }
}
