package lista12_interface;

import java.util.ArrayList;

public class CadastroFrete {
    private ArrayList<Fretavel> listaFretes;

    public CadastroFrete(){
        this.listaFretes = new ArrayList<>();
    }

    public void adicionarFrete(Fretavel frete){
        listaFretes.add(frete);
    }

    public double valorTotalFrete(){
        double somaTotal = 0;
        for (Fretavel f : listaFretes) {
            somaTotal+= f.calcularFrete();
        }
        System.out.println("valor total do frete é d: "+ somaTotal);
        return somaTotal;
    }
}
