package lista9_heranca;


public class ClienteOuroVip extends ClienteVip{
    private String endereco;

    public ClienteOuroVip(String nome,double valorDaCompra,String numCartao,String endereco){
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

    @Override
    public String toString(){
        return super.toString()+String.format("| Endereço: %s\n",getEndereco());
    }
}
