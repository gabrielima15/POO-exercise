public class Professor {
    
    private int matricula;
    private String nomeProfessor, nomeDepartamento;

    public Professor(int matricula, String nomeProfessor, String nomeDepartamento){
        this.matricula = matricula;
        this.nomeDepartamento = nomeDepartamento;
        this.nomeProfessor = nomeProfessor; 
    }
    public  String getNomeProfessor() {
        return nomeProfessor;
    }
    public void setNomeProfessor(String novoNomeProf){
        nomeProfessor = novoNomeProf;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setMtricula(int novaMatricula){
        matricula = novaMatricula;
    }
    public String getNomeDepartamento(){
        return nomeDepartamento;
    }
    public void setNomeDepartamento(String NovoNomeDepartamento){
        nomeDepartamento = NovoNomeDepartamento;
    }

    public void imprimir(){
        System.out.printf("\no nome do professor é %s com a Matrícula %d no Departamento %s\n",nomeProfessor,matricula,nomeDepartamento);
    }
}
