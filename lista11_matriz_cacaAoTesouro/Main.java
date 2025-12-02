package lista11_matriz_cacaAoTesouro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Jogo jogo = new Jogo();

        System.out.println("=== Caça ao Tesouro ===");
        System.out.println("Controles: w = cima, s = baixo, a = esquerda, d = direita");

        while (!jogo.acabou()) {

            jogo.exibirMapa();
            jogo.statusJogador();

            System.out.print("\nMover: ");
            char comando = sc.next().charAt(0);

            jogo.realizarJogada(comando);
        }

        System.out.println("\n🎉 PARABÉNS! Você encontrou todos os tesouros!");
    }
}
