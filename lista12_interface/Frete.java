package lista12_interface;

public abstract class Frete {

    private int distanciaKM;
    private double valorPorKM;

    public Frete(int distanciaKM,double valorPorKM){
        this.distanciaKM = distanciaKM;
        this.valorPorKM = valorPorKM;
    }

    public int getDistanciaKM() {
        return distanciaKM;
    }

    public double GetValorPorKM() {
        return valorPorKM;
    }



}
