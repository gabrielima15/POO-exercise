package lista11_matriz_cacaAoTesouro;

public class Armadilha extends ElementoTabuleiro{
    
    @Override
    public int interagir(){
        return -2;
    }
    @Override
    public String simbolo(){
        return "💣";
    }
}
