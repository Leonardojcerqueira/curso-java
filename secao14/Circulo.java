package secao14;

public class Circulo  extends Forma{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    // Sobrescrita +> respeita retorno, nome e argumento do método
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    
}
