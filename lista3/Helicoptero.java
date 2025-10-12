public class Helicoptero {
    
    private boolean ligado;
    private double altura;
    private int capacidade,pessoa;

    public Helicoptero(int capacidade){
        this.ligado = false;
        this.altura = 0;
        this.capacidade = capacidade;
        this.pessoa = 0;
    }
    public boolean getligado(){
        return ligado;
    }
    public double getaltura(){
        return altura;
    }
    public int getcapacidade(){
        return capacidade;
    }
    public int getpessoa(){
        return pessoa;
    }
    public void setligado(boolean Ligado){
        this.ligado = Ligado;
    }
    public void setaltura(double Altura){
        this.altura = Altura;
    }
    public void setcapacidade(int Capacidade){
        this.capacidade = Capacidade;
    }
    public void setpessoa(int Pessoas){
        this.pessoa = Pessoas;
    }

    public void entrar(){
            if(pessoa < capacidade){
                pessoa++;
                System.out.println("pessoa adicionada,quantidade:" + pessoa);

            }else{
                System.out.println("acesso Negado, excesso de peso.");
            }
    }
    public void sair(){
        if(pessoa > 0){
            pessoa--;
            System.out.println("pessoa removida, quantidade:" + pessoa);

        }else{
            System.out.println("nenhuma pessoas nos bancos.");
        }
       
    }
    public void ligar(){
        if(!ligado){
            ligado = true;
            System.out.println("ligando o Helicóptero");
        }else{
            System.out.println("O helicóptero já está ligado.");
        }
    }
    public void Decolar(){
        if(ligado){
            if(altura == 0){
                altura++;
                System.out.println("dando partida");
            }else{
                System.out.println("O helicóptero já está no ar");
            }
        }else{
            System.out.println("Não é possivel decolar com o helicóptero desligado");
        }
    }

    public void aterrissar(){
        if(ligado){
            if(this.ligado == true && this.altura > 0){
                System.out.println("aterrizando o Helicóptero");
                this.altura--;
            }else if(altura == 0){
                System.out.println("Helicoptero já está no Solo");
            }else{
                System.out.println("Helicóptero Desligado.");
            }
        }
    }

    public void Desligar(){
        if(ligado && altura == 0){
            ligado = false;
            System.out.println("desligando o Helicóptero.");
        }else if(altura > 0){
            System.out.println("Helicóptero ainda ligado.");
        }else{
            System.out.println("Helicoptero já está Desligado.");
        }
    }
    public String toString(){
        String estado = ligado ? "ligado" : "desligado";
        return String.format("o Helicoptero está %s tem %d pessoas com %.0f de altura com a capacidade de %d.",estado,pessoa,altura,capacidade);
    }
}