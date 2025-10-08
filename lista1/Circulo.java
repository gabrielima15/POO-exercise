package lista1;
public class Circulo {
    private double raio;
    private final double pi = 3.14151;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea(){
        return pi * raio * raio;
    }
    public double calcularPerimetro(){
        return 2 * pi * raio;
    }
    public void imprimir(){
        System.out.println("o raio é: "+raio);
        System.out.println("o pi é: "+pi);
        System.out.println("Área é: "+calcularArea());
        System.out.println("Perimetro é: "+calcularPerimetro());

    }
}
