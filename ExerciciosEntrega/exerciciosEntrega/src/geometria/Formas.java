package geometria;

public abstract class Formas {
    protected double base, altura;

    public Formas(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public abstract double CalcularArea();
    
    public double getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public abstract String toString();
    

}