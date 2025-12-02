package lista10_heranca;

public class Iniciante extends Motorista{

    public Iniciante(String nome,int numCorrida,double valorArrecadado){
        super(nome,numCorrida,valorArrecadado);
    }

    @Override
    public double valorCorrida(){
        double valor = GetValorArrecadado() * 0.7;
        return valor;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
