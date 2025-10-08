package lista1;
public class FitadeVideo {

    private String titulo;
    private double preco;

    public FitadeVideo(String titulo, double preco){
        this.titulo = titulo;
        this.preco = preco;
    }
    public String getTituloFita(){
        return titulo;
    }
    public double getPrecoPorDia(){
        return preco;
    }

    public double getValorAluguel(int numeroDeDiasAlugada) {
        return preco*numeroDeDiasAlugada;
    }
    public String toString(){
        return String.format("A fita é %s com o valor de: %.2f\n",titulo,preco);
    }

}
