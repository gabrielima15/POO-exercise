package lista10_heranca;

public class Experiente extends Iniciante{
    private double avaliacao;

    public Experiente(String nome,int numCorrida,double valorArrecadado,double avaliacao){
        super(nome,numCorrida,valorArrecadado);
        this.avaliacao = avaliacao;
    }
    public double getAvaliacao(){
        return avaliacao;
    }
    public void SetAvaliacao(double av){
        avaliacao = av;
    }

    @Override
    public double valorCorrida(){
        return GetValorArrecadado() * 0.75;
    }


    public double extra(){
        if(avaliacao > 4.6){
            return valorCorrida() * 0.05;
        }
        return 0;
    }

    public double salarioFinal(){
        return valorCorrida() - GetValorArrecadado();
    }
    
    @Override
    public String toString(){
        return super.toString() + String.format("| Nota: %.2f | extra: %.2f",avaliacao,extra());
    }
}
