package lista1;
class Quadrado {

    private int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    public int calcularArea(){
        return lado*lado;
    }
    public int calcularPerimetro(){
        return lado*4;
    }
    public void imprimir(){
        System.out.print("\n");
        System.out.println("lado:"+lado);
        System.out.println("Área: " + calcularArea());
        System.out.println("Parâmetro:" + calcularPerimetro());
        System.out.print("\n");
    }

}