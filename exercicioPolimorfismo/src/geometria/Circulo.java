package geometria;

public class Circulo extends Formas{
    private double circunferencia;

    public Circulo(double circunferencia) {
        super(circunferencia / (2 * 3.1416), circunferencia / (2 * 3.1416));
        this.circunferencia = circunferencia;
    }

    @Override
    public double CalcularArea() {
        double raio = base;
        return 3.1416 * raio * raio;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    @Override
    public String toString() {
        return String.format("\n\n[Círculo] \nRaio: %.2f\nCircunferência: %.2f\nÁrea do Círculo: %.2f.",
            base, circunferencia, CalcularArea());
    }

    
}
