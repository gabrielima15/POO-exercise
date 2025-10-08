package lista1;
public class Retangulo {
    
    private int comprimento, largura;

    public Retangulo(int comprimento, int largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int calcularArea(){
        return comprimento*largura;
    }
    public int calcularPerimetro(){
        return comprimento*comprimento + largura*largura;
    }
    public void imprimir(){
        System.out.println("Comprimento é de: "+ comprimento);
        System.out.println("Largura é de: "+ largura);
        System.out.println("Área do Retângulo: "+ calcularArea());
        System.out.println("Perímetro do Retângulo: "+ calcularPerimetro());
    }
}
/*              \**explicação do prof.**\

   para alterar o valor de um atributo que está em  private basta ultizar o get e set.

 * public getCompriment(int comprimento){
 *       if(comprimento > 0){
 *             this.comprimento = comprimento;
 *        }else{
 *            System.out.println("valor incorredo, digite numero positivo.");
 *          }
 *       
 * }
 */