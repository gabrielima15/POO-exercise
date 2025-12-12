package lista12_interface;

public class FretePadrao extends Frete implements Fretavel{
    
    public FretePadrao(int distanciaKM, double valorPorKM){
        super(distanciaKM, valorPorKM);
    }

    @Override
    public double calcularFrete(){
        return getDistanciaKM() * GetValorPorKM(); // aqui está o polimofismo.
    }
    
}
