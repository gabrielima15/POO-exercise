package lista10_heranca;

public class Elite extends Experiente{
    private int corridaPremio;

    public Elite(String nome,int numCorrida,double valorArrecadado,double avaliacao,int corridaPremio){
        super(nome, numCorrida, valorArrecadado, avaliacao);
        this.corridaPremio = corridaPremio;
    }

    public int getCorridaPremio() {
        return corridaPremio;
    }

    public void SetCorridaPremio(int corridaPremio) {
        this.corridaPremio = corridaPremio;
    }
    

    public double extraPlus(){
        double money = 0;
        for (int i = 0; i < corridaPremio; i++) {
            money += 5;
        }
        return money;
    }
    
    @Override
    public double extra(){
        if(getAvaliacao() > 4.6){
            return valorCorrida() * 0.5;
        }
        return 0;
    }

    @Override
    public double valorCorrida(){
        return GetValorArrecadado() * 0.8;
    }

    @Override
    public String toString(){
        return super.toString() + String.format(" | Corridas Premius: %d | valor por Premiu: %.2f",corridaPremio,extraPlus());
    }
}
