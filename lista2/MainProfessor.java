public class MainProfessor {
    public static void main(String[] args){
        Professor prof = new Professor(28348002, "Carlos jr", "Instituição Estadual");
        prof.imprimir();
        System.out.println("-------------------------------------------------------------------------------------------");
        prof.setNomeProfessor("Lucão jr");
        prof.setMtricula(333678300);
        prof.setNomeDepartamento("Instituição Federal");
        prof.imprimir();
    }
}
