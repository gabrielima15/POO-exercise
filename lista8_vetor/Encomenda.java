package lista8_vetor;

public class Encomenda {
    private int codigo;
    private String destinatario,endereco,status;

    public Encomenda(int codigo,String destinatario,String endereco,String status){
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.endereco = endereco;
        this.status = status;
    }
    public int getcodigo(){
        return codigo;
    }
    public String Getdestinatario(){
        return destinatario;
    }
    public String Getendereco(){
        return endereco;
    }
    public String Getstatus(){
        return status;
    }
    public void setcodigo(int cod){
        codigo = cod;
    }
    public void Setdestinatario(String dest){
        destinatario = dest;
    }
    public void Setendereco(String ender){
        endereco = ender;
    }
    public void Setstatus(String Status){
        status = Status;
    }

    public void exibirInfo(){
        System.out.printf("destinatario: %s | Pacote codigo: %d | endereço: %s |  status: %s\n",destinatario,codigo,endereco,status);
    }

    public String atualizarStatus(String novoStatus) {
        return Getstatus();
    }
}
