package lista12_interface;

public class FreteSuperExpresso extends FreteExpresso implements Fretavel{
    private double valorSeguro;

    public FreteSuperExpresso(int distanciaKM,double valorPorKM,int nivelUrgencia,double valorSeguro){
        super(distanciaKM, valorPorKM,nivelUrgencia);
        this.valorSeguro = valorSeguro;
    }

    public double getValorSeguro(){
        return valorSeguro;
    }

    @Override
    public double calcularFrete(){ // aqui está o polimofismo.
        return (getDistanciaKM() * GetValorPorKM()) + (getNivelUrgencia()*100) + valorSeguro;
    }


}
