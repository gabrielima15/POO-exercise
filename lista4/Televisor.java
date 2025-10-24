package lista4;

public class Televisor {

    private int volume,canal;
    private boolean ligado;

    public Televisor(int canal,int volume,boolean ligado){
        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }

    public int getcanal(){
        return canal;
    }
    public int getvolume(){
        return volume;
    }
    public boolean getligado(){
        return ligado;
    }

    public void setcanal(int nCanal){
        this.canal = nCanal;
    }
    public void setvolume(int novoVolume){
        this.volume = novoVolume;
    }
    public void setligado(boolean novoLigado){
        this.ligado = novoLigado;
    }

    public void ligar(){
        if(ligado == false){
            ligado = true;
            System.out.println("ligando a TV");
        }else{
            System.out.println("TV já ligada");
        }
    }

    public void desligar(){
        if(ligado){
            ligado = false;
            System.out.println("televisor desligado");
        }else{
            System.out.println("A TV já está ligada");
        }
    }

    public void aumentarVolume(){
        if(ligado){
            if(volume < 100){
                volume++;
            }else{
                System.out.println("volume máximo");
            }
        }else{
            System.out.println("A TV já está desligada");
        }
    }

    public void diminuirVolume(){
        if(ligado){
            if(volume > 0){
                volume--;
            }else{
                System.out.println("volume mínimo");
            }
        }else{
            System.out.println("não é possivel ajustar o volume da TV desligada");
        }
    }

    public void trocarCanal(int novoCanal){
        if(ligado){
            canal = novoCanal;
            System.out.println("canal mudado para o "+ canal);
        }else{
            System.out.println("TV está desligada");
        }
    }
    @Override
     public String toString(){
        return String.format("A televisão está %b no canal %d no volume %d",ligado,canal,volume);
    }

}
