package lista9_heranca;

public class VipCliente extends Cliente{
    private String numCartao;

    public VipCliente(String nome, double valorDaCompra, String numCartao) {
        super(nome, valorDaCompra);
        this.numCartao = numCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    @Override
    public double calcularPagamento() {
        double valor = getValorDaCompra() * 0.1;
        return getValorDaCompra() - valor;
    }
}
