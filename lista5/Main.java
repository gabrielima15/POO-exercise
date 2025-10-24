package lista5;
public class Main {
    public static void main(String[]args){
        Guerreiro G1 = new Guerreiro(3251,"Carlos");
        Guerreiro G2 = new Guerreiro(02467,"Bruno");

        System.out.println("-=-".repeat(20));
        System.out.println("Início da Luta entre " + G1.getnome() + " e " + G2.getnome() + "!");
        System.out.println("-=-".repeat(20));
        G1.lutar(G2);
        // G1.lutarecursiva(G2);
        System.out.println("Fim da Luta!");
        System.out.println("-=-".repeat(20));
        System.out.println(G2.toString());
        System.out.println(G1.toString());
        System.out.println("-=-".repeat(20));
        
    }
}