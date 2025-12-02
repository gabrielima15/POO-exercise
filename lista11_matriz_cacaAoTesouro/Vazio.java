package lista11_matriz_cacaAoTesouro;

public class Vazio extends ElementoTabuleiro{

    @Override
    public int interagir(){
        return 0;
    }
    @Override
    public String simbolo(){
        return "⬜";
    }
}
