package lista8_vetor;
import java.util.Scanner;

public class MainEscola {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        
        // criar a turma.
        Turma turma = new Turma();

        // adicionar alunos no vetor.
        turma.adicionarAluno(new Aluno("Julia", "123", 7.8, 9.0));
        turma.adicionarAluno(new Aluno("Carlos", "765", 8, 8.5));
        turma.adicionarAluno(new Aluno("Beatriz", "290", 10, 6.9));
        
        // do que o prof pediu.
        Aluno pedro = new Aluno("pedro", "243", 5.5, 6.7);
        turma.adicionarAluno(pedro);
        
        // mostrar os alunos no vetor.
        turma.listarAlunos();
        
        System.out.print("deseja buscar um aluno? digite a matricula: ");
        String matricula = e.next();


        // verificar se o aluno está no vetor.
        Aluno encontrado = turma.buscarMatricula(matricula);
        if(encontrado != null){
            encontrado.exibirInfo();
        }else{
            System.out.println("aluno não encontrado!");
        }

    }
}
