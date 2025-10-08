package lista1;
public class Funcionario {

    private int codigo;
    private String nome,endereco,CPF,telefone;
    private int idade;
    private float salario;

    public Funcionario (int codigo, String nome,String CPF,String endereco,String telefone,int idade,float salario){
        this.telefone = telefone;
        this.idade = idade;
        this.codigo = codigo;
        this.CPF = CPF;
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }
    public String getNome(){
        return nome;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getCPF(){
        return CPF;
    }
    public  String getEndereco(){
        return endereco;
    }
    public String getTelefone(){
        return telefone;
    }
    public int getIdade(){
        return idade;
    }
    public float getSalario(){
        return salario;
    }


    public float calcularSalarioLiquido(){
        return salario - (salario * 11/100f);
    }
    public String toString(){
        return String.format("O %d de %s ele tem %d tem como N° %s \nmora na %s numero do CPF %s\ntem como salário %.2f"
        ,getCodigo(),getNome(),getIdade(),getTelefone(),getEndereco(),getCPF(),getSalario());
    }
}
