package lista10_heranca;

public class Main {
   public static void main(String[] args) {
        EmpresaTransporte empresa = new EmpresaTransporte();
        
        empresa.cadastrarMotorista(new Iniciante("carlos", 10, 1000));
        empresa.cadastrarMotorista(new Experiente("lucas", 15, 1500, 5.0));
        empresa.cadastrarMotorista(new Iniciante("gugu", 5, 400));
        empresa.cadastrarMotorista(new Elite("Ana", 20, 5000, 4.9, 5));
        empresa.cadastrarMotorista(new Experiente("joao", 2, 150, 3.5));
        System.out.println("-=".repeat(50));

        empresa.gerarRelatorioMotoristas();

        System.out.println("-=".repeat(50));

        empresa.calcularPagamentoTotal();

        Motorista existe = empresa.pesquisarMotoristaPeloNome("carlos");

         System.out.println("========".repeat(20));
        if(existe != null){
            System.out.println(existe.toString());
        }else{
            System.out.println("Motorista não encontrado");
        }

        empresa.excluirMotoristaPeloNome("lucas");

        empresa.gerarRelatorioMotoristas();

   }
   
}
