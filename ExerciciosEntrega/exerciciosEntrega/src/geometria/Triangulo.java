package geometria;

public class Triangulo extends Formas{
    private String tipo;

    public Triangulo(double base, double altura, String tipo) {
        super(base, altura);
        this.tipo = tipo;
    }

    @Override
    public double CalcularArea() {
        return (base * altura) / 2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\n\n[Triangulo] \nBase: " + base + 
        "\nAltura: " + altura + 
        "\nÁrea do Triângulo: " + CalcularArea() + 
        "\nTipo: " +  tipo + ".";
    }


    
}
