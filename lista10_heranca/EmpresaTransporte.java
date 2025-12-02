package lista10_heranca;

public class EmpresaTransporte {
    private Motorista[] motoristas;
    private int quant;

    public EmpresaTransporte(){
        this.motoristas = new Motorista[10];
        this.quant = 0;
    }

    public void cadastrarMotorista(Motorista motorista){
        if(quant < motoristas.length){
            motoristas[quant] = motorista;
            quant++;
        }
    }

    public Motorista pesquisarMotoristaPeloNome(String nome){
        for (int i = 0; i < quant; i++) {
            if(motoristas[i] != null && motoristas[i].getNome().equals(nome)){
                return motoristas[i];
            }            
        }
        return null;
    }

    public Motorista excluirMotoristaPeloNome(String nome){
        int indice = -1;
        for (int i = 0; i < quant; i++) {
            if (motoristas[i] != null && motoristas[i].getNome().equals(nome)) {
                indice = i;
                break;
            }
        }
        if (indice == -1) {
            System.out.println("Motorista não existe: " + nome);
            return null;
        }
        Motorista removido = motoristas[indice];

        for (int j = indice; j < quant - 1; j++) {
            motoristas[j] = motoristas[j + 1];
        }

        motoristas[quant - 1] = null;
        quant--;

        return removido;
    }

    // Retorna o valor total a ser pago a todos os motoristas;
    public double calcularPagamentoTotal(){
        double valor = 0;
        for(int i=0; i<quant; i++){
            if(motoristas[i] != null){
                valor += motoristas[i].valorCorrida();
            }
        }
        System.out.printf("valor total a pagar é: %.2f\n",valor);
        return valor;
    }

    public void gerarRelatorioMotoristas(){
        for (int i = 0; i < quant; i++) {
            System.out.println(motoristas[i].toString());
        }
    }
}
