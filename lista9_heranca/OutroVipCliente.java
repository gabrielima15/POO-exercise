package lista9_heranca;


public class OutroVipCliente extends VipCliente{
    private String endereco;

    public OutroVipCliente(String nome,double valorDaCompra,String numCartao,String endereco){
        super(nome,valorDaCompra,numCartao);
        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String e){
        endereco = e;
    }

    @Override
    public double calcularPagamento(){
        double valor = getValorDaCompra() * 0.15;
        return getValorDaCompra() - valor;
    }
}
