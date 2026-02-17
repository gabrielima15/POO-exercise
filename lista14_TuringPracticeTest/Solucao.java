package lista14_TuringPracticeTest;

import java.util.ArrayList;
import java.util.List;

public class Solucao {
    private List<Integer> ops;

    public Solucao(){
        this.ops = new ArrayList<>();
    }
    

  
    public void adicionar(String valor){
        if ((!valor.equals("C") && !valor.equals("D") && !valor.equals("+"))){
            int v = Integer.parseInt(valor);
            ops.add(v);
        }
    }

    public void verificar(String valor){
       if(valor.equals("C")){
        ops.remove(ops.size()-1);
       }
       else if(valor.equals("D")){
        int ultimo = ops.get(ops.size()-1);
        ops.add(ultimo*2);
       }
       else if(valor.equals("+")){
        int ultimo = ops.get(ops.size()-1);
        int penultimo = ops.get(ops.size()-2);
        ops.add(ultimo + penultimo);
       }
    }

    public void listar(){
        int soma = 0;
        for (Integer l : ops) {
            soma += l;
            System.out.print(l+",");
        }
        System.out.println();
        System.out.println("total: "+soma);

    }
    
}
