package lista9_heranca;

public class Mercado{
    Cliente[] clientes;
    private int qtde;

    public Mercado(){
        this.clientes = new Cliente[10];
        this.qtde = 0;
    }

    public void adicionarCliente(Cliente c){
        if(qtde < clientes.length){
            clientes[qtde++] = c;
        }
    }
    public double calcularTotal(){
        double total=0;
        for(int i=0; i<qtde; i++){
            if(clientes[i] != null){
                total += clientes[i].calcularPagamento();
            }
        }
        System.out.printf("Valor Total dos Clientes é de %.2f\n",total);
        return total;
    }
    
    public void inprimirCliente(){
        for (int i = 0; i < qtde; i++) {
            System.out.println(clientes[i].toString());
        }
    }
}
