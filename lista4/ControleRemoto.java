package lista4;

public class ControleRemoto {

    private Televisor televisor;

    public ControleRemoto(Televisor televisor){
        this.televisor = televisor;
    }
    public void Ligar(){
        televisor.ligar();
    }
    public void Desligar(){
        televisor.desligar();
    }
    public void AumentarVolume(){
        televisor.aumentarVolume();
    }
    public void trocarCanal(int novoCanal){
        televisor.trocarCanal(novoCanal);
    }
    

}
