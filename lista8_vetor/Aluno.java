package lista8_vetor;
public class Aluno {
    private String nome,matricula;
    private double nota1,nota2;


    public Aluno(String nome,String matricula,double nota1,double nota2){
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public String getnome(){
        return nome;
    }
    public String Getmatricula(){
        return matricula;
    }
    public double Getnota1(){
        return nota1;
    }
    public  double Getnota2(){
        return nota2;
    }
    public void setnome(String Nome){
        nome = Nome;
    }
    public void Setmatricula(String Matricula){
        matricula = Matricula;
    }
    public void Setnota1(double N1){
        nota1 = N1;
    }
    public void Setnota2(double N2){
        nota2 = N2;
    }

    public double calcularMedia(){
        // double media = (nota1+nota2)/2;
        // return media;
        return (nota1+nota2)/2;
    }

    public String situacao(){
        double media = calcularMedia();
        String situacao;
        if(media >= 7){
            situacao = "aprovado";
        }else{
            situacao = "reprovado";
        }
        return situacao;
    }

    public void exibirInfo(){
        System.out.printf("Nome: %s| matricula: %s | media: %.2f | situacao %s.\n"
        ,nome,matricula,calcularMedia(),situacao());
    }
}
