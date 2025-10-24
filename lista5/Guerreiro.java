package lista5;
import java.util.Random;

public class Guerreiro{
    private int codigo,energia;
    private String nome;

    public Guerreiro(int codigo,String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.energia = 5;
    }
    public int getcodigo(){
        return codigo;
    }
    public String getnome(){
        return nome;
    }
    public int getenergia(){
        return energia;
    }
    public void setenergia(int Energia){
        energia = Energia;
    }
    public void setcodigo(int Codigo){
        codigo = Codigo;
    }
    public void setnome(String Nome){
        nome = Nome;
    }

    public int AcessoEnergia(){
        return energia;
    }

    public int incremento(){
        if(energia >= 0 && energia < 5){
            energia+=1;
        }else{
            System.out.println("Energia Máxima atingida.");
        }
        return energia;
    }

    public int decremento(){
        if(energia > 0 && energia <= 5){
            energia-=1;
        }else{
            System.out.println("Sem Energia.");
        }
        return energia;
    }

    // Método de alimentar o guerreiro.
    public int alimentar(){
        System.out.println(nome + " Está se Alimentando...");
        return energia = incremento();
    }

    // Método de atacar o oponente tem sucesso ou não.
    public int atacar(){
        Random gerador = new Random();
        return gerador.nextInt(2);
    }

    // Método de lutar no loop while.
    public void lutar(Guerreiro oponente){
        while(true){
            if (atacar() == 1){
                oponente.decremento();
            }else{
                System.out.println("Ataque do "+ nome + " Não teve Sucesso");
            }

            if(oponente.atacar() == 1){
                decremento();
            }else{
                System.out.println("Ataque do "+ nome + " Não teve Sucesso");
            }

            if(energia == 0){
                System.out.println(nome + " Perdeu!");
                break;
            }
            if(oponente.energia == 0){
                System.out.println(oponente.nome + " Perdeu!");
                break;
            }
            
        }    
    }

    // Método de lutar utilizando recursividade.
    public void lutarecursiva(Guerreiro oponente){
        if(atacar() == 1){
            oponente.decremento();
        }else{
            System.out.println(nome + " Ataque sem Sucesso");
        }
        if(oponente.atacar() == 1){
            decremento();
        }else{
            System.out.println(oponente.nome + " Ataque sem Sucesso");
        }

        if(energia == 0){
            System.out.println(nome + " Perdeu!");
        }
        if(oponente.energia == 0){
            System.out.println(oponente.nome +" Perdeu!");
        }
        if(energia > 0 && oponente.energia > 0){
            lutarecursiva(oponente);
        }
            
        
    }
    // Método de mostrar o estado atual do guerreiro.
    @Override
    public String toString(){
        return String.format("%s com o Código %d tem %d de energia.",nome,codigo,energia);
    }

}