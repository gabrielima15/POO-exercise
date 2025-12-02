package lista10_heranca;

public abstract class Motorista {
    private String nome;
    private int numCorrida;
    private double valorArrecadado;

    public Motorista(String nome,int numCorrida,double valorArrecadado){
        this.nome = nome;
        this.numCorrida =  numCorrida;
        this.valorArrecadado = valorArrecadado;
    }
    public String getNome() {
        return nome;
    }

    public void SetNome(String nome) {
        this.nome = nome;
    }

    public int GetNumCorrida() {
        return numCorrida;
    }

    public void SetNumCorrida(int numCorrida) {
        this.numCorrida = numCorrida;
    }

    public double GetValorArrecadado() {
        return valorArrecadado;
    }


    public void SetValorArrecadado(double valorArrecadado) {
        this.valorArrecadado = valorArrecadado;
    }


    public abstract double valorCorrida();

    @Override
    public String toString(){
        return String.format("Motorista: %s | corridas feitas: %d | arrecadando %.2f",
        nome,numCorrida,valorArrecadado);
    }
    
}
