package lista8_vetor;

public class Turma {
    private Aluno [] alunos;
    private int quantidade;

    public Turma(){
        this.quantidade = 0;
        alunos = new Aluno[5];
    }

    public void adicionarAluno(Aluno aluno){
       if(quantidade < alunos.length){
            alunos[quantidade] = aluno;
            quantidade++;
       }
    }

    public void listarAlunos(){
        System.out.println("=== Lista de Alunos ===");
        for(int i=0; i< quantidade; i++){
            if(alunos[i] != null){
                alunos[i].exibirInfo();
            }
       }
    }

    public Aluno buscarMatricula(String matricula){
        for(int i=0; i<alunos.length; i++){
            if (alunos[i]!= null && alunos[i].Getmatricula().equals(matricula)){
                return alunos[i];
        
            }
        }
        return null;
    }
}

