package lista9_heranca;

public class RegulaCliente extends Cliente{

    public RegulaCliente(String nome, double valorDaCompra){
        super(nome,valorDaCompra);
    }
    
    @Override
    public double calcularPagamento(){
        return  getValorDaCompra();
    }
}
