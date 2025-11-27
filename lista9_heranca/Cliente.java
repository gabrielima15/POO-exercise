package lista9_heranca;

public abstract class Cliente {
    private String nome;
    private double valorDaCompra;


    public Cliente(String nome,double valorDaCompra){
        this.nome = nome;
        this.valorDaCompra = valorDaCompra;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }

    public abstract double calcularPagamento();

    public double valorDaCompra(){
        return getValorDaCompra();
    }

    @Override
    public String toString(){
        return String.format("nome: %s | Valor a Pagar: %.2f",getNome(),getValorDaCompra());
    }
    
}
