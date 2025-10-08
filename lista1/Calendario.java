package lista1;
public class Calendario {
    private int dia,mes,ano;

    public Calendario(int dia,int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int Dia(){
        return dia;
    }
    public int Mes(){
        return mes;
    }
    public int Ano(){
        return ano;
    }

    public String nomeMes(int m){
        switch (m) {
            case 1: return "Janeiro";
            case 2: return "Fevereiro";
            case 3: return "Março";
            case 4: return "Abril";
            case 5: return "Maio";
            case 6: return "Junho";
            case 7: return "Julho";
            case 8: return "Agosto";
            case 9: return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Desembro";
            default: return "Formato inválido";
        }
    }
    
    public void mostrarData(){
        System.out.printf("%d/%s/%d",dia,nomeMes(mes),ano);

    }
    public void anoBissexto(){
        if(ano%4 == 0){
            System.out.println("\nAno Bissexto");
        }else{
            System.out.println("\nNão é Bissexto");
        }
    }
}
