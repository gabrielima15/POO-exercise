package lista12_interface;

public class FreteExpresso extends Frete implements Fretavel{
    private int nivelUrgencia;

    public FreteExpresso(int distanciaKM,double valorPorKM,int nivelUrgencia){
        super(distanciaKM, valorPorKM);
        this.nivelUrgencia = nivelUrgencia;
    }

    public int getNivelUrgencia(){
        return nivelUrgencia;
    }

    @Override
    public double calcularFrete(){  // aqui está o polimofismo.
        return (getDistanciaKM() * GetValorPorKM()) + (nivelUrgencia * 100);
       
    }

    


    
}
