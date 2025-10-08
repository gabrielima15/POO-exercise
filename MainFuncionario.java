import lista1.Funcionario;

public class MainFuncionario {
    public static void main(String[] args){

     Funcionario f = new Funcionario(467290, "joão", "1234.5678", "rua Pimentao", "67431-4536", 26, 2500.0f);
     System.out.println(f.toString());
     System.out.println("com o desconto de 11% do INSS ficando assim com: "+ f.calcularSalarioLiquido());
    }
}
