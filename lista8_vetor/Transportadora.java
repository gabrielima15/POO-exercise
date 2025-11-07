package lista8_vetor;

public class Transportadora {
    private Encomenda[] encomendas;
    private int quant;

    public Transportadora(){
        this.encomendas = new Encomenda[10];
        this.quant = 0;
    }

    public void adicionarEncomenda(Encomenda encomenda){
            if(quant < encomendas.length){
                encomendas[quant] = encomenda;
                quant++;
            }
    }

    public void listarEncomendas(){
        System.out.println("=== Lista de Pacotes ===");
        for(int i=0; i< encomendas.length; i++){
            if(encomendas[i] != null){
                encomendas[i].exibirInfo();
            }
        }
    }

    public Encomenda buscarPorCodigo(int codigo){
        for (int i = 0; i < encomendas.length; i++) {
            if(encomendas[i] != null && encomendas[i].getcodigo() == codigo){
                return encomendas[i];
            }
        }
        return null;
    }
}
